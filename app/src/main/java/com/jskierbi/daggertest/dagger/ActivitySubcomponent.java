package com.jskierbi.daggertest.dagger;

import com.jskierbi.daggertest.MainActivity;
import com.jskierbi.daggertest.dagger.annotation.ActivityScope;
import com.jskierbi.daggertest.dagger.module.ActivityModule;
import com.jskierbi.daggertest.dagger.module.IntentModule;
import dagger.Subcomponent;

/**
 * Created by jakub on 01/06/15.
 */
@Subcomponent(modules = {ActivityModule.class,IntentModule.class})
@ActivityScope
public interface ActivitySubcomponent {

  void inject(MainActivity mainActivity);
}
