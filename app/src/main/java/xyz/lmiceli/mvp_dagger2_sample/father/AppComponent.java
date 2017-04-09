package xyz.lmiceli.mvp_dagger2_sample.father;

import dagger.Component;
import xyz.lmiceli.mvp_dagger2_sample.son.ActivityComponent;
import xyz.lmiceli.mvp_dagger2_sample.son.ChildActivityModule;

@Component(modules = ActivityModule.class)
public interface AppComponent {

  ActivityComponent plus(ChildActivityModule module);
  void inject(MainActivity activity);
  void inject(ParentPresenter presenter);
  // no puedo poner el inject aca si usa cosas que estan en el subcomponente

}
