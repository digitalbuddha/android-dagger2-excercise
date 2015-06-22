package com.jskierbi.daggertest.dagger;

import com.jskierbi.daggertest.App;
import com.jskierbi.daggertest.dagger.annotation.ApplicationScope;
import com.jskierbi.daggertest.dagger.module.ActivityModule;
import com.jskierbi.daggertest.dagger.module.AppModule;
import dagger.Component;

/**
 * Created by jakub on 01/06/15.
 */
@Component(modules = {AppModule.class})
@ApplicationScope
public interface AppComponent {

  ActivitySubcomponent plusActivityGraph(ActivityModule activityModule);

  void inject(App app);
}
