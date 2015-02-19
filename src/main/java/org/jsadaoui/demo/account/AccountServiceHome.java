package org.jsadaoui.demo.account;

import org.jsadaoui.demo.account.Market.MarketType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Market(Market.MarketType.HOME)
public class AccountServiceHome implements AccountService {

	private final Logger logger = LoggerFactory.getLogger(AccountServiceHome.class);

    @Override
    public void addAccount(MarketType market, Account account) {
    	logger.info("Add account (market={}): {}", market, account);
    }
}
