package com.cms.svc.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cms.mapper.CallRecordMapper;
import com.cms.pojo.CallRecord;
import com.cms.svc.QueryCallRecordSvc;

/**
 * @ClassName: QueryCallRecordSvcImpl
 * @Description: 通话详单实现类
 * @author xieshixiao
 * @date 2020年7月9日
 * @since JDK 1.8
 */
@Service
public class QueryCallRecordSvcImpl implements QueryCallRecordSvc {
	
	@Autowired
	private CallRecordMapper callRecordMapper;

	@Override
	public List<CallRecord> queryCallRecordByMonth(String month, String year, String phone) {
		
		//返回结果用集合装载实体
		List<CallRecord> cr=callRecordMapper.queryCallRecordByYearAndMonth(year, month, phone);
		
		//返回实体集合
		return cr;
	}
}
