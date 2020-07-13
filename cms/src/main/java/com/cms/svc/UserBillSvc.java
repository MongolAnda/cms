package com.cms.svc;

import java.util.List;

import com.cms.pojo.ConsumerHistory;

public interface UserBillSvc {
	/**
	 * 
	 * @Title: selectMonthlyBill
	 * @Description: 查询每月用户的消费账单
	 * @param userId 用户手机号
	 * @return
	 */
	public List<ConsumerHistory> selectMonthlyBill(String userId);
	/**
	 * 
	 * @Title: selectBillType
	 * @Description: 使用消费id获取每条数据的消费类型
	 * @param id
	 * @return 通话记录或者短信记录
	 */
	public List<Object> selectBillType(List<ConsumerHistory> bill);
}
