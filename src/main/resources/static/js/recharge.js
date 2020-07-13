/**
 * 缴费记录上一页
 * @param page
 * @param totalPage
 * @returns
 */
function toRechargePreviousPage(page,totalPage){
	if(page == 1){
		alert("对不起,当前页为首页")
		return;
	}
	var pageData = new Object();
	pageData.page = page;
	pageData.totalPage = totalPage;
	$.post({
		url : "/rh/rpp",
		data : pageData,
		success : function(data) {
				window.location.href="/views/rechargeHistory.jsp"
			}
	})
}
/**
 * 缴费记录下一页
 * @param page
 * @param totalPage
 * @returns
 */
function toRechargeNextPage(page,totalPage){
	var pageData = new Object();
	pageData.page = page;
	pageData.totalPage = totalPage;
	if(page == totalPage){
		alert("对不起,当前页为最后一页")
		return;
	}
	$.post({
		url : "/rh/rnp",
		data : pageData,
		success : function(data) {
			window.location.href="/views/rechargeHistory.jsp"
		}
	})
}