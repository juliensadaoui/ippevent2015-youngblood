package org.jsadaoui.demo.payment;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;

import org.jsadaoui.demo.Application;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@SpringApplicationConfiguration(classes = Application.class)
public class PaymentResourceTest {

	@Autowired
	private WebApplicationContext wac;
	private MockMvc mvc;
	
	@Before
	public void setUp() throws Exception {
		this.mvc = webAppContextSetup(this.wac).build();
	}
	
	@Test
	public void shouldPayWithVisa() throws Exception {
		// when
		mvc.perform(get("/api/payment/visa")
					.contentType(MediaType.TEXT_PLAIN))
					
					// then
					.andExpect(status().isOk())
					.andExpect(content().contentType(MediaType.TEXT_PLAIN + ";charset=UTF-8"))
					.andExpect(content().string("payment:visa"));
	}

	@Test
	public void shouldPayWithMasterCard() throws Exception {
		// when
		mvc.perform(get("/api/payment/mastercard")
					.contentType(MediaType.TEXT_PLAIN))
					
					// then
					.andExpect(status().isOk())
					.andExpect(content().contentType(MediaType.TEXT_PLAIN + ";charset=UTF-8"))
					.andExpect(content().string("payment:mastercard"));
	}

	@Test
	public void shouldPayWithPaypal() throws Exception {
		// when
		mvc.perform(get("/api/payment/paypal")
					.contentType(MediaType.TEXT_PLAIN))
					
					// then
					.andExpect(status().isOk())
					.andExpect(content().contentType(MediaType.TEXT_PLAIN + ";charset=UTF-8"))
					.andExpect(content().string("payment:paypal"));
	}
}
