package com.jskierbi.daggertest;

import android.content.Context;
import com.jskierbi.daggertest.dagger.ForActivity;
import java.util.Date;
import javax.inject.Inject;

public class DateProvider {

  private Date date;
  @Inject @ForActivity Context context;
  @Inject
  public DateProvider() {

    date = new Date();
  }

  public Date getDate()
  {
    return date;
  }
}
