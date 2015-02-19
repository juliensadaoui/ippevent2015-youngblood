package org.jsadaoui.demo.account;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import org.springframework.beans.factory.annotation.Qualifier;

@Target({FIELD, TYPE, METHOD, PARAMETER})
@Retention(RUNTIME)
@Qualifier
public @interface Market {
	
	MarketType value();
    
    public static enum MarketType {
    	HOME,
    	MEDIUM,
    	ENTERPRISE
    }
}
