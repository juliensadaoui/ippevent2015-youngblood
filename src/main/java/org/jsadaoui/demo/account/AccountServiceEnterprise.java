package org.jsadaoui.demo.account;

import org.jsadaoui.demo.account.Market.MarketType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
@Market(Market.MarketType.ENTERPRISE)
public class AccountServiceEnterprise implements AccountService {

	private final Logger logger = LoggerFactory.getLogger(AccountServiceEnterprise.class);
	
    @Override
    public void addAccount(MarketType market, Account account) {
    	logger.info("Add account (market={}): {}", market, account);
    }
}
