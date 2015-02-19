package org.jsadaoui.demo.marketplace.spring;

import org.jsadaoui.demo.marketplace.MarketPlace;
import org.jsadaoui.demo.marketplace.Spring;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/marketplace")
@Spring
public class MarketPlaceResource {

	@Autowired
	@Platform(Platform.OperatingSystems.IOS)
	private MarketPlace ios;
	
	@Autowired
	@Platform(Platform.OperatingSystems.ANDROID)
	private MarketPlace android;
	
	@RequestMapping("/ios")
	public String ios() {
		return "ios:" + ios;
	}
	
	@RequestMapping("/android")
	public String android() {
		return "android:" + android;
	}
}
