package org.jsadaoui.demo.account;

import javax.inject.Inject;

import org.jsadaoui.demo.Application;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@SpringApplicationConfiguration(classes = Application.class)
public class AccountResourceTest {

	@Inject
	private WebApplicationContext wac;
	private MockMvc mvc;
	
	@Before
	public void setUp() throws Exception {
		this.mvc = webAppContextSetup(this.wac).build();
	}
	
	@Test
	public void shouldAddAccountWithHomeMarket() throws Exception {
		// given
		String content = "{\"name\":\"account1\",\"balance\":\"3000\"}";
		
		// when
		mvc.perform(post("/api/account/HOME")
					.contentType(MediaType.APPLICATION_JSON)
					.content(content.getBytes()))
					// then
					.andExpect(status().isCreated());
	}
	
	@Test
	public void shouldAddAccountWithEnterpriseMarket() throws Exception {
		// given
		String content = "{\"name\":\"account1\",\"balance\":\"3000\"}";
		
		// when
		mvc.perform(post("/api/account/ENTERPRISE")
					.contentType(MediaType.APPLICATION_JSON)
					.content(content.getBytes()))
					// then
					.andExpect(status().isCreated());
	}
	
	@Test
	public void shouldAddAccountWithMediumMarket() throws Exception {
		// given
		String content = "{\"name\":\"account1\",\"balance\":\"3000\"}";
		
		// when
		mvc.perform(post("/api/account/MEDIUM")
					.contentType(MediaType.APPLICATION_JSON)
					.content(content.getBytes()))
					// then
					.andExpect(status().isCreated());
	}
	
	@Test
	public void shouldAddAccountWithBadMarket() throws Exception {
		// given
		String content = "{\"name\":\"account1\",\"balance\":\"3000\"}";
		
		// when
		mvc.perform(post("/api/account/bad")
					.contentType(MediaType.APPLICATION_JSON)
					.content(content.getBytes()))
					// then
					.andExpect(status().isBadRequest());
	}
}
