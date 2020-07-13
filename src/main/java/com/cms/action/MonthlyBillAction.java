package com.cms.action;

import java.util.ArrayList;
import java.util.List;
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
import com.cms.pojo.ConsumerHistory;
import com.cms.svc.UserBillSvc;
/**
 * @ClassName: MonthlyBillAction
 * @Description: 月账单操作
 * @author 安达
 * @date 2020年7月7日
 * @since JDK 1.8
 */
@RequestMapping("/bill")
@RestController
public class MonthlyBillAction {
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	private UserBillSvc userBillSvc;
	/**
	 * 
	 * @Title: monthlyBill
	 * @Description: 查询月账单
	 * @return	提示信息
	 */
	@RequestMapping(value = "/mb", method = RequestMethod.GET)
	public ModelAndView monthlyBill(HttpSession session) {
		//获取用户手机号
		String userId = (String) session.getAttribute("phone");
		//获取月账单信息
		List<ConsumerHistory> list = new ArrayList<ConsumerHistory>();
		list = userBillSvc.selectMonthlyBill(userId);
		//创建ModelAndView对象
		ModelAndView modelAndView = new ModelAndView("monthlyBill");
		if(list == null) {//如果结果为空提示无消费
			modelAndView.setViewName("monthlyBill");
			modelAndView.addObject("billMsg","该月无消费");
		}else {//不为空时返回月账单和账单类型以及页数
			List<Object> billTypeList = userBillSvc.selectBillType(list);//每个消费记录的类型
			int totalCount = list.size();//总数据条数
			int totalPage = 0;//总页数
			//设置总页数
			if(totalCount% 10== 0) {
				totalPage = totalCount/10;
			}else {
				totalPage = (totalCount/10) + 1;//不足十条多加一页
			}
			String page = "1";//首页
			modelAndView.setViewName("monthlyBill");
			//传往前端的参数
			session.setAttribute("billList",list);
			session.setAttribute("billTypeList",billTypeList);
			modelAndView.addObject("page",page);
			modelAndView.addObject("totalPage",String.valueOf(totalPage));
			modelAndView.addObject("billMsg","查询成功");
			modelAndView.addObject("start",0);
			modelAndView.addObject("end",9);
		}
		return modelAndView;
	}
	/**
	 * 
	 * @Title: previousPage
	 * @Description: 显示上一页的内容
	 * @param paramMap
	 * @param session
	 * @return
	 */
	@PostMapping("pp")
	@ResponseBody
	public ModelAndView previousPage(@RequestParam Map<String, String> paramMap,HttpSession session) {
		ModelAndView modelAndView = new ModelAndView();//创建ModelAndView对象
		String pageStr = paramMap.get("page");//获取当前页
		//转换为int类型
		int page = Integer.valueOf(pageStr);
		//当前页+1
		page = page - 1;
		//设置session,设置页数和总页数
		session.setAttribute("page",page);
		session.setAttribute("totalPage",paramMap.get("totalPage"));
		//model中放入开始和结束参数
		session.setAttribute("start",(page-1)*10);
		session.setAttribute("end",page*10-1);
		//跳转页面
		modelAndView.setViewName("monthlyBill");
		return modelAndView;
	}
	/**
	 * 
	 * @Title: nextPage
	 * @Description: 显示下一页的内容
	 * @param paramMap
	 * @param session
	 * @return
	 */
	@PostMapping("np")
	@ResponseBody
	public ModelAndView nextPage(@RequestParam Map<String, String> paramMap,HttpSession session) {
		ModelAndView modelAndView = new ModelAndView();//创建ModelAndView对象
		String pageStr = paramMap.get("page");//获取当前页
		String totalPageStr = paramMap.get("totalPage");//获取总页数
		//转换为int类型
		int page = Integer.valueOf(pageStr);
		int totalPage = Integer.valueOf(totalPageStr);
		//当前页+1
		page = page + 1;
		//设置session
		session.setAttribute("page",page);
		session.setAttribute("totalPage",paramMap.get("totalPage"));
		//model中放入开始和结束参数
		if(page == totalPage) {//最后一页
			List<Object> list = (List<Object>) session.getAttribute("billList");
			int size = list.size();
			session.setAttribute("start",(page-1)*10);
			session.setAttribute("end",size-1);
		}else {//正常页
			session.setAttribute("start",(page-1)*10);
			session.setAttribute("end",page*10-1);
		}
		modelAndView.setViewName("monthlyBill");
		return modelAndView;
	}
}
