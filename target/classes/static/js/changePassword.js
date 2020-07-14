function toChangePassword() {
	window.location.href = '/views/changePassword.jsp';
}
function changePassword() {
	var oldPassword = document.getElementById("oldPassword").value;
	if("" == oldPassword){
		alert("请输入密码")
		return;
	}
	var newPassword1 = document.getElementById("newPassword_1").value;
	var newPassword2 = document.getElementById("newPassword_2").value;
	if(newPassword1 != newPassword2){
		alert("两次输入的密码不一样,请重新输入")
		return;
	}
	var flag = checkPassword(newPassword1);
	if(!flag){
		return;
	}
	if(newPassword1 == oldPassword){
		alert("新密码不能同旧密码一样")
		return;
	}
	var passwordData = new Object();
	passwordData.newPwd1 = newPassword1;
	passwordData.newPwd2 = newPassword2;
	passwordData.oldPwd = oldPassword;
	$.post({
		url : "/pa/cp",
		data : passwordData,
		success : function(data) {
			if(data.status==0){
				window.location.href="/pa/"
			}else{
				alert(data.msg);
				return;
			}
		}
	})
}

function checkPassword(password){
	var num = /^\d{6}$/;
	if("" != password){
		if(num.exec(password)){
			return true;
		}else{
			alert("请输入6位整数");
			return false;
		}
	}else{
		alert("请输入新密码")
	}
}