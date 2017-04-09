package xyz.lmiceli.mvp_dagger2_sample.son;

import dagger.Module;
import dagger.Provides;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Singleton;
import xyz.lmiceli.mvp_dagger2_sample.DIManager;

@Module
public class ChildActivityModule {

  @Provides
  public List<String> providesMyToDos() {
    ArrayList<String> strings = new ArrayList<>();
    strings.add("y yo saludo desde el child module.");
    return strings;
  }

  @Provides
  @Singleton ChildPresenter providePresenter() {
    ChildPresenter presenter = new ChildPresenter();
    DIManager.getActivityComponent().inject(presenter);
    // TODO test presenter
    return presenter;
  }

}