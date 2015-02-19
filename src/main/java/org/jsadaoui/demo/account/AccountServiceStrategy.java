package org.jsadaoui.demo.account;

import java.util.Set;

import javax.inject.Inject;

import org.jsadaoui.demo.account.Market.MarketType;
import org.springframework.stereotype.Component;

@Component
@Strategy
public class AccountServiceStrategy implements AccountService {

    @Inject
    private Set<AccountService> services;

    @Override
    public void addAccount(MarketType market, Account account) {
    	getAccountService(market).addAccount(market, account);
    }

    AccountService getAccountService(MarketType marketType) {
    	
    	for (AccountService service : services) {
    		Market market = service.getClass().getAnnotation(Market.class);
    		if ((market != null) && (market.value() == marketType)) {
    			return service;
    		}
    	}

    	throw new IllegalArgumentException("Bad market: " + marketType);
    }
}
