package org.jsadaoui.demo.account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * REST Services for {@link Account} entity
 * 
 * @author Julien Sadaoui
 */
@RestController
@RequestMapping("/api/account")
public class AccountResource {

    @Autowired
    @Strategy
    private AccountService accountService;
    
    @RequestMapping(value = "/{market}", method = RequestMethod.POST)
    ResponseEntity<Void> add(@PathVariable("market") Market.MarketType marketType, @RequestBody Account account) {
    	accountService.addAccount(marketType, account);
    	return new ResponseEntity<Void>(HttpStatus.CREATED);
    }
}
