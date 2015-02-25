package org.jsadaoui.demo.marketplace.spring;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;

import org.jsadaoui.demo.Application;
import org.jsadaoui.demo.Constants;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@SpringApplicationConfiguration(classes = Application.class)
@ActiveProfiles(Constants.PROFILE_SPRING)
public class MarketPlaceResourceTest {

	@Autowired
	private WebApplicationContext wac;
	private MockMvc mvc;
	
	@Before
	public void setUp() throws Exception {
		this.mvc = webAppContextSetup(this.wac).build();
	}
	
	@Test
	public void shouldGetIosMarketPlace() throws Exception {
		// when
		mvc.perform(get("/api/marketplace/ios")
					.contentType(MediaType.TEXT_PLAIN))
					
					// then
					.andExpect(status().isOk())
					.andExpect(content().contentType(MediaType.TEXT_PLAIN + ";charset=UTF-8"))
					.andExpect(content().string("ios:apple"));
	}
	
	@Test
	public void shouldGetAndroidMarketPlace() throws Exception {
		// when
		mvc.perform(get("/api/marketplace/android")
					.contentType(MediaType.TEXT_PLAIN))
					
					// then
					.andExpect(status().isOk())
					.andExpect(content().contentType(MediaType.TEXT_PLAIN + ";charset=UTF-8"))
					.andExpect(content().string("android:google"));
	}
}
