<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>处理成功</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
 <body>
  	<table border="1" bgColor="#FFFFFF" borderColor="#000000" width="90%" cellpadding="0" cellspacing="0">
  		<tr align="center">
  			<td colspan="3" ><font size="5">店铺每日统计</font></td>
  		</tr>
  		<tr align="center">
  			<td>店铺ID</td>
  			<td>店铺名称</td>
  			<td>订单总金额</td>
  		</tr>
  		<s:iterator value="list" id="array">
  			<tr align="center">
  				<s:iterator value="#array" id="element">
  					<td><s:property value="#element"/></td>
  				</s:iterator>
  			</tr>
  		</s:iterator>
  	</table>
  </body>
</html>
