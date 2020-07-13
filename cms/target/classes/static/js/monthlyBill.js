function toPreviousPage(page,totalPage){
	if(page == 1){
		alert("对不起,当前页为首页")
		return;
	}
	console.log(page);
	console.log(totalPage);
	var pageData = new Object();
	pageData.page = page;
	pageData.totalPage = totalPage;
	$.post({
		url : "/bill/pp",
		data : pageData,
		success : function(data) {
				window.location.href="/views/monthlyBill.jsp"
			}
	})
}
function toNextPage(page,totalPage){
//	var page = document.getElementById("page").value;//获取当前页数
//	var page = "<%=session.getAttribute("page")%>"; //获取当前页数
	var pageData = new Object();
	pageData.page = page;
	pageData.totalPage = totalPage;
	if(page == totalPage){
		alert("对不起,当前页为最后一页")
		return;
	}
	$.post({
		url : "/bill/np",
		data : pageData,
		success : function(data) {
			window.location.href="/views/monthlyBill.jsp"
		}
	})
}
