package xyz.lmiceli.mvp_dagger2_sample.son;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import javax.inject.Inject;
import xyz.lmiceli.mvp_dagger2_sample.DIManager;
import xyz.lmiceli.mvp_dagger2_sample.Injectable;
import xyz.lmiceli.mvp_dagger2_sample.R;

public class SecondActivity extends AppCompatActivity implements Injectable {

  @Inject ChildPresenter presenter;

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_second);

    ActivityComponent child = DIManager.getActivityComponent();

    child.inject(this);
  }

  @Override public void inject() {
    DIManager.getActivityComponent().inject(this);
  }
}
