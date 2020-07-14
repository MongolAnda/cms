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

import com.cms.pojo.MessageRecord;
import com.cms.svc.QueryMassageSvc;
/**
 * @ClassName: QueryMassageActionTest
 * @Description: 查询短信详单
 * @author xieshixiao
 * @date 2020年7月7日
 * @since JDK 1.8
 */
@RequestMapping("/qm")
@RestController
public class QueryMassageAction {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private QueryMassageSvc queryMassageSvc;
	/**
	 * 
	 * @Title: toQueryMessage
	 * @Description: 跳转到
	 * @param session
	 * @return
	 */
	@GetMapping("/tqm")
	public ModelAndView toQueryMessage(HttpSession session) {
		ModelAndView modelAndView = new ModelAndView("QueryMassage");
		session.setAttribute("msgPage",1);
		return modelAndView;
	}
	@PostMapping("/tqm")
	public ModelAndView toQueryMessagePost(HttpSession session) {
		ModelAndView modelAndView = new ModelAndView("QueryMassageRecordResult");
		session.setAttribute("msgPage",1);
		return modelAndView;
	}
	/**
	 * 
	 * @Title: queryMsgRecord
	 * @Description: 短信记录
	 * @param paramMap
	 * @param session
	 */
	@PostMapping("qmr")
	public ModelAndView queryMsgRecord(@RequestParam Map<String, String> paramMap, HttpSession session) {
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
		List<MessageRecord> msgRecordList= queryMassageSvc.queryMassage(month, year, phone);
		session.setAttribute("msgList", msgRecordList);
		int totalCount = msgRecordList.size();//总数据条数
		int totalPage = 0;//总页数
		if(totalCount%10 == 0) {
			totalPage = totalCount/10;
		}else {
			totalPage = (totalCount/10) + 1;//多加一页
		}
		//设置总页数
		session.setAttribute("msgTotalPage", totalPage);
		if(msgRecordList.size()<=10) {//设置开始和结束
			session.setAttribute("msgStart", 0);
			session.setAttribute("msgEnd", msgRecordList.size()-1);
		}else {
			session.setAttribute("msgStart", 0);
			session.setAttribute("msgEnd", 9);
		}
		//设置首页
		session.setAttribute("msgPage", 1);
		model.setViewName("QueryMassageRecordResult");
		return model;
	}
	/**
	 * 
	 * @Title: msgNextPage
	 * @Description: 短信下一页
	 * @param paramMap
	 * @param session
	 * @return
	 */
	@PostMapping("mnp")
	@ResponseBody
	public ModelAndView msgNextPage(@RequestParam Map<String, String> paramMap,HttpSession session) {
		ModelAndView modelAndView = new ModelAndView();//创建ModelAndView对象
		String pageStr = paramMap.get("page");//获取当前页
		String totalPageStr = paramMap.get("totalPage");//获取总页数
		//转换为int类型
		int page = Integer.valueOf(pageStr);
		int totalPage = Integer.valueOf(totalPageStr);
		//当前页+1
		page = page + 1;
		//设置session
		session.setAttribute("msgPage",page);
		session.setAttribute("msgTotalPage",paramMap.get("totalPage"));
		//model中放入开始和结束参数
		if(page == totalPage) {//最后一页
			List<Object> list = (List<Object>) session.getAttribute("msgList");
			int size = list.size();
			session.setAttribute("msgStart",(page-1)*10);
			session.setAttribute("msgEnd",size-1);
		}else {
			session.setAttribute("msgStart",(page-1)*10);
			session.setAttribute("msgEnd",page*10-1);
		}
		modelAndView.setViewName("QueryMassageRecordResult");
		return modelAndView;
	}
	/**
	 * 短信上一页
	 * @Title: msgPreviousPage
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param paramMap
	 * @param session
	 * @return
	 */
	@PostMapping("mpp")
	@ResponseBody
	public ModelAndView msgPreviousPage(@RequestParam Map<String, String> paramMap,HttpSession session) {
		ModelAndView modelAndView = new ModelAndView();//创建ModelAndView对象
		String pageStr = paramMap.get("page");//获取当前页
		//转换为int类型
		int page = Integer.valueOf(pageStr);
		//当前页+1
		page = page - 1;
		//设置session
		session.setAttribute("msgPage",page);
		session.setAttribute("msgTotalPage",paramMap.get("totalPage"));
		//model中放入开始和结束参数
		session.setAttribute("msgStart",(page-1)*10);
		session.setAttribute("msgEnd",page*10-1);
		modelAndView.setViewName("QueryMassageRecordResult");
		return modelAndView;
	}

}
