<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>处理出错</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<style type="text/css">
		.main{margin:20px;}
		.error {margin-top:40px;margin-bottom:20px;font-size:24px;}
	</style>

  </head>
  
  <body>
  	<div class="main">
  		<span class="error">
  			处理出错，请检查上传文件后重试！
  		</span><br/><br/>
  		<a href="/costnew/index.jsp">
			<span class="back">
				&lt;&lt;&nbsp;&nbsp;请点击返回
			</span>
		</a>  
  	</div>
  </body>
</html>
