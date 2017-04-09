package xyz.lmiceli.mvp_dagger2_sample;

import xyz.lmiceli.mvp_dagger2_sample.father.ActivityModule;
import xyz.lmiceli.mvp_dagger2_sample.father.AppComponent;
import xyz.lmiceli.mvp_dagger2_sample.father.DaggerAppComponent;
import xyz.lmiceli.mvp_dagger2_sample.son.ActivityComponent;
import xyz.lmiceli.mvp_dagger2_sample.son.ChildActivityModule;

public class DIManager {
  static AppComponent appComponent;
  private static ActivityComponent child;

  static public AppComponent getAppComponent() {
    if (appComponent == null) {
      appComponent = DaggerAppComponent.builder()
          .activityModule(new ActivityModule())
          .build();
      // we can use the child also, because we created its module in the parent call
      child = appComponent.plus(new ChildActivityModule());
    }
    return appComponent;
  }

  static public ActivityComponent getActivityComponent() {
    if (appComponent == null) {
      // child will be created inside
      getAppComponent();
    }
    return child;
  }

}
