/**  
 * @Title: UserSvcImpl.java
 * @Package com.cms.svc.impl
 * @author daluosi
 * @date 2020年6月29日
 * @version V1.0  
 */
package com.cms.svc.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cms.mapper.ConsumerHistoryMapper;
import com.cms.mapper.RechargeCardMapper;
import com.cms.mapper.RechargeHistoryMapper;
import com.cms.pojo.ConsumerHistory;
import com.cms.pojo.RechargeCard;
import com.cms.pojo.RechargeHistory;
import com.cms.svc.RechargeHistorySvc;

@Service
public class RechargeHistorySvcImpl implements RechargeHistorySvc{
	@Autowired
	private RechargeHistoryMapper rechargeHistoryMapper;
	@Autowired
	private ConsumerHistoryMapper consumerHistoryMapper;
	@Autowired
	private RechargeCardMapper rechargeCardMapper;
	
	@Override
	public List<RechargeHistory> getRechargeList(Integer userId) {
		List<RechargeHistory> list = rechargeHistoryMapper.selectByConsumer(userId);
		return list;
	}

	@Override
	public List<ConsumerHistory> getUsageList(List<RechargeHistory> list) {
		List<ConsumerHistory> usageList = new ArrayList<ConsumerHistory>();
		for (RechargeHistory rechargeHistory : list) {
			usageList.add(consumerHistoryMapper.selectByPrimaryKey(rechargeHistory.getId()));
		}
		return usageList;
	}

	@Override
	public List<RechargeCard> getCardList(List<RechargeHistory> list) {
		List<RechargeCard> cardList = new ArrayList<RechargeCard>();
		for (RechargeHistory rechargeHistory : list) {
			cardList.add(rechargeCardMapper.selectByPrimaryKey(rechargeHistory.getRechargeCardId()));
		}
		return cardList;
	}
	
	
}
