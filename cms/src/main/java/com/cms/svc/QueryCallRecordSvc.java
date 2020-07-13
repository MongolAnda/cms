package com.cms.svc;

import java.util.List;

import com.cms.pojo.CallRecord;


/**
 * @ClassName: QueryCallRecordSvc
 * @Description: 查询通话详单svc接口
 * @author xieshixiao
 * @date 2020年7月9日
 * @since JDK 1.8
 */
public interface QueryCallRecordSvc {
	/**
	 * @Title: queryCallRecordByMonth
	 * @Description: 根据传入年月和电话号查询该月份的通话详单
	 * @param month 查询月份
	 * @param year 查询年份
	 * @param phone 查询电话号码
	 * @return 通话详单实体的集合
	 */
	public List<CallRecord> queryCallRecordByMonth(String month,String year,String phone);
}
