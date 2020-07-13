package com.cms.svc.impl;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cms.mapper.CallRecordMapper;
import com.cms.mapper.ConsumerBasicInfoMapper;
import com.cms.mapper.ConsumerHistoryMapper;
import com.cms.mapper.MessageRecordMapper;
import com.cms.pojo.ConsumerBasicInfo;
import com.cms.pojo.ConsumerHistory;
import com.cms.svc.UserBillSvc;
@Service
public class UserBillSvcImpl implements UserBillSvc{
	@Autowired
	private ConsumerBasicInfoMapper consumerBasicInfoMapper;
	
	@Autowired
	private ConsumerHistoryMapper consumerHistoryMapper;
	
	@Autowired
	private CallRecordMapper callRecordMapper;
	
	@Autowired
	private MessageRecordMapper messageRecordMapper;
	
	@Override
	public List<ConsumerHistory> selectMonthlyBill(String userId) {
		List<ConsumerHistory> monthlyBill = new ArrayList<ConsumerHistory>();
		ConsumerBasicInfo user = consumerBasicInfoMapper.selectByPhoneNum(userId);
		monthlyBill = consumerHistoryMapper.selectByDateAndRid(user.getId());
		return monthlyBill;
	}

	@Override
	public List<Object> selectBillType(List<ConsumerHistory> bill) {
		List<Object> typeList = new ArrayList<>();
//		for (ConsumerHistory c : bill) {
//				if(messageRecordMapper.selectByPrimaryKey(c.getId()) != null) {
//				//代表短信表中有数据
//				typeList.add(messageRecordMapper.selectByPrimaryKey(c.getId()));
//			}else if(callRecordMapper.selectByPrimaryKey(c.getId()) != null) {
//				//通话记录中有该数据
//				typeList.add(callRecordMapper.selectByPrimaryKey(c.getId()));
//			}else {
//				//没有该条数据
//				typeList.add(0);
//			}
//		}
		for (ConsumerHistory c : bill) {
			if(messageRecordMapper.selectByPrimaryKey(c.getId()) != null) {
				//代表短信表中有数据
				typeList.add(1);
			}else if(callRecordMapper.selectByPrimaryKey(c.getId()) != null) {
				//通话记录中有该数据
				typeList.add(2);
			}else {
				//没有该条数据
				typeList.add(0);
			}
		}
		return typeList;
	}


}
