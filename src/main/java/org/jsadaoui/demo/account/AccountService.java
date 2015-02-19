package org.jsadaoui.demo.account;

import org.jsadaoui.demo.account.Market.MarketType;

public interface AccountService {
	
    void addAccount(MarketType market, Account account);
}

