package xyz.lmiceli.mvp_dagger2_sample.father;

import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;
import xyz.lmiceli.mvp_dagger2_sample.DIManager;

@Module
public class ActivityModule {

  @Provides
  public String providesMySalutation() {
    return "Hello From Activity Module";
  }

  @Provides
  @Singleton
  ParentPresenter providePresenter() {
    ParentPresenter presenter = new ParentPresenter();
    DIManager.getAppComponent().inject(presenter);
    // TODO test presenter
    return presenter;
  }

}