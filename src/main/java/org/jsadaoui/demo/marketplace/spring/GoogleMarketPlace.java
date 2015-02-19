package org.jsadaoui.demo.marketplace.spring;

import org.jsadaoui.demo.marketplace.MarketPlace;
import org.jsadaoui.demo.marketplace.Spring;
import org.springframework.stereotype.Component;

@Component
@Platform(Platform.OperatingSystems.ANDROID)
@Spring
public class GoogleMarketPlace implements MarketPlace {

	@Override
	public String toString() {
		return "google";
	}
	
}
