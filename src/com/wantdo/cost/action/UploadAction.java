package com.wantdo.cost.action;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletContext;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.wantdo.cost.model.EcEordermst;
import com.wantdo.cost.model.Province;
import com.wantdo.cost.model.Traceno;
import com.wantdo.cost.model.WspOrdermst;
import com.wantdo.cost.model.WspShops;
import com.wantdo.cost.service.ITracenoService;
import com.wantdo.cost.service.IWspOrdermstService;
import com.wantdo.cost.utils.CostCalcUtil;
import com.wantdo.cost.utils.ExcelUtil;

public class UploadAction extends ActionSupport {

	public static final String[] format = { "快递单号", "快递公司", "快递费用", "收货地址",
			"店铺名称", "订单编号", "用户id", "下单时间", "扫描人员", "扫描时间" };
	public static final String[] errFormat = { "快递单号" };

	private File upload;
	private IWspOrdermstService service;
	private ITracenoService tracenoService;
	public ITracenoService getTracenoService() {
		return tracenoService;
	}
	
	public void setTracenoService(ITracenoService tracenoService) {
		this.tracenoService = tracenoService;
	}

	private ServletContext context;
	private String excelName;
	private String errExcelName;
	private String uploadFileName;
	private String uploadContentType;
	private File temp;
	List<String[]> list;
	List<String[]> err;
	List<String[]> totalList; // 存放正确和错误的订单
	Double total;
	int handleNum;
	int totalNum;
	CostCalcUtil costCalcUtil;

	public UploadAction() {
		super();
		// TODO Auto-generated constructor stub
		context = ServletActionContext.getServletContext();
		list = new ArrayList<String[]>();
		err = new ArrayList<String[]>();

		totalList = new ArrayList<String[]>();

	}

	@Override
	public String execute() {
		// TODO Auto-generated method stub
		
		long start1 = System.currentTimeMillis();
		
		InputStream in = null;
		OutputStream out = null;
		try {
			String uploadDir = context.getRealPath("upload");
			if (!(new File(uploadDir).isDirectory())) {
				new File(uploadDir).mkdirs();
				uploadDir = context.getRealPath("upload");
			}
			temp = new File(uploadDir + File.separator + uploadFileName);
			if (!temp.exists()) {
				temp.createNewFile();
			}
			in = new BufferedInputStream(new FileInputStream(upload));
			out = new FileOutputStream(temp);
			
			costCalcUtil.acquisition(); //设置快递费用的参数
			
			byte[] b = new byte[1024];
			int len = 0;
			while ((len = in.read(b)) != -1) {
				out.write(b, 0, len);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (out != null) {
					out.close();
				}
				if (in != null) {
					in.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		ExcelUtil excelUtil = null;

		try {
			excelUtil = new ExcelUtil(new BufferedInputStream(
					new FileInputStream(temp)));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		String[] col = excelUtil.getColumnData(0, 0);
		List<String> listCol = new ArrayList(Arrays.asList(col));  
		/*aslist()方法返回的是一个Arrays$ArrayList,调用remove或者add方法将报
		java.lang.UnsupportedOperationException，所以得转换为ArrayList*/
		
		tracenoService.deleteTableData(); //删除数据表中的数据	
		tracenoService.saveTracenos(col);	//把订单号存到数据库表中
		
		boolean isWeight = false;
		String[] weightCol = null;
		if (excelUtil.getColumnNum(0) > 1) {
			isWeight = true;
			weightCol = excelUtil.getColumnData(0, 1);
		}
		total = 0.0;
		totalNum = col.length;
		
		
		long start = System.currentTimeMillis();
		
		//List<Object[]> resultList = service.findByTracenos(col);
		List<Object[]> resultList = service.findByTracenosNew();
		
		long end = System.currentTimeMillis();
		System.out
				.println("--------------------------------------------------------------------------");
		System.out.println("查询所用时间：" + (end - start));
		
		List<String> right = new ArrayList<String>();
		
		for (int i = 0; i < resultList.size(); ++i) {
			handleNum = i + 1;
			Object[] str = resultList.get(i);

			/*
			 * if (listObject == null) { return ERROR; }
			 */

			Traceno traceno = (Traceno)	str[0];
			WspOrdermst wspOrdermst = (WspOrdermst) str[1];
			EcEordermst ecEordermst = (EcEordermst) str[2];
			WspShops wspShops = (WspShops) str[3];
			Province province = (Province) str[4];

			Double cost = 0.0;
			if (isWeight) {
				if (weightCol[i] == null || weightCol[i] == "") {
					weightCol[i] = "1.0";
				}
				cost = costCalcUtil.getCostByProno(province.getPrvcname(),
						Double.parseDouble(weightCol[i]));
			} else {
				cost = costCalcUtil.getCostByProno(province.getPrvcname());
			}
			total += cost;
			String costDetail = null;
			if (cost == 0.0) {
				costDetail = "null";
			} else {
				costDetail = String.valueOf(cost);
			}
			String memberIdDetail = "";
			String memberId = wspOrdermst.getMemberid();
			if (memberId == null || memberId.equals("")) {
				memberIdDetail = "null";
			} else {
				memberIdDetail = memberId;
			}
			String[] row = new String[] { traceno.getTraceno(), "申通", costDetail, // 快递单号，快递公司，快递费用
					String.valueOf(ecEordermst.getDeliveraddr()), // 收货地址
					String.valueOf(wspShops.getShopname()), // 店铺名称
					String.valueOf(wspOrdermst.getRelid()), // 订单编号
					memberIdDetail, // 用户id
					String.valueOf(wspOrdermst.getOrderdate()), // 下单时间
					String.valueOf(ecEordermst.getEprintmanname()), // 扫描人员
					String.valueOf(ecEordermst.getEprintdate()) // 扫描时间
			};
			right.add(traceno.getTraceno());
			list.add(row);
		}
		listCol.removeAll(right);//出错的订单列表
		if (!listCol.isEmpty()) {
			
			for (int i=0;i<listCol.size();i++) {
				String[] rowErr = new String[] { listCol.get(i), "出错的订单" };
				err.add(rowErr);
			}
			
			String dateErr = new SimpleDateFormat("yyyy_MM_dd_HH_mm")
					.format(new Date());
			errExcelName = dateErr + "_error.xls";

			String errDir = context.getRealPath("error");
			if (!(new File(errDir)).isDirectory()) {
				new File(errDir).mkdirs();
				errDir = context.getRealPath("error");
			}
			File errFile = new File(errDir + File.separator + errExcelName);
			try {
				if (!errFile.exists()) {
					errFile.createNewFile();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			excelUtil.writeExcel(err, errFormat, errFile);
		}

		String date = new SimpleDateFormat("yyyy_MM_dd_HH_mm")
				.format(new Date());
		excelName = date + "_shentong.xls";
		String downloadDir = context.getRealPath("download");
		if (!(new File(downloadDir)).isDirectory()) {
			new File(downloadDir).mkdirs();
			downloadDir = context.getRealPath("download");
		}
		File excelFile = new File(downloadDir + File.separator + excelName);
		try {
			if (!excelFile.exists()) {
				excelFile.createNewFile();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		totalList.addAll(list);
		totalList.addAll(err);

		excelUtil.writeExcel(totalList, format, excelFile, total);
		
		long end1 = System.currentTimeMillis();
		System.out
				.println("--------------------------------------------------------------------------");
		System.out.println("总共所用时间：" + (end1 - start1));
		
		return SUCCESS;
	}

	public IWspOrdermstService getService() {
		return service;
	}

	public void setService(IWspOrdermstService service) {
		this.service = service;
	}

	public List<String[]> getList() {
		return list;
	}

	public void setList(List<String[]> list) {
		this.list = list;
	}

	public static String[] getFormat() {
		return format;
	}

	public String getExcelName() {
		return excelName;
	}

	public void setExcelName(String excelName) {
		this.excelName = excelName;
	}

	public ServletContext getContext() {
		return context;
	}

	public void setContext(ServletContext context) {
		this.context = context;
	}

	public File getTemp() {
		return temp;
	}

	public void setTemp(File temp) {
		this.temp = temp;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	public File getUpload() {
		return upload;
	}

	public void setUpload(File upload) {
		this.upload = upload;
	}

	public String getUploadFileName() {
		return uploadFileName;
	}

	public void setUploadFileName(String uploadFileName) {
		this.uploadFileName = uploadFileName;
	}

	public String getUploadContentType() {
		return uploadContentType;
	}

	public void setUploadContentType(String uploadContentType) {
		this.uploadContentType = uploadContentType;
	}

	public String getErrExcelName() {
		return errExcelName;
	}

	public void setErrExcelName(String errExcelName) {
		this.errExcelName = errExcelName;
	}

	public List<String[]> getErr() {
		return err;
	}

	public void setErr(List<String[]> err) {
		this.err = err;
	}

	public static String[] getErrformat() {
		return errFormat;
	}

	public int getHandleNum() {
		return handleNum;
	}

	public void setHandleNum(int handleNum) {
		this.handleNum = handleNum;
	}

	public int getTotalNum() {
		return totalNum;
	}

	public void setTotalNum(int totalNum) {
		this.totalNum = totalNum;
	}
	
	public CostCalcUtil getCostCalcUtil() {
		return costCalcUtil;
	}

	public void setCostCalcUtil(CostCalcUtil costCalcUtil) {
		this.costCalcUtil = costCalcUtil;
	}

}
