<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>王道多功能查询系统</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<style type="text/css">
		h2.title {margin-top:35px;margin-bottom:10px;text-align:center;
					text-transform:uppercase;letter-spacing:-0.07em;font-family:sans-serif;
					font-size:2.0em;font-weight:800;}
		.main {margin:30px 10px 30px 10px;padding:10px;}
		fieldset {padding:10px;margin:10px;width:45%;height:200px;
					border:#06c 2px groove;}
		legend {color:#06c;font-weight:800;background:#fff;}
	</style>
  </head>
  <body>
  	<div>
  		<h2 class="title">王道多功能查询系统</h2>
  	</div>
  	<span><a href="/costnew/loginaction.action">编辑快递费用</a></span>
  	<div class="main">
  		<fieldset class="left" align="left">
  			<legend>快递单费用核对</legend>
  			<s:actionerror/>
  			<s:form action="UploadAction" method="post" enctype="multipart/form-data" 
  					cssStyle="padding:5px;">
  				<s:label value="上传文件(注：仅支持以xls,xlsx后缀的excel文件，请按照指定格式上传)">
  				</s:label>
  				<s:label cssStyle="height:0px;"/>
  				<s:file label="文件" name="upload" cssStyle="width:100%;"></s:file>
  				<s:submit value="提交" cssStyle="width:70px;"/>
  			</s:form>
  		</fieldset>
  		<fieldset class="right" align="right">
  			<legend>店铺每日统计</legend>
  			<s:actionerror/>
  			<s:form action="ShopStatAction" method="post" cssStyle="padding:5px;">
  			<s:label value="对店铺每日销售情况进行统计（包括订单总金额，订单总成本，推广费用等信息。部分信息可能存在出入，仅供参考，请以实际信息为准）"></s:label>
  			<s:label cssStyle="height:0px;"/>
  			<s:submit value="查询" cssStyle="width:70px;"/>
  			</s:form>
  		</fieldset>
  	</div>
  </body>
</html>
