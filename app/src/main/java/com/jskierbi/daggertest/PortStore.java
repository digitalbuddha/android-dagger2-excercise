package com.jskierbi.daggertest;

import com.jskierbi.daggertest.dagger.ApplicationScope;
import javax.inject.Inject;

@ApplicationScope
public class PortStore {

  @Inject
  public PortStore() {
  }

  public Integer get(Integer port) {
    return port;
  }
}
