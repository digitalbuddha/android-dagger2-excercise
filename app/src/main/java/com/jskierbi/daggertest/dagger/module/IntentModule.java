package com.jskierbi.daggertest.dagger.module;

import android.app.Activity;
import android.os.Bundle;
import dagger.Module;
import dagger.Provides;

@Module
public class IntentModule {
  public IntentModule(){
  }

  @Provides
  public Bundle provideBundle(Activity context) {
    return context.getIntent().getExtras()==null?new Bundle():context.getIntent().getExtras();
  }
}
