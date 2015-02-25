package org.jsadaoui.demo.customer;

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
public class CustomerResourceTest {

	@Autowired
	private WebApplicationContext wac;
	private MockMvc mvc;
	
	@Before
	public void setUp() throws Exception {
		this.mvc = webAppContextSetup(this.wac).build();
	}
	
	@Test
	public void shouldGetJdbcRepository() throws Exception {
		// when
		mvc.perform(get("/api/customer/jdbc")
					.contentType(MediaType.TEXT_PLAIN))
					
					// then
					.andExpect(status().isOk())
					.andExpect(content().contentType(MediaType.TEXT_PLAIN + ";charset=UTF-8"))
					.andExpect(content().string("repository:jdbc"));
	}

	@Test
	public void shouldGetHibernateRepository() throws Exception {
		// when
		mvc.perform(get("/api/customer/hibernate")
					.contentType(MediaType.TEXT_PLAIN))
					
					// then
					.andExpect(status().isOk())
					.andExpect(content().contentType(MediaType.TEXT_PLAIN + ";charset=UTF-8"))
					.andExpect(content().string("repository:hibernate"));
	}
	
	@Test
	public void shouldGetJpaRepository() throws Exception {
		// when
		mvc.perform(get("/api/customer/jpa")
					.contentType(MediaType.TEXT_PLAIN))
					
					// then
					.andExpect(status().isOk())
					.andExpect(content().contentType(MediaType.TEXT_PLAIN + ";charset=UTF-8"))
					.andExpect(content().string("repository:jpa"));
	}
}
