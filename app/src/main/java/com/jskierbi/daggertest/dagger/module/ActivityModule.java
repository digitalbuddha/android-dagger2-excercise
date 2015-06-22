package com.jskierbi.daggertest.dagger.module;

import android.app.Activity;
import android.app.FragmentManager;
import android.content.Context;
import android.view.LayoutInflater;
import com.jskierbi.daggertest.dagger.annotation.ActivityScope;
import com.jskierbi.daggertest.dagger.annotation.ForActivity;
import com.jskierbi.daggertest.dagger.annotation.Port;
import dagger.Module;
import dagger.Provides;

@Module
public class ActivityModule {

  private Activity mActivity;

  public ActivityModule(Activity mActivity) {
    this.mActivity = mActivity;
  }

  @Provides
  @ActivityScope
  public FragmentManager provideFragmentManager() {
    return mActivity.getFragmentManager();
  }

  @Provides
  @ActivityScope
  public LayoutInflater provideLayoutInflater() {
    return LayoutInflater.from(mActivity);
  }

  @Provides
  @Port
  public Integer providePortNumber() {
    return 80;
  }

  @Provides
  @ForActivity
  public Context provideActivityContext() {
    return mActivity;
  }

  @Provides Activity provideActivity(){
    return mActivity;
  }

}
