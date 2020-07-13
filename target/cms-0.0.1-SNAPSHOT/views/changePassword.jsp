<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script type="text/javascript" src="/js/head.js"></script>
<link rel="stylesheet" type="text/css" href="/css/login.css">
 <script type="text/javascript" src="/js/changePassword.js"></script>
<title>修改密码</title>
<body>
	<%@include file="head.jsp"%>
	<div class="col-md-2"></div>
	<div class="col-md-8">
		<div class="col-md-3">
			<img  src="/images/yd_logo.png">
		</div>
		<div class="col-md-9"></div>
	
	
		 <div class="col-md-12 " style="margin-top: 30px;height: 500px">
				<div class="box1">
	
					<div class="box2">
					
					<img src="/images/login_background.png">
					
					</div>
					
					<div class="wenzi">
					 <div class="col-md-7"></div>
					 <div class="col-md-5" >
					 	<div class="input_bg">
							<div style="background-color: white; margin:30px 30px 30px 30px ">
								<ul class="nav nav-tabs input_border" >
								  <li role="presentation" class="active"><a href="#">修改密码</a></li>
								</ul>
								<div class="input-group input_border">
								  <span class="input-group-addon ">&nbsp; 原密码&nbsp;&nbsp;</span>
								  <input type="password" id="oldPassword" name="user_phone"  size="16" class="form-control" placeholder="请输入原服务密码" aria-describedby="sizing-addon2">
								</div>
								<div class="input-group input_border">
								  <span class="input-group-addon "  >&nbsp; 新密码&nbsp;&nbsp;</span>
								  <input type="password" class="form-control" id="newPassword_1" name="user_pwd" size="16" placeholder="请输入新服务密码"" aria-describedby="sizing-addon2">
								</div>
								<div class="input-group input_border">
								  <span class="input-group-addon "  >确认密码</span>
								  <input type="password" class="form-control" id="newPassword_2" name="user_pwd" size="16" placeholder="在此确认信服务密码"" aria-describedby="sizing-addon2">
								</div>
								<button type="button" class="btn btn-primary input_border" id="login_user_sub" style="width: 100%;margin-bottom: 125px" onclick="changePassword()">确认</button>
							</div>
					 	</div>
					</div>
					</div>
					</div>
			</div>		
	</div>		
	<div class="col-md-2"></div>
	<div class="col-md-12" style="height: -100%">
		<%@include file="foot.jsp"%>
	</div>
</body>
</html>