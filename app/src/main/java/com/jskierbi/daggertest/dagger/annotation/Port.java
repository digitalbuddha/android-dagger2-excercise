package com.jskierbi.daggertest.dagger.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import javax.inject.Qualifier;

/**
 * Created by Nakhimovich on 6/21/15.
 */
@Retention(RetentionPolicy.RUNTIME)
@Qualifier
public @interface Port {
}
