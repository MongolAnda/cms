package com.cms.component;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.cms.interceptor.LoginHandlerInterceptor;
/**
 * 
 * @ClassName: LoginHandlerInterceptorConfig
 * @Description: 拦截器配置类
 * @author 安达
 * @date 2020年7月13日
 * @since JDK 1.8
 */
@Component
public class LoginHandlerInterceptorConfig implements WebMvcConfigurer {
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		//拦截请求以及开放清单
		registry.addInterceptor(new LoginHandlerInterceptor()).addPathPatterns("/**").excludePathPatterns
        ("/").excludePathPatterns("/vu").excludePathPatterns("/css/*.css", "/js/*", "/fonts/**", "/images/**");
		WebMvcConfigurer.super.addInterceptors(registry);
	}
}

