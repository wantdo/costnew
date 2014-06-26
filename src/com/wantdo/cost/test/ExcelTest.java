package com.wantdo.cost.test;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.wantdo.cost.utils.ExcelUtil;

public class ExcelTest {
	

	@Test
	public void testGetRowNum() throws Exception{
		InputStream is=new BufferedInputStream(new FileInputStream(new File("d:\\traceno.xlsx")));
		//InputStream is=new BufferedInputStream(new FileInputStream(new File("d:\\goods.xls")));
		ExcelUtil excelUtil=new ExcelUtil(is);
		System.out.println(excelUtil.getRowNum(0));
	}
	
	@Test
	public void testGetColumnNum() throws Exception{
		InputStream is=new BufferedInputStream(new FileInputStream(new File("d:\\traceno.xlsx")));
		//InputStream is=new BufferedInputStream(new FileInputStream(new File("d:\\goods.xls")));
		ExcelUtil excelUtil=new ExcelUtil(is);
		System.out.println(excelUtil.getColumnNum(0));
	}
	
	@Test
	public void testGetAllData() throws Exception{
		InputStream is=new BufferedInputStream(new FileInputStream(new File("d:\\traceno.xlsx")));
		//InputStream is=new BufferedInputStream(new FileInputStream(new File("d:\\goods.xls")));
		ExcelUtil excelUtil=new ExcelUtil(is);
		System.out.println(excelUtil.getAllData(0));
	}
	
	@Test
	public void testGetRowData() throws Exception{
		InputStream is=new BufferedInputStream(new FileInputStream(new File("d:\\test.xlsx")));
		//InputStream is=new BufferedInputStream(new FileInputStream(new File("d:\\goods.xls")));
		ExcelUtil excelUtil=new ExcelUtil(is);
		String[] row=excelUtil.getRowData(0, 0);
		System.out.println(row);
	}
	
	@Test
	public void testGetColumnData() throws Exception{
		InputStream is=new BufferedInputStream(new FileInputStream(new File("d:\\traceno.xlsx")));
		//InputStream is=new BufferedInputStream(new FileInputStream(new File("d:\\goods.xls")));
		ExcelUtil excelUtil=new ExcelUtil(is);
		String[] col=excelUtil.getColumnData(0, 0);
		System.out.println(col);
	}
	
	@Test
	public void testwriteExcel() throws Exception{
		List<String[]> list=new ArrayList<String[]>();
		String[] a={"1","湖北"};
		String[] b={"2","浙江"};
		String[] c={"3","上海"};
		list.add(a);
		list.add(b);
		list.add(c);
		String[] format={"no","地区"};
	}

}
