package com.cms.svc.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cms.mapper.MessageRecordMapper;
import com.cms.pojo.MessageRecord;
import com.cms.svc.QueryMassageSvc;

/**
 * @ClassName: QueryMassageSvcImpl
 * @Description: 查询短信详单实现类
 * @author xieshixiao
 * @date 2020年7月8日
 * @since JDK 1.8
 */
@Service
public class QueryMassageSvcImpl implements QueryMassageSvc {
	
	@Autowired
	private MessageRecordMapper messageRecordMapper;
	
	@Override
	public List<MessageRecord> queryMassage(String month,String year,String phone) {
		
		//返回结果用集合装载实体
		List<MessageRecord> mr= messageRecordMapper.queryMassageByYearAndMonth(year, month, phone);
		
		//返回实体集合
		return mr;
	}

}
