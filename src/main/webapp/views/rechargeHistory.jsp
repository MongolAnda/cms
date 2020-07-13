<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<html>
<head>
<title>缴费记录查询</title>
<script type="text/javascript" src="/js/jquery-3.3.1.js"></script>
<script type="text/javascript" src="/js/head.js"></script>
<script type="text/javascript" src="/js/main.js"></script>
<script type="text/javascript" src="/js/recharge.js"></script>
<style>
	.TitleFont{
		font-family:"Microsoft YaHei",微软雅黑,"MicrosoftJhengHei",华文细黑,STHeiti,MingLiu;
		font-style: italic;
		color: #245269;
	}
</style>
</head>
<body>
<%@include file="head.jsp"%>

	<div>
		<h1 class="TitleFont">缴费记录查询</h1>
	</div>

	<div style="height:50px">
	</div>
	
	<div align="center">
	${rechargeStart}${rechargeEnd}
		<table id="tab1" class="table table-bordered">
			<tr>
				<th>号码</th>
				<th>充值卡号码</th>
				<th>充值金额</th>
				<th>余额</th>
				<th>充值时间</th>
			</tr>
			 <c:forEach var="i" begin="${rechargeStart}" end="${rechargeEnd}">
		   <tr>
			  	<th>${phone}</th>
			  	<th>${cardList.get(i).rechargeCardId}</th>
			  	<th>${cardList.get(i).amount}</th>
			  	<th>${usageList.get(i).balance}</th>
			  	<th><fmt:formatDate value="${usageList.get(i).usageDate}" pattern="yyyy年MM月dd日 HH点mm分ss秒" /></th>
		  </tr>
		  </c:forEach>
		</table>
		 <div class="btn-group " style="margin-left: 50%;" role="group" aria-label="...">
			  <button type="button" class="btn btn-default" onclick="toRechargePreviousPage(${rechargePage},${rechargeTotalPage});">&laquo;</button>
			  <button type="" class="btn btn-default">${rechargePage} / ${rechargeTotalPage}</button>
			  <button type="button" class="btn btn-default" onclick="toRechargeNextPage(${rechargePage},${rechargeTotalPage});">&raquo;</button>
		</div>
	</div>
	<div style="height:200px">
	</div>
	
<%@include file="foot.jsp"%>
</body>
</html>