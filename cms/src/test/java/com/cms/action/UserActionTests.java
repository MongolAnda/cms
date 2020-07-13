///**  
// * @Title: UserActionTests.java
// * @Package com.cms.action
// * @author daluosi
// * @date 2020年6月30日
// * @version V1.0  
// */
//package com.cms.action;
//
//import org.junit.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.MediaType;
//import org.springframework.test.annotation.Rollback;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
//import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
//import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
//
///**
// * @ClassName: UserActionTests
// * @Description: TODO(这里用一句话描述这个类的作用)
// * @author daluosi
// * @date 2020年6月30日
// * @since JDK 1.8
// */
//
//public class UserActionTests extends BaseActionTests {
//
//	@Autowired
//	private MockMvc mockMvc;
////  不关闭druid 过滤 才能注释方式加载mocMvc	
////	@Autowired
////	private WebApplicationContext webApplicationContext;
//
//	
////	  @Before public void setUp() throws Exception { mockMvc =
////	  MockMvcBuilders.webAppContextSetup(webApplicationContext).build(); }
//	 
//	@Test
//	@Rollback(false) // 取消回滚
//	public void getSignature() throws Exception {
//		String responseString = mockMvc.perform(MockMvcRequestBuilders.post("/vu")// 请求的url,请求的方法是post
//				.contentType(MediaType.APPLICATION_JSON)// 数据的格式
//				.param("userID", "12345566")// 添加参数
//				.param("pwd", "123456")
//		).andExpect(MockMvcResultMatchers.status().isOk())// 返回的状态是200
//				.andExpect(MockMvcResultMatchers.jsonPath("$.status").value(0)) // 判断某返回值($.数据中key)是否符合预期
//				.andDo(MockMvcResultHandlers.print())// 打印出请求和相应的内容
//				.andReturn().getResponse().getContentAsString();// 将相应的数据转换为字符串
//
//	}
//	
//}
