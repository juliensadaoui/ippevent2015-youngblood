package org.jsadaoui.demo.marketplace;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


import org.jsadaoui.demo.Constants;
import org.springframework.context.annotation.Profile;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Profile(Constants.PROFILE_JSR330)
public @interface Jsr330 {
}
