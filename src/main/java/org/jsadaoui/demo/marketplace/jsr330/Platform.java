package org.jsadaoui.demo.marketplace.jsr330;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.inject.Qualifier;

@Target({ElementType.FIELD,
	ElementType.TYPE,
	ElementType.METHOD,
	ElementType.PARAMETER })
@Retention(RetentionPolicy.RUNTIME)
@Qualifier
public @interface Platform {

	OperatingSystems value();

	public static enum OperatingSystems {
		IOS, 
		ANDROID
	}
}
