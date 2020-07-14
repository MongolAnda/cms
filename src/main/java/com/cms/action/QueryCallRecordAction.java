package com.cms.action;

import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import com.cms.pojo.CallRecord;
import com.cms.svc.QueryCallRecordSvc;

/**
 * @ClassName: QueryCallRecordAction
 * @Description: 查询通话详单
 * @author xieshixiao
 * @date 2020年7月9日
 * @since JDK 1.8
 */
@RequestMapping("/qc")
@RestController
public class QueryCallRecordAction {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private QueryCallRecordSvc queryCallRecordSvc;
	
	/**
	 * @Title: index
	 * @Description: 通话详单界面
	 * @return
	 */
	@GetMapping("/tqc")
	public ModelAndView toQueryCallGet(HttpSession session) {
		ModelAndView modelAndView = new ModelAndView("QueryCallRecord");
		session.setAttribute("callPage",1);
		return modelAndView;
	}
	@PostMapping("/tqc")
	public ModelAndView toQueryCallPost(HttpSession session) {
		ModelAndView modelAndView = new ModelAndView("queryCallRecordResult");
		session.setAttribute("callPage",1);
		return modelAndView;
	}
	
	/**
	 * @Title: queryCallRecord
	 * @Description: 从页面读取月份和年份，并将电话号存入session中
	 * @param paramMap 读取到的页面数据
	 * @param session 会话
	 */
	@PostMapping("/qcr")
	public ModelAndView queryCallRecord(@RequestParam Map<String, String> paramMap, HttpSession session) {
		ModelAndView model = new ModelAndView();
		logger.info("用户查询短信年月信息:{}",paramMap);
		
		// 从页面读取月份和年份
		String month = paramMap.get("month");
		String year =paramMap.get("year");
		String phone = (String) session.getAttribute("phone");
		//将年份、月份和电话号码数据存储session中
		session.setAttribute("year", year);
		session.setAttribute("month", month);
		//数据库中读取数据
		List<CallRecord> callRecordList=queryCallRecordSvc.queryCallRecordByMonth(month, year, phone);
		session.setAttribute("callList", callRecordList);
		int totalCount = callRecordList.size();//总数据条数
		int totalPage = 0;//总页数
		if(totalCount%10 == 0) {
			totalPage = totalCount/10;
		}else {
			totalPage = (totalCount/10) + 1;//多加一页
		}
		//设置总页数
		session.setAttribute("callTotalPage", totalPage);
		//设置开始和结束
		if(callRecordList.size()<=10) {
			session.setAttribute("callStart", 0);
			session.setAttribute("callEnd", callRecordList.size()-1);
		}else {
			session.setAttribute("callStart", 0);
			session.setAttribute("callEnd", 9);
		}
		//设置首页
		session.setAttribute("callPage", 1);
		model.setViewName("queryCallRecordResult");
		return model;
	}
	
	/**
	 * 
	 * @Title: callPreviousPage
	 * @Description: 通话记录上一页
	 * @param paramMap
	 * @param session
	 * @return
	 */
	@PostMapping("cpp")
	@ResponseBody
	public ModelAndView callPreviousPage(@RequestParam Map<String, String> paramMap,HttpSession session) {
		ModelAndView modelAndView = new ModelAndView();//创建ModelAndView对象
		String pageStr = paramMap.get("page");//获取当前页
		//转换为int类型
		int page = Integer.valueOf(pageStr);
		//当前页+1
		page = page - 1;
		//设置session
		session.setAttribute("callPage",page);
		session.setAttribute("callTotalPage",paramMap.get("totalPage"));
		//model中放入开始和结束参数
		session.setAttribute("callStart",(page-1)*10);
		session.setAttribute("callEnd",page*10-1);
		modelAndView.setViewName("queryCallRecordResult");
		return modelAndView;
	}
	/**
	 * 
	 * @Title: callNextPage
	 * @Description: 通话下一页
	 * @param paramMap
	 * @param session
	 * @return
	 */
	@PostMapping("cnp")
	@ResponseBody
	public ModelAndView callNextPage(@RequestParam Map<String, String> paramMap,HttpSession session) {
		ModelAndView modelAndView = new ModelAndView();//创建ModelAndView对象
		String pageStr = paramMap.get("page");//获取当前页
		String totalPageStr = paramMap.get("totalPage");//获取总页数
		System.out.println(pageStr);
		System.out.println(totalPageStr);
		//转换为int类型
		int page = Integer.valueOf(pageStr);
		int totalPage = Integer.valueOf(totalPageStr);
		//当前页+1
		page = page + 1;
		//设置session
		session.setAttribute("callPage",page);
		session.setAttribute("callTotalPage",paramMap.get("totalPage"));
		//model中放入开始和结束参数
		if(page == totalPage) {//最后一页
			List<Object> list = (List<Object>) session.getAttribute("callList");
			int size = list.size();
			session.setAttribute("callStart",(page-1)*10);
			session.setAttribute("callEnd",size-1);
		}else {
			session.setAttribute("callStart",(page-1)*10);
			session.setAttribute("callEnd",page*10-1);
		}
		modelAndView.setViewName("queryCallRecordResult");
		return modelAndView;
	}
	
}
