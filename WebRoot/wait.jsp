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
    
    <title>等待页面</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<meta http-equiv="refresh"content="4;url=/costnew/UploadAction.action" >
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<style type="text/css">
		.main{margin:20px;}
		.processing {margin-top:40px;margin-bottom:20px;font-size:24px;}
		.class {font-color:red;font-size:22px;}
	</style>

  </head>
  
  <body>
		<div class="main">
			<span class="processing" >
				正在处理中，请稍候(已处理<s:property value="handleNum"/>/<s:property value="totalNum"/>)。。。
			</span><br/><br/>
			<a href="/costnew/index.jsp">
				<span class="back">
					&lt;&lt;&nbsp;&nbsp;如果长时间无反应，请点击返回
				</span>
			</a>  
		</div>
  </body>
</html>
