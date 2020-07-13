package com.cms.msg;

public interface PasswordMsg {
	/**
	 * 改密状态key
	 */
	String CHANGE_PASSWORD_STATUS = "status";
	/**
	 * 改密消息key
	 */
	String CHANGE_PASSWORD_MSG = "msg";
	/**
	 * 改密成功状态0
	 */
	String CHANGE_PASSWORD_SUCCESS_STATUS = "0";
	/**
	 * 改密失败状态值1:原密码错误
	 */
	String CHANGE_PASSWORD_FAIL_STATUS_1 = "1";
	/**
	 * 改密失败状态值2:两次密码不一
	 */
	String CHANGE_PASSWORD_FAIL_STATUS_2 = "2";
	/**
	 * 改密失败状态值2:密码格式错误
	 */
	String CHANGE_PASSWORD_FAIL_STATUS_3 = "3";
	/**
	 * 失败消息1
	 */
	String CHANGE_PASSWORD_FAIL_MSG_1 = "您输入的密码有误";
	/**
	 * 失败消息2
	 */
	String CHANGE_PASSWORD_FAIL_MSG_2 = "您输入的两次密码不一";
	/**
	 * 失败消息3
	 */
	String CHANGE_PASSWORD_FAIL_MSG_3 = "新密码应为六位数字";
}
