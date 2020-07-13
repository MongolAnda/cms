package com.cms.svc.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cms.mapper.ConsumerBasicInfoMapper;
import com.cms.pojo.ConsumerBasicInfo;
import com.cms.svc.ChangePasswordSvc;
@Service
public class ChangePasswordSvcImpl implements ChangePasswordSvc{
	@Autowired
	private ConsumerBasicInfoMapper consumerBasicInfoMapper;
	@Override
	public void changePassword(String userId,Integer password) {
		ConsumerBasicInfo user = consumerBasicInfoMapper.selectByPhoneNum(userId);
		user.setPassword(password);
		consumerBasicInfoMapper.updateByPrimaryKeySelective(user);
	}

}
