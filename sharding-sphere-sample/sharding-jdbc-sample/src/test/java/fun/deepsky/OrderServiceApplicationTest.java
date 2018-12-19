package fun.deepsky;


import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = { OrderServiceApplication.class })
public class OrderServiceApplicationTest {

	@Autowired
	private WebApplicationContext wac;
	
	private MockMvc mockMvc;

	@Before
	public void setup() {
		this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
	}

	//@Ignore
	@Test
	public void testAdd() throws Exception {
		//增加记录
		for(int i = 0;i<500;i++) {
			MvcResult result = mockMvc
					.perform(MockMvcRequestBuilders.post("/order/addorder")
							.param("userId", i+"")
							.param("orderId", (int)(Math.random()*1000)+"")
							.param("status", "ok"))
					.andExpect(MockMvcResultMatchers.status().isOk()).andReturn();
			System.out.println(result.getResponse().getContentAsString());
		}
	}
	
	@Ignore
	@Test
	public void testGetAll() throws Exception {
		MvcResult result = mockMvc
				.perform(MockMvcRequestBuilders.get("/order/getAll?num=1&size=500"))
				.andExpect(MockMvcResultMatchers.status().isOk()).andReturn();
		System.out.println(result.getResponse().getContentAsString());
	}
	
	@Ignore
	@Test
	public void testGetByUserId() throws Exception {
		MvcResult result = mockMvc
				.perform(MockMvcRequestBuilders.get("/order/getOrdersByUserId?userId=3"))
				.andExpect(MockMvcResultMatchers.status().isOk()).andReturn();
		System.out.println(result.getResponse().getContentAsString());
	}

	@Ignore
	@Test
	public void testDeleteAll() throws Exception {
		MvcResult result = mockMvc
				.perform(MockMvcRequestBuilders.delete("/order/delAll"))
				.andExpect(MockMvcResultMatchers.status().isOk()).andReturn();
		System.out.println(result.getResponse().getContentAsString());
	}
	
}
