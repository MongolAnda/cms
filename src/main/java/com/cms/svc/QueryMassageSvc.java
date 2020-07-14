package com.cms.svc;

import java.util.List;

import com.cms.pojo.MessageRecord;

/**
 * @ClassName: QueryMassageSvc
 * @Description: 查询短信详单svc接口
 * @author xieshixiao
 * @date 2020年7月8日
 * @since JDK 1.8
 */
public interface QueryMassageSvc {
	/**
	 * @Title: queryCallRecordByMonth
	 * @Description: 根据传入年月和电话号查询该月份的短信详单
	 * @param month 查询月份
	 * @param year 查询年份
	 * @param phone 查询电话号码
	 * @return 短信详单实体的集合
	 */
	public List<MessageRecord> queryMassage(String month,String year,String phone);
}
