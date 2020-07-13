<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<!--     <script type="text/javascript" src="/js/head.js"></script> -->
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<nav class="navbar navbar-default">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <a href="/index/"><img style="margin-top: 10px" alt="Brand" src="/images/brand.png"></a>
    </div>

    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      <ul class="nav navbar-nav">
        <li><a href="/index/">首页</a></li>
        <li><a href="/rh/trh">缴费记录</a></li>
        <li><a href="#">网上缴费</a></li>
        <li><a href="#">积分查询</a></li>
        <li><a href="#">积分商城</a></li>
        <li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">查询服务<span class="caret"></span></a>
          <ul class="dropdown-menu">
            <li><a href="#"  id="login_user_sub" onclick="monthlyBill()">当月消费记录</a></li>
            <li role="separator" class="divider"></li>
            <li><a href="/qm/tqm">短信详单查询</a></li>
            <li><a href="/qc/tqc">通话详单查询</a></li>
          </ul>
        </li>
      </ul>
      <ul class="nav navbar-nav navbar-right">
      
        	
        <c:if test="${phone == null}">
	        <li><a href="#">
	      		当前用户未登录
		     </a></li>
      	</c:if>
	      	<c:if test="${phone != null }">
	      	<div>
	      		<ul class="nav navbar-nav">
			        <li class="dropdown">
			          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">当前用户:${phone}<span class="caret"></span></a>
			          <ul class="dropdown-menu">
			            <li><a href="#" onclick="toChangePassword()">修改密码</a></li>
			            <li><a href="#" onclick="logout()">退出登录</a></li>
			          </ul>
			        </li>
			      </ul>
	      	</div>
	      	</c:if>
      </ul>
    </div><!-- /.navbar-collapse -->
  </div><!-- /.container-fluid -->
</nav>
</body>
</html>