/**  
 * @Title: UserSvcImpl.java
 * @Package com.cms.svc.impl
 * @author daluosi
 * @date 2020年6月29日
 * @version V1.0  
 */
package com.cms.svc.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cms.mapper.ConsumerBasicInfoMapper;
import com.cms.mapper.ConsumerHistoryMapper;
import com.cms.mapper.RechargeHistoryMapper;
import com.cms.pojo.ConsumerBasicInfo;
import com.cms.svc.UserSvc;

@Service
public class UserSvcImpl implements UserSvc{
	@Autowired
	private ConsumerBasicInfoMapper consumerBasicInfoMapper;
	@Autowired
	private ConsumerHistoryMapper consumerHistoryMapper;
	
	@Autowired
	private RechargeHistoryMapper rechargeHistoryMapper;
	@Override
	public int validateUser(String userId, Integer password) {
		ConsumerBasicInfo user = consumerBasicInfoMapper.selectByPhoneNum(userId);
		if(user.getPassword().equals(password)) {
			return 1;
		}else if(consumerBasicInfoMapper.selectByPhoneNum(userId) == null){
			return 2;
		}
		return 0;
	}
	@Override
	public Integer selectIdByPhone(String phone){
		return consumerBasicInfoMapper.selectIdByPhone(phone);
	}
}
