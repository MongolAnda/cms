package com.cms.action;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.cms.msg.PasswordMsg;
import com.cms.svc.ChangePasswordSvc;
import com.cms.svc.UserSvc;
@RequestMapping("/pa")
@RestController
public class PwdAction {

	@Autowired
	private UserSvc userSvc;
	@Autowired
	private ChangePasswordSvc changePasswordSvc;
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	/**
	 * 
	 * @Title: changePwd
	 * @Description: 修改密码
	 * @param paramMap
	 * @param session
	 * @return
	 */
	@PostMapping("/cp")//创建一个会话
	@ResponseBody
	public Map<String, String> changePwd(@RequestParam Map<String, String> paramMap,HttpSession session) {
		Map<String, String> map = new HashMap<>();
		Integer oldPassword = Integer.valueOf(paramMap.get("oldPwd"));
		Integer newPassword = Integer.valueOf(paramMap.get("newPwd1"));
		String userId = (String) session.getAttribute("phone");
		int result = userSvc.validateUser(userId, oldPassword);
		//用户名或者密码错误
		if (result == 0) {
			map.put(PasswordMsg.CHANGE_PASSWORD_STATUS, PasswordMsg.CHANGE_PASSWORD_FAIL_STATUS_1);
			map.put(PasswordMsg.CHANGE_PASSWORD_MSG, PasswordMsg.CHANGE_PASSWORD_FAIL_MSG_1);
		}
		// 登录成功
		if (result == 1) {
			map.put(PasswordMsg.CHANGE_PASSWORD_STATUS, PasswordMsg.CHANGE_PASSWORD_SUCCESS_STATUS);
			changePasswordSvc.changePassword(userId, newPassword);
		}
		return map;
	}
	/**
	 * 
	 * @Title: toChangePasswordSuccess
	 * @Description: 跳转到改密成功页面
	 * @return
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView toChangePasswordSuccess() {
		ModelAndView modelAndView = new ModelAndView("changePasswordSuccess");
		return modelAndView;
	}
}
