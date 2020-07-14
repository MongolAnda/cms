//$(function() {
//	init();
//})

//var init = function(){
//	$.ajax({
//		url : "gu",
//		type : "delete",
//		success : function(data) {
//			$("#main").html(data.userName);
//		}
//	})
//}

$(function() {
	$("#toMonthlyBill").click(function() {
		monthlyBill();
	});
})

function monthlyBill() {
	 window.location.href = '/bill/mb';
}

function logout(){
	$.ajax({
		url : "/cs",
		type : "GET",
		success : function(data) {
			alert("成功退出");
			window.location.href = '/lo';
		}
	})
}
