//package com.cms.svc;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.junit.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//
//import com.cms.BaseTests;
//import com.cms.pojo.ConsumerHistory;
//import com.cms.pojo.RechargeHistory;
//
///**
// * 
// * @ClassName: UserSvcTests
// * @Description: 测试用户操作功能
// * @author 安达
// * @date 2020年7月7日
// * @since JDK 1.8
// */
//public class UserSvcTests {
//
//	@Autowired
//	private UserSvc userSvc;
//	@Autowired
//	private UserBillSvc userBillSvc;
//	@Autowired
//	private QueryCallRecordSvc callRecordSvc;
//	@Autowired
//	private RechargeHistorySvc rechargeHistorySvc;
//	
//	@Test
//    public void testLogin(){
//		String phoneNum = "18804096636";
//		Integer password = new Integer(123123);
//		int result = userSvc.validateUser(phoneNum, password);
//		System.out.println("**************************");
//		System.out.println(result);
//		System.out.println("**************************");
//    }
//	
//	
//	@Test
//	public void testMonthlyBill(){
//		List<ConsumerHistory> list = userBillSvc.selectMonthlyBill("18804096636");
//		for (ConsumerHistory consumerHistory : list) {
//			System.out.println("************");
//			System.out.println(consumerHistory.getBalance());
//		}
//	}
//	
//	@Test
//	public void testBillType(){
//		List<ConsumerHistory> billList = new ArrayList<>();
//		billList = userBillSvc.selectMonthlyBill("18804096636");
//		List<Object> typeList = new ArrayList<>();
//		typeList = userBillSvc.selectBillType(billList);
//		for (Object i : typeList) {
//			System.out.println(i);
//		}
//	}
//	
//	/*
//	 * @Test public void testRechargeHistory(){ List<RechargeHistory> list =
//	 * ((Object) rechargeHistorySvc).rechargeHistoryList(1); for (RechargeHistory
//	 * rechargeHistory : list) {
//	 * System.out.println(rechargeHistory.getRechargeCardId()); } }
//	 */
//	
//	
//}
