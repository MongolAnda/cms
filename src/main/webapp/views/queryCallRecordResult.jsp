<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<html>
<head>
<title>通话详单查询</title>
<script type="text/javascript" src="/js/jquery-3.3.1.js"></script>
<script type="text/javascript" src="/js/head.js"></script>
<script type="text/javascript" src="/js/main.js"></script>

<style>
	.TitleFont{
		font-family:"Microsoft YaHei",微软雅黑,"MicrosoftJhengHei",华文细黑,STHeiti,MingLiu;
		/* font-style: italic; */
		color: #245269;
	}
</style>

</head>
<body>
<%@include file="head.jsp"%>

	<div>
		<h1 class="TitleFont" style="margin-left: 44%">通话详单查询</h1>
	</div>

	<div align="center" >
		<form name="reg_testdate" class="basic-grey" method="post">
			<select name="YYYY" id="year" >
				<option value="">请选择 年</option>
			</select> <select name="MM" id="month" >
				<option value="">选择 月</option>
			</select>
			<input type="submit" id="QueryCallRecord_sub" onclick="queryCallRecord()" value="查询">
		</form>
	</div>
	
	<div style="height:50px">
	</div>
	<div align="center">
	<c:if test="${not empty callList}">
		<table id="tab1" class="table table-bordered">
			<tr>
				<th>主叫</th>
				<th>被叫</th>
				<th>通话时长</th>
				<th>通话日期</th>
				<th>通话消费</th>
			</tr>
			 <c:forEach var="i" begin="${callStart}" end="${callEnd}">
		   <tr>
			  	<th>${callList.get(i).callFrom}</th>
			  	<th>${callList.get(i).callTo}</th>
			  	<th>${callList.get(i).callTime}</th>
			  	<th><fmt:formatDate value="${callList.get(i).callDate}" pattern="yyyy年MM月dd日 HH点mm分ss秒" /></th>
			  	<th>${callList.get(i).callMoney}</th>
		  </tr>
		  </c:forEach>
		</table>
		 <div class="btn-group " style="margin-left: 50%;" role="group" aria-label="...">
			  <button type="button" class="btn btn-default" onclick="toCallPreviousPage(${callPage},${callTotalPage});">&laquo;</button>
			  <button type="" class="btn btn-default">${callPage} / ${callTotalPage}</button>
			  <button type="button" class="btn btn-default" onclick="toCallNextPage(${callPage},${callTotalPage});">&raquo;</button>
		</div>
		  </c:if>
	</div>
	<div style="height:200px">
	</div>
	
<%@include file="foot.jsp"%>
</body>
</html>