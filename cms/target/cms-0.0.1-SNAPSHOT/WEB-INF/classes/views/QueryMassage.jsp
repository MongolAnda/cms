<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<html>
<head>
<title>短信查询</title>
<script type="text/javascript" src="/js/jquery-3.3.1.js"></script>
<script type="text/javascript" src="/js/QueryMassageRecord.js"></script>
<script type="text/javascript" src="/js/QueryMassageRecordResult.js"></script>
<script type="text/javascript" src="/js/head.js"></script>
<script type="text/javascript" src="/js/main.js"></script>

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
		<h1 class="TitleFont" style="margin-left: 44%">短信详单查询</h1>
	</div>

	<div align="center">
		<form name="reg_testdate" class="basic-grey">
			<select name="YYYY" id="year" >
				<option value="">请选择 年</option>
			</select> 
			<select name="MM" id="month" >
				<option value="">选择 月</option>
			</select>
			<input type="submit" id="QueryMassage_sub" value="查询">
		</form>
	</div>
	
	<div style="height:50px">
	</div>
	<div align="center">
	<c:if test="${not empty msgList}">
		<table id="tab2" class="table table-bordered">
		<tr>
			<th >短信类型</th>
			<th >发送人</th>
			<th >收件人</th>
			<th >发送时间</th>
			<th >短信消费</th>
			<th >发送状态</th>
		</tr>
		<c:forEach var="i" begin="${msgStart}" end="${msgEnd}">
		   <tr>
		   
			  	<th>
			  	<c:if test="${msgList.get(i).messageType} == 0">短信</c:if>
			  	<c:if test="${msgList.get(i).messageType} == 1">彩信</c:if>
			  	</th>
			  	<th>${msgList.get(i).messageFrom}</th>
			  	<th>${msgList.get(i).messageFromTo}</th>
			  	<th><fmt:formatDate value="${msgList.get(i).messageDate}" pattern="yyyy年MM月dd日 HH点mm分ss秒" /></th>
			  	<th>${msgList.get(i).messageMoney}</th>
			  	
			  	<th>
			  	<c:if test="${msgList.get(i).messageStatus} == 0">短信</c:if>
			  	<c:if test="${msgList.get(i).messageStatus} == 0">短信</c:if>
			  	</th>
		  </tr>
		  </c:forEach>
		</table>
		<div class="btn-group " style="margin-left: 0%;" role="group" aria-label="...">
			  <button type="button" class="btn btn-default" onclick="toMsgPreviousPage(${msgPage},${msgTotalPage});">&laquo;</button>
			  <button type="" class="btn btn-default">${msgPage} / ${msgTotalPage}</button>
			  <button type="button" class="btn btn-default" onclick="toMsgNextPage(${msgPage},${msgTotalPage});">&raquo;</button>
		</div>
	</c:if>
	</div>
	
	<div style="height:200px">
	</div>
	
<%@include file="foot.jsp"%>
</body>
</html>