$(function() {
	init();
})

var init = function(){
	$.ajax({
		url : "gu",
		type : "delete",
		success : function(data) {
			$("#main").html(data.userName);
		}
	})
}
