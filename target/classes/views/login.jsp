<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script type="text/javascript" src="/js/head.js"></script>
<link rel="stylesheet" type="text/css" href="/css/login.css">
 <script type="text/javascript" src="/js/login.js"></script>
<title>欢迎使用中国移动在线服务</title>
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
								  <li role="presentation" class="active"><a href="#">服务密码登录</a></li>
								</ul>
								<div class="input-group input_border">
								  <span class="input-group-addon ">号码</span>
								  <input type="text" id="login_phone" name="user_phone"  size="16" class="form-control" placeholder="请输入手机号码" aria-describedby="sizing-addon2">
								</div>
								<div class="input-group input_border">
								  <span class="input-group-addon "  >密码</span>
								  <input type="password" class="form-control" id="login_pwd" name="user_pwd" size="16" placeholder="请输入服务密码" aria-describedby="sizing-addon2">
								</div>
								<button type="button" class="btn btn-primary input_border" id="login_user_sub" style="width: 100%;margin-bottom: 125px" onclick="loginUser()">登录</button>
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