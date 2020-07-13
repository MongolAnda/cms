//package com.cms.action;
//
//import java.util.Map;
//
//import javax.servlet.http.HttpSession;
//
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.servlet.ModelAndView;
//
//@RestController
//public class QueryMassageActionTest {
//	
//	@GetMapping("/QueryMassage")
//	public ModelAndView index() {
//		ModelAndView modelAndView = new ModelAndView("QueryMassage");
//		return modelAndView;
//	}
//	
//	@PostMapping("qm")
//	public Map<String, String> queryMassage(@RequestParam Map<String, String> paramMap,HttpSession session){
//		String month = paramMap.get("month");
//		System.out.println(month);
//		return null;
//		
//	}
//}
