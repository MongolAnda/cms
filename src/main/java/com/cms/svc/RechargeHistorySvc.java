package com.cms.svc;

import java.util.List;

import com.cms.pojo.ConsumerHistory;
import com.cms.pojo.RechargeCard;
import com.cms.pojo.RechargeHistory;

public interface RechargeHistorySvc {
	public  List<RechargeHistory> getRechargeList(Integer userId);
	
	public  List<ConsumerHistory> getUsageList(List<RechargeHistory> list);
	
	public  List<RechargeCard> getCardList(List<RechargeHistory> list);
		
}
