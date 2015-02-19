package org.jsadaoui.demo.marketplace.jsr330;

import javax.inject.Named;

import org.jsadaoui.demo.marketplace.Jsr330;
import org.jsadaoui.demo.marketplace.MarketPlace;

@Named
@Platform(Platform.OperatingSystems.IOS)
@Jsr330
public class AppleMarketPlace implements MarketPlace {

	@Override
	public String toString() {
		return "apple";
	}
}
