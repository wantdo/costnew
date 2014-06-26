package com.wantdo.cost.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.Region;

public class ExcelUtil {
	
	private List<String[]> dataList=new ArrayList<String[]>();
	private Workbook workbook;
	
	public ExcelUtil() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ExcelUtil(InputStream is) {
		super();
		try {
			workbook=WorkbookFactory.create(is);
		} catch (InvalidFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		getAllData(0);
	}
	
	/**
	 * 
	* @Title: getRowNum 
	* @Description: 返回Exceel最大行，实际行数要加1
	* @param @param sheetIndex
	* @param @return    设定文件 
	* @return int    返回类型 
	* @throws
	 */
	public int getRowNum(int sheetIndex){
		Sheet sheet=workbook.getSheetAt(sheetIndex);
		return sheet.getLastRowNum();
	}
	
	public int getColumnNum(int sheetIndex){
		Sheet sheet=workbook.getSheetAt(sheetIndex);
		Row row=sheet.getRow(0);
		if (row!=null&&row.getLastCellNum()>0) {
			return row.getLastCellNum();
		}
		return 0;
	}
	
	/**
	 * 
	* @Title: getAllData 
	* @Description: 取excel所有数据
	* @param @param sheetIndex
	* @param @return    设定文件 
	* @return List<String[]>    返回类型 
	* @throws
	 */
	public List<String[]> getAllData(int sheetIndex){
		int columnNum=0;
		Sheet sheet=workbook.getSheetAt(sheetIndex);
		if (sheet.getRow(0)!=null) {
			columnNum=sheet.getRow(0).getLastCellNum()-sheet.getRow(0).getFirstCellNum();
		}
		if (columnNum>0) {
			for(Row row:sheet){
				String[] singleRow=new String[columnNum];
				int n=0;
				for(int i=0;i<columnNum;++i){
					Cell cell=row.getCell(i, Row.CREATE_NULL_AS_BLANK);
					switch (cell.getCellType()) {
					case Cell.CELL_TYPE_BLANK:
						singleRow[n]="";
						break;
					case Cell.CELL_TYPE_BOOLEAN:
						singleRow[n]=Boolean.toString(cell.getBooleanCellValue());
						break;
					case Cell.CELL_TYPE_NUMERIC:
						if (DateUtil.isCellDateFormatted(cell)) {
							singleRow[n]=String.valueOf(cell.getDateCellValue());
						}else {
							cell.setCellType(cell.CELL_TYPE_STRING);
							String temp=cell.getStringCellValue();
							if (temp.indexOf(".")>-1) {
								singleRow[n]=String.valueOf(new Double(temp)).trim();
							}else {
								singleRow[n]=temp.trim();
							}
						}
						break;
					case Cell.CELL_TYPE_STRING:
						singleRow[n]=cell.getStringCellValue().trim();
						break;
					case Cell.CELL_TYPE_ERROR:
						singleRow[n]="";
						break;
					case Cell.CELL_TYPE_FORMULA:
						cell.setCellType(cell.CELL_TYPE_STRING);
						singleRow[n]=cell.getStringCellValue();
						if (singleRow[n]!=null) {
							singleRow[n]=singleRow[n].replaceAll("#N/A", "").trim();
						}
						break;
					default:
						singleRow[n]="";
						break;
					}
					++n;
				}
				if ("".equals(singleRow[0])) {
					continue;
				}
				dataList.add(singleRow);
			}
		}
		return dataList;
	}
	
	/**
	 * 
	* @Title: getRowData 
	* @Description: 获取某一行数据
	* @param @param sheetIndex
	* @param @param rowIndex
	* @param @return    设定文件 
	* @return String[]    返回类型 
	* @throws
	 */
	public String[] getRowData(int sheetIndex,int rowIndex){
		if (rowIndex>this.getRowNum(sheetIndex)) {
			return null;
		}else {
			return dataList.get(rowIndex);
		}
	}
	
	/**
	 * 
	* @Title: getColumnData 
	* @Description: 获取某一列数据
	* @param @param sheetIndex
	* @param @param colIndex
	* @param @return    设定文件 
	* @return String[]    返回类型 
	* @throws
	 */
	public String[] getColumnData(int sheetIndex,int colIndex){
		String[] dataArray=null;
		if (colIndex>getColumnNum(sheetIndex)) {
			return  null;
		}else {
			if (dataList!=null&&dataList.size()>0) {
				dataArray=new String[getRowNum(sheetIndex)+1];
				int index=0;
				for(String[] rowData:dataList){
					if (rowData!=null) {
						dataArray[index]=rowData[colIndex];
						++index;
					}
				}
			}
			return dataArray;
		}
	}
	
	//获取表头样式
	public HSSFCellStyle getHeaderStyle(HSSFWorkbook workbook){
		//生成一个样式
        HSSFCellStyle style=workbook.createCellStyle();
       //设置这些样式
        style.setFillForegroundColor(HSSFColor.SKY_BLUE.index);
        style.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);
        style.setBorderBottom(HSSFCellStyle.BORDER_THIN);
        style.setBorderLeft(HSSFCellStyle.BORDER_THIN);
        style.setBorderRight(HSSFCellStyle.BORDER_THIN);
        style.setBorderTop(HSSFCellStyle.BORDER_THIN);
        style.setAlignment(HSSFCellStyle.ALIGN_CENTER);
       //生成一个字体
        HSSFFont font=workbook.createFont();
        font.setColor(HSSFColor.VIOLET.index);
        font.setFontHeightInPoints((short)16);
        font.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);
       //把字体应用到当前的样式
        style.setFont(font);
        return style;
	}
	
	//获取内容样式
	public HSSFCellStyle getContentStyle(HSSFWorkbook workbook){
		//生成一个样式
        HSSFCellStyle style=workbook.createCellStyle();
       //设置这些样式
        style.setAlignment(HSSFCellStyle.ALIGN_CENTER);
        style.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER); 
        return style;
	}
	
	//获取合计样式
		public HSSFCellStyle getTotalStyle(HSSFWorkbook workbook){
			//生成一个样式
	        HSSFCellStyle style=workbook.createCellStyle();
	       //设置这些样式
	        style.setAlignment(HSSFCellStyle.ALIGN_CENTER);
	        style.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER); 
	        //生成一个字体
	        HSSFFont font=workbook.createFont();
	        font.setColor(HSSFColor.VIOLET.index);
	        font.setFontHeightInPoints((short)14);
	        font.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);
	       //把字体应用到当前的样式
	        style.setFont(font);
	        return style;
		}
	
	public void writeExcel(List<String[]> list,String[] format,File excelFile,Double total){
		HSSFWorkbook hWorkbook=new HSSFWorkbook();
		HSSFSheet sheet=hWorkbook.createSheet("sheet1");
		for(int i=0;i<format.length;++i){
			if (i!=3) {
				sheet.setColumnWidth(i, 5000);
			}else {
				sheet.setColumnWidth(i, 10000);
			}
		}
		//获取第一行
		HSSFRow header=sheet.createRow(0);
		sheet.addMergedRegion(new Region(0,(short)0,0,(short)(format.length-1)));
		HSSFCell headerCell=header.createCell(0);
		headerCell.setCellValue("快递单费用核对");
		headerCell.setCellStyle(getHeaderStyle(hWorkbook));
		//获取第二行
		HSSFRow row=sheet.createRow(1);
		HSSFCellStyle contentStyle=getContentStyle(hWorkbook);
		for(int i=0;i<format.length;++i){
			HSSFCell secCell=row.createCell(i);
			secCell.setCellValue(format[i]);
			secCell.setCellStyle(contentStyle);
		}
		//将list中的数据添加到excel中
		for(int j=0;j<list.size();++j){
			HSSFRow row2=sheet.createRow(j+2);
			String[] temp=list.get(j);
			for(int k=0;k<temp.length;++k){
				HSSFCell contentCell=row2.createCell(k);
				contentCell.setCellValue(temp[k]);
				contentCell.setCellStyle(contentStyle);
			}
		}
		//获取最后一行
		HSSFRow footer=sheet.createRow(2+list.size());
		sheet.addMergedRegion(new Region(2+list.size(),(short)0,2+list.size(),(short)1));
		HSSFCell footerCell=footer.createCell(0);
		footerCell.setCellValue("费用合计");
		footerCell.setCellStyle(getTotalStyle(hWorkbook));
		HSSFCell totalCell=footer.createCell(2);
		totalCell.setCellValue(String.valueOf(total));
		totalCell.setCellStyle(getTotalStyle(hWorkbook));
		try {
			FileOutputStream outStream=new FileOutputStream(excelFile);
			hWorkbook.write(outStream);
			outStream.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void writeExcel(List<String[]> list,String[] format,File excelFile){
		HSSFWorkbook hWorkbook=new HSSFWorkbook();
		HSSFSheet sheet=hWorkbook.createSheet("sheet1");
		for(int i=0;i<format.length;++i){
			sheet.setColumnWidth(i, 5000);
		}
		//获取第一行
		HSSFRow row=sheet.createRow(0);
		HSSFCellStyle contentStyle=getContentStyle(hWorkbook);
		for(int i=0;i<format.length;++i){
			HSSFCell secCell=row.createCell(i);
			secCell.setCellValue(format[i]);
			secCell.setCellStyle(contentStyle);
		}
		//将list中的数据添加到excel中
		for(int j=0;j<list.size();++j){
			HSSFRow row2=sheet.createRow(j+1);
			String[] temp=list.get(j);
			for(int k=0;k<temp.length;++k){
				HSSFCell contentCell=row2.createCell(k);
				contentCell.setCellValue(temp[k]);
				contentCell.setCellStyle(contentStyle);
			}
		}
		try {
			FileOutputStream outStream=new FileOutputStream(excelFile);
			hWorkbook.write(outStream);
			outStream.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
