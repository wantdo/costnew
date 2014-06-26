package com.wantdo.cost.action;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class DownloadAction extends ActionSupport {
	
	private String fileName;

	@Override
	public String execute(){
		// TODO Auto-generated method stub
		return SUCCESS;
	}
	
	public InputStream getDownloadFile() throws Exception{
		if (new String(fileName.getBytes(),"UTF-8").contains("error")) {
			return new FileInputStream(ServletActionContext.getServletContext().getRealPath("error")+"\\"+
					new String(fileName.getBytes(),"UTF-8"));
		}else {
			return new FileInputStream(ServletActionContext.getServletContext().getRealPath("download")+"\\"+
					new String(fileName.getBytes(),"UTF-8"));
		}
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName=fileName;
	}

	
	

}
