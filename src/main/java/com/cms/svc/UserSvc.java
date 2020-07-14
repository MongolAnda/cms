package com.cms.svc;

public interface UserSvc {
	
	/**
	 * 
	 * @Title: validateUser
	 * @Description:  通过用户名和密码验证用户是否可以登录
	 * @param userTab
	 * @return 0手机号或密码错误；1,可正常登录； 2,账户错误,注销或冻结
	 */
	public int validateUser(String userId, Integer pwd);
	/**
	 * 
	 * @Title: selectIdByPhone
	 * @Description: 通过手机号查询id
	 * @param phone
	 * @return
	 */
	public Integer selectIdByPhone(String phone);
	
}
