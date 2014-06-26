package com.wantdo.cost.test;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class Test {

	/** 
	 * @Title: main 
	 * @Description: TODO
	 * @param @param args    设定文件 
	 * @return void    返回类型 
	 * @throws 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fname="2013_12_27申通(只计首重).xls";
		String encode="";
		try {
			encode=URLEncoder.encode(fname, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(encode);
	}

}
