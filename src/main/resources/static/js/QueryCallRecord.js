/**
 * 
 */
//$(function() {
//	$("#QueryCallRecord_sub").click(function() {
//		queryCallRecord();
//	});
//})
/**
 * 通话记录
 * @returns
 */
function queryCallRecord() {
	// 读取页面月份
	var month = $("#month").val();

	var year = $("#year").val();

	// 对象接受数据
	var oj = new Object();
	oj.month = month;
	oj.year = year;

	// 向后台传输对象
	$.post({
		url : "/qc/qcr",
		data : oj,
//		success : function(data) {
//			window.location.reload();
//			//window.location.href = '/qc/tqc';
//		}
	})
}
/**
 * 跳转到通话记录上一页
 * @param page
 * @param totalPage
 * @returns
 */
function toCallPreviousPage(page,totalPage){
	if(page == 1){
		alert("对不起,当前页为首页")
		return;
	}
	var pageData = new Object();
	pageData.page = page;
	pageData.totalPage = totalPage;
	$.post({
		url : "/qc/cpp",
		data : pageData,
		success : function(data) {
				window.location.href="/views/QueryCallRecord.jsp"
			}
	})
}
/**
 * 跳转到通话记录下一页
 * @param page
 * @param totalPage
 * @returns
 */
function toCallNextPage(page,totalPage){
	var pageData = new Object();
	pageData.page = page;
	pageData.totalPage = totalPage;
	if(page == totalPage){
		alert("对不起,当前页为最后一页")
		return;
	}
	$.post({
		url : "/qc/cnp",
		data : pageData,
		success : function(data) {
			window.location.href="/views/QueryCallRecord.jsp"
		}
	})
}
function YYYYMMDDstart(){   

    //先给年下拉框赋内容   
    var y  = new Date().getFullYear();   
    for (var i = (y-30); i < (y+30); i++) //以今年为准，前30年，后30年   
            document.reg_testdate.YYYY.options.add(new Option(" "+ i +" 年", i));   

    //赋月份的下拉框
    for (var i = 1; i < 13; i++)   
            document.reg_testdate.MM.options.add(new Option(" " + i + " 月", i));   

    document.reg_testdate.YYYY.value = y;   
    document.reg_testdate.MM.value = new Date().getMonth() + 1;   

}   


if(document.attachEvent)   
window.attachEvent("onload", YYYYMMDDstart);   
else   
window.addEventListener('load', YYYYMMDDstart, false);   