package com.cms.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
/**
 * 
 * @ClassName: LoginHandlerInterceptor
 * @Description: 登录拦截
 * @author 安达
 * @date 2020年7月12日
 * @since JDK 1.8
 */
public class LoginHandlerInterceptor implements HandlerInterceptor{
	/**
	 * 方法调用之前,拦截用户是否登录
	 */
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		HttpSession session = request.getSession();//获取session
		Object phone = session.getAttribute("phone");//获取手机号
		if(phone!=null) {
			return true;
		}
		response.sendRedirect("/");
		return false;
	}
	/**
	 * 执行方法为调转视图之前
	 */
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
	}
	/**
	 * 请求结束之后调用
	 */
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
	}
}
