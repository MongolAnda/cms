<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript" src="/js/head.js"></script>
<script type="text/javascript" src="/js/monthlyBill.js"></script>
<meta charset="UTF-8">
<title>月消费账单</title>
</head>
<body>
<%@include file="head.jsp"%>
<%--  	月账单:
	${billMsg}
	<c:forEach items="${billList}" var="i" >
     	${i}
     </c:forEach>
     <br>
	<c:forEach items="${billTypeList}" var="i" >
     	${i}
     </c:forEach>  --%>
     <div class="page-header">
	  <h1>用户:${phone}的星级为${billList.get(0).consumerLevel} 套餐为:V${billList.get(0).packageId}  </h1>
	</div>
     <table class="table table-striped">
     	  <tr>
		    <th>余额</th>
		    <th>时间</th>
		    <th>消费金额</th>
		    <th>类型</th>
		  </tr>
		  <c:forEach var="i" begin="${start}" end="${end}">
		   <tr>
			  	<th>${billList.get(i).balance}</th>
			  	<th><fmt:formatDate value="${billList.get(i).usageDate}" pattern="yyyy年MM月dd日 HH点mm分ss秒" /></th>
			  	<th>${billList.get(i).usageAmount}</th>
			  	<th>
			  		<c:if test="${billTypeList.get(i) == 1}">短信</c:if>
			  		<c:if test="${billTypeList.get(i) == 2}">通话</c:if>
			  		<c:if test="${billTypeList.get(i) == 0}">充值</c:if>
			  	</th>
		  </tr>
		  </c:forEach>
	 </table>
	 <div >
		 <div class="btn-group " style="margin-left: 47%;" role="group" aria-label="...">
		  <button type="button" class="btn btn-default" onclick="toPreviousPage(${page},${totalPage});">&laquo;</button>
		  <button type="button" class="btn btn-default">${page} / ${totalPage}</button>
		  <button type="button" class="btn btn-default" onclick="toNextPage(${page},${totalPage});">&raquo;</button>
		</div>
	 </div>
<%@include file="foot.jsp"%>
</body>
</html>