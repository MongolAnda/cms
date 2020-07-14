package com.cms.action;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * 
 * @ClassName: IndexAction
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 安达
 * @date 2020年7月6日
 * @since JDK 1.8
 */
@RequestMapping("/index")
@RestController
public class IndexAction {

	/**
	 * 
	 * @Title: index
	 * @Description: 访问主页
	 * @return
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView index() {
		ModelAndView modelAndView = new ModelAndView("main");
		return modelAndView;
	}
	
}
