package xyz.lmiceli.mvp_dagger2_sample.son;

import dagger.Subcomponent;
import xyz.lmiceli.mvp_dagger2_sample.father.MainActivity;
import xyz.lmiceli.mvp_dagger2_sample.son.ChildActivityModule;

@Subcomponent(modules=ChildActivityModule.class)
public interface ActivityComponent {
  void inject(SecondActivity activity);

  void inject(ChildPresenter presenter);
}
