package com.jskierbi.daggertest.dagger.module;

import android.content.Context;
import com.jskierbi.daggertest.App;
import com.jskierbi.daggertest.dagger.annotation.ApplicationScope;
import com.jskierbi.daggertest.dagger.annotation.ForApplication;
import dagger.Module;
import dagger.Provides;

/**
 * Created by jakub on 01/06/15.
 */
@Module
public class AppModule {

  private App mApp;

  public AppModule(App mApp) {
    this.mApp = mApp;
  }

  @Provides
  @ApplicationScope
  App provideApp() {
    return mApp;
  }

  @Provides
  @ForApplication
  Context provideAppContext() {
    return mApp.getApplicationContext();
  }
}
