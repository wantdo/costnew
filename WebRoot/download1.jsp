<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">
<title>处理成功</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<script src="http://img.jb51.net/jslib/jquery/jquery1.3.2.js"></script>
<script type="text/javascript">
	$(document).ready(function() {
		$("tr").addClass("odd");
		$("tr:even").addClass("even"); //奇偶变色，添加样式
	});
</script>
<style>
#hacker tr:hover {
	background-color: #AB82FF;
}

.odd {
	background-color: #F5FFFA;
}

.even {
	background-color: #FFF68F;
}
</style>
</head>

<body id="main">
	<br />
	<div>
		<s:label value="处理成功!请点击下载："></s:label>
		<a
			href="DownloadAction.action?fileName=<s:property value="excelName"/>"
			target="_blank"> <s:property value="excelName" />
		</a><br /> <br />
	</div>
	<div>
		<a href="/costnew/index.jsp"> <span class="back">
				&lt;&lt;&nbsp;&nbsp;点击继续处理 </span>
		</a><br /> <br />
	</div>
	<table border="1" width="95%" id="hacker" cellpadding="0"
		cellspacing="0">
		<tr align="center">
			<td colspan="10" bgcolor="#458B00"><font size="5">快递单费用核对</font></td>
		</tr>
		<tr align="center">
			<td>快递单号</td>
			<td>快递公司</td>
			<td>快递费用</td>
			<td>收货地址</td>
			<td>店铺名称</td>
			<td>订单编号</td>
			<td>用户id</td>
			<td>下单时间</td>
			<td>扫描人员</td>
			<td>扫描时间</td>
		</tr>
		<s:iterator value="list" id="array">
			<tr align="center">
				<s:iterator value="#array" id="element">
					<td><s:property value="element" /></td>
				</s:iterator>
			</tr>
		</s:iterator>
		<s:if test="errExcelName!=null">
			<s:iterator value="err" id="errArray">
				<tr align="center">
					<td align="left"><s:property value="#errArray[0]" /></td>
					<td align="center" colspan="9"><s:property
							value="#errArray[1]" /></td>
				</tr>
			</s:iterator>
		</s:if>
		<tr align="center">
			<td colspan="1"><font size="4">费用合计</font></td>
			<td colspan="9"><s:property value="total" /></td>
		</tr>
	</table>
	<br />
	<br />
</body>
</html>
