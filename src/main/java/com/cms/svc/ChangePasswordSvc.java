package com.cms.svc;

public interface ChangePasswordSvc {
	/**
	 * 
	 * @Title: changePassword
	 * @Description: 修改密码操作
	 * @param userId
	 * @param password
	 */
	public void changePassword(String userId,Integer password);
}
