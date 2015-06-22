package com.jskierbi.daggertest;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.TextView;
import com.jskierbi.daggertest.dagger.module.ActivityModule;
import com.jskierbi.daggertest.dagger.ActivitySubcomponent;
import com.jskierbi.daggertest.dagger.module.IntentModule;
import com.jskierbi.daggertest.dagger.annotation.Port;
import javax.inject.Inject;


public class MainActivity extends ActionBarActivity {

  @Inject
  App mApp;

  @Inject PortStore store;

  @Inject @Port Integer port;

  @Inject DateProvider provider;

  @Inject Bundle bundle;


  private ActivitySubcomponent activityComponent;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    activityComponent =
        ((App) getApplication())
            .getAppComponent()
            .plusActivityGraph(new ActivityModule(this),new IntentModule());

    activityComponent.inject(this);

    setContentView(R.layout.activity_main);
    TextView textView = (TextView) findViewById(R.id.label);
    textView.setText(provider.getDate()+store.get(port).toString());
  }


}
