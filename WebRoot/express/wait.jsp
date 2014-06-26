<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
  <head>
    
    <title>等待页面</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<meta http-equiv="refresh"content="2;url=/costnew/loginaction.action" >
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
				正在处理中，请稍候。。。
			</span><br/><br/>
			<a href="/costnew">
				<span class="back">
					&lt;&lt;&nbsp;&nbsp;如果长时间无反应，请点击返回
				</span>
			</a>  
		</div>
  </body>
</html>
