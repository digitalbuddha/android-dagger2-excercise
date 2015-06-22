package com.jskierbi.daggertest;

import android.app.Application;
import com.jskierbi.daggertest.dagger.AppComponent;
import com.jskierbi.daggertest.dagger.module.AppModule;
import com.jskierbi.daggertest.dagger.DaggerAppComponent;

public class App extends Application {

  private AppComponent mAppComponent;

  @Override
  public void onCreate() {
    super.onCreate();

    mAppComponent = DaggerAppComponent.builder()
        .appModule(new AppModule(this))
        .build();

    mAppComponent.inject(this);
  }

  public AppComponent getAppComponent() {
    return mAppComponent;
  }
}

