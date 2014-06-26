<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
  <head>
    
    <title>登陆</title>
    
	<meta name="pragma" content="no-cache">
	<meta name="cache-control" content="no-cache">
	<meta name="expires" content="0">    
	<meta name="keywords" content="keyword1,keyword2,keyword3">
	<meta name="description" content="This is my page">
	<link rel="stylesheet" type="text/css" href="css/styles.css">
	<link rel="stylesheet" type="text/css" href="css/login.css">
	<link rel="stylesheet" type="text/css" href="css/font.css">
	<link rel="stylesheet" type="text/css" href="css/header.css">
	<script src="js/jquery.min.js"  type="text/javascript"></script>
  </head>
  
  <body>
  	<a href="/costnew">主页</a>
  	<div class="container">
  		<header>
  		</header>
  		<section>
  			<div id="container_section">
  				<a id="toregister" class="hiddenanchor"></a>
  				<a id="tologin" class="hiddenanchor"></a>
  				<div id="wrapper">
  					<div id="login" class="animate form">
  						<form action="loginaction" autocomplete="on" method="post">
  							<h1>用户登录</h1>
  							<p>
  								<label class="icon-user"  for="person.username">请输入用户名</label>
  								<input id="person.username" name="person.username" type="text"
  									placeholder="username" required="required" maxlength="20"
  									pattern="\w{4,20}" title="用户名由字母、数字、下划线组成，长度为4到20位"/>
 							</p>
 							<p>
  								<label class="icon-key"  for="person.password">请输入密码</label>
  								<input id="person.password" name="person.password" type="password"
  									placeholder="password" required="required" maxlength="20"
  									pattern="\w{5,20}" title="密码由字母、数字、下划线组成，长度为5到20位"/>
 							</p>
 							<p class="login button">
 								<input type="submit" value="登陆" />
 								<input type="button" class="btn" onclick="history.go(-1)" value="返回"></input>
 							</p>
 							<p class="change_link">
 								没有账号？
 								<a class="to_register" href="#toregister">注册</a>
 							</p>
  						</form>
  					</div>
  				</div>
  			</div>
  		</section>
  	</div>
  </body>
</html>
