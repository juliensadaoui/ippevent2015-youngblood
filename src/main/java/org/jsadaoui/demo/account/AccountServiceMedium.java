package org.jsadaoui.demo.account;

import org.jsadaoui.demo.account.Market.MarketType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
@Market(Market.MarketType.MEDIUM)
public class AccountServiceMedium implements AccountService {

	private final Logger logger = LoggerFactory.getLogger(AccountServiceMedium.class);

    @Override
    public void addAccount(MarketType market, Account account) {
    	logger.info("Add account (market={}): {}", market, account);
    }
}
