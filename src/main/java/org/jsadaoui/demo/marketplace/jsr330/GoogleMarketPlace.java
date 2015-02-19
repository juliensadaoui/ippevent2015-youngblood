package org.jsadaoui.demo.marketplace.jsr330;

import javax.inject.Named;

import org.jsadaoui.demo.marketplace.Jsr330;
import org.jsadaoui.demo.marketplace.MarketPlace;

@Named
@Platform(Platform.OperatingSystems.ANDROID)
@Jsr330
public class GoogleMarketPlace implements MarketPlace {

	@Override
	public String toString() {
		return "google";
	}
	
}
