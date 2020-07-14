/**  
 * @Title: UserAction.java
 * @Package com.cms.action
 * @author daluosi
 * @date 2020年6月28日
 * @version V1.0  
 */
package com.cms.action;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.cms.msg.UserMsg;
import com.cms.svc.UserSvc;

/**
 * @ClassName: UserAction
 * @Description: 用户操作
 * @author daluosi
 * @date 2020年6月28日
 * @since JDK 1.8
 */
@RestController
public class UserAction {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private UserSvc userSvc;

	/**
	 * 
	 * @Title: index
	 * @Description: 登陆页面
	 * @param request
	 * @return
	 */
	@GetMapping("/")
	public ModelAndView index(HttpSession session) {
		ModelAndView modelAndView = new ModelAndView("login");
		//每次登陆时消除session的数据
		session.invalidate();
		return modelAndView;
	}
	private static Pattern PASSWORD_PATTERN = Pattern.compile("[0-9]{6}");
	/**
	 * 
	 * @Title: validateUser
	 * @Description: 	验证账号密码
	 * @param paramMap  使用Object类型 因为参数中有两种数据类型
	 * @param session	
	 * @return 返回验证结果 
	 */
	@PostMapping("vu")//创建一个会话
	@ResponseBody
	public Map<String, String> validateUser(@RequestParam Map<String, String> paramMap,HttpSession session) {
		logger.info("用户登陆信息:{}", paramMap);
		// 获取登录信息
		String userId = paramMap.get("userId");//获取登录用户名(使用手机号)
		String passwordStr = paramMap.get("pwd");//密码
		String rule = "[1][3578][0-9]{9}";
		// 验证手机号
		Pattern p = Pattern.compile(rule);
		Matcher matcher = p.matcher(userId);
		boolean b = matcher.matches();
		Map<String, String> map = new HashMap<>();
		// 手机号不合法，则返回并提示
		if (!b) {
			map.put(UserMsg.LOGIN_STATUS_KEY, UserMsg.LOGIN_FAIL_STATUS);
			map.put(UserMsg.LOGIN_STATUS_MSG_KEY, UserMsg.LOGIN_ID_VAL_FAIL_MSG);
			return map;
		}
		
		//验证密码为六位数,不合法则返回并提示
		p = PASSWORD_PATTERN;
		matcher = p.matcher(passwordStr);
		b = matcher.matches();
		Integer password = Integer.valueOf(passwordStr);
		if(!b) {
			map.put(UserMsg.LOGIN_STATUS_KEY, UserMsg.LOGIN_FAIL_STATUS);
			map.put(UserMsg.LOGIN_STATUS_MSG_KEY, UserMsg.LOGIN_PWD_VAL_FAIL_MSG);
			return map;
		}
		
		//验证手机号或者密码是否正确
		int result = userSvc.validateUser(userId, password);
		if (result == 0) {
			map.put(UserMsg.LOGIN_STATUS_KEY, UserMsg.LOGIN_FAIL_STATUS);
			map.put(UserMsg.LOGIN_STATUS_MSG_KEY, "手机号和密码有误");
		}

		// 登录成功
		if (result == 1) {
			// 认证与用户信息一般情况下时分属两张表，所以需要再查询一下用户的数据保存到session中
            
			session.setAttribute("phone",userId);
			map.put(UserMsg.LOGIN_STATUS_KEY, UserMsg.LOGIN_SUCCESS_STATUS);
		}

		if (result == 2) {
			map.put(UserMsg.LOGIN_STATUS_KEY, UserMsg.LOGIN_FAIL_STATUS);
			map.put(UserMsg.LOGIN_STATUS_MSG_KEY, "手机号已冻结或注销");
		}
		return map;
	}
	
	@GetMapping("cs")
	public void  clearSession(HttpSession session) {
		session.invalidate();
	}
	/**
	 * 
	 * @Title: logout
	 * @Description: 退出登录
	 * @param session
	 * @return
	 */
	@GetMapping("lo")
	public ModelAndView  logout(HttpSession session) {
		ModelAndView modelAndView = new  ModelAndView("login");
		//销毁session
		session.invalidate();
		return modelAndView;
	}
	
	
}
