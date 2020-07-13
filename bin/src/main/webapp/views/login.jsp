<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>欢迎访问移动服务平台</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	<link rel="stylesheet" type="text/css" href="/css/login.css">
	
	<!-- <style type="text/css">
	
	</style> -->
	<script type="text/javascript" src="/js/jquery-3.3.1.js"></script>
    <script type="text/javascript" src="/js/login.js"></script>
  </head>
 
  <body>
  <div id="container">
	<div id="header">
		<div id="menu"><ul> 	
			<li><a href="">首页</a></li> <li class="menuDiv"></li> 
			<li><a href="">积分商城</a></li> <li class="menuDiv"></li> 
			<li><a href="">关于我们</a></li> 
		</ul></div>
	</div> 
	<div id="pagebody">
	  <table>
		<tr><td>
		   <fieldset background="/images/login.jpg">
			  <legend align="center"><b>网上营业厅</b>
			  </legend>
		      <table class="tt">
			      <tr><td><img src="images/login.jpg"></td></tr>
			      
				  <tr><td><div id="user" style="display:block">
				  
				  	<table cellSpacing=1 cellPadding=0 width=200 border=0 align="center" class="tt">
		  				<tr><th bgcolor="#99CCFF">手机号：</th>
		  				<td><input type="text" id="login_phone" name="user_phone"  size="16"/></td></tr>
						<tr><th bgcolor="#99CCFF">服务密码：</th>
						<td><input type="password" id="login_pwd" name="user_pwd" size="16"/></td></tr>
						<tr><td colspan="2" align="center"></td></tr>
						<tr><td colspan="2" align="center"><input type="submit" id="login_user_sub" value="登录"></input>&nbsp;<input type="reset" value="重置" ></input></td></tr>
				    </table>
				  </div></td></tr>  
			  </table>           
		    </fieldset>
		</td></tr>
	   </table>
	</div>
	<div id="footer"></div>
  </div> 
  </body>
</html>
