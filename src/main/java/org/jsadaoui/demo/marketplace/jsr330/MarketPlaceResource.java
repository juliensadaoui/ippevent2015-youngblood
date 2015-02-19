package org.jsadaoui.demo.marketplace.jsr330;

import javax.inject.Inject;

import org.jsadaoui.demo.marketplace.Jsr330;
import org.jsadaoui.demo.marketplace.MarketPlace;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/marketplace")
@Jsr330
public class MarketPlaceResource {

	@Inject
	@Platform(Platform.OperatingSystems.IOS)
	private MarketPlace ios;
	
	@Inject
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
