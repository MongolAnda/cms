/**  
 * @Title: UserAction.java
 * @Package com.cms.action
 * @author daluosi
 * @date 2020年6月28日
 * @version V1.0  
 */
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

import com.cms.pojo.ConsumerHistory;
import com.cms.pojo.RechargeCard;
import com.cms.pojo.RechargeHistory;
import com.cms.svc.RechargeHistorySvc;
import com.cms.svc.UserSvc;
@RequestMapping("/rh")
@RestController
public class RechargeHistoryAction {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private UserSvc userSvc;
	@Autowired
	private RechargeHistorySvc rechargeHistorySvc;
	/**
	 * 
	 * @Title: rechargeHistory
	 * @Description: 跳转到充值记录
	 * @param session
	 * @return
	 */
	@GetMapping("/trh")
	public ModelAndView rechargeHistory(HttpSession session) {
		ModelAndView modelAndView = new ModelAndView();
		String phone = (String) session.getAttribute("phone");//获取手机号码
		Integer id = userSvc.selectIdByPhone(phone);//获取手机号id
		List<RechargeHistory> rechargeList = rechargeHistorySvc.getRechargeList(id);//缴费记录
		List<ConsumerHistory> usageList = rechargeHistorySvc.getUsageList(rechargeList);//消费记录
		List<RechargeCard> cardList = rechargeHistorySvc.getCardList(rechargeList);//充值卡
		//设置参数
		session.setAttribute("rechargeList", rechargeList);
		session.setAttribute("usageList", usageList);
		session.setAttribute("cardList", cardList);
		int totalCount = rechargeList.size();//总数据条数
		int totalPage = 0;//总页数
		if(totalCount%10 == 0) {
			totalPage = totalCount/10;
		}else {
			totalPage = (totalCount/10) + 1;//多加一页
		}
		session.setAttribute("rechargeTotalPage", totalPage);
		if(rechargeList.size()<=10) {//设置开始和结束
			session.setAttribute("rechargeStart", 0);
			session.setAttribute("rechargeEnd", rechargeList.size()-1);
		}else {
			session.setAttribute("rechargeStart", 0);
			session.setAttribute("rechargeEnd", 9);
		}
		//设置首页
		session.setAttribute("rechargePage", 1);
		modelAndView.setViewName("rechargeHistory");
		return modelAndView;
	}
	/**
	 * 
	 * @Title: rechargePreviousPage
	 * @Description: 缴费前一页
	 * @param paramMap
	 * @param session
	 * @return
	 */
	@PostMapping("rpp")
	@ResponseBody
	public ModelAndView rechargePreviousPage(@RequestParam Map<String, String> paramMap,HttpSession session) {
		ModelAndView modelAndView = new ModelAndView();//创建ModelAndView对象
		String pageStr = paramMap.get("page");//获取当前页
		//转换为int类型
		int page = Integer.valueOf(pageStr);
		//当前页+1
		page = page - 1;
		//设置session
		session.setAttribute("rechargePage",page);
		session.setAttribute("rechargeTotalPage",paramMap.get("totalPage"));
		//model中放入开始和结束参数
		session.setAttribute("rechargeStart",(page-1)*10);
		session.setAttribute("rechargeEnd",page*10-1);
		modelAndView.setViewName("rechargeHistory");
		return modelAndView;
	}
	/**
	 * 
	 * @Title: rechargeNextPage
	 * @Description: 缴费后一页
	 * @param paramMap
	 * @param session
	 * @return
	 */
	@PostMapping("rnp")
	@ResponseBody
	public ModelAndView rechargeNextPage(@RequestParam Map<String, String> paramMap,HttpSession session) {
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
		session.setAttribute("rechargePage",page);
		session.setAttribute("rechargeTotalPage",paramMap.get("totalPage"));
		//model中放入开始和结束参数
		if(page == totalPage) {//最后一页
			List<Object> list = (List<Object>) session.getAttribute("rechargeList");
			int size = list.size();
			session.setAttribute("rechargeStart",(page-1)*10);
			session.setAttribute("rechargeEnd",size-1);
		}else {
			session.setAttribute("rechargeStart",(page-1)*10);
			session.setAttribute("rechargeEnd",page*10-1);
		}
		modelAndView.setViewName("rechargeHistory");
		return modelAndView;
	}
}
