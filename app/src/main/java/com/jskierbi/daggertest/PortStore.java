package com.jskierbi.daggertest;

import android.content.Context;
import com.jskierbi.daggertest.dagger.ApplicationScope;
import com.jskierbi.daggertest.dagger.ForApplication;
import javax.inject.Inject;

@ApplicationScope
public class PortStore {
  @Inject @ForApplication Context context;

  @Inject
  public PortStore() {
  }

  public Integer get(Integer port) {
    return port;
  }
}
