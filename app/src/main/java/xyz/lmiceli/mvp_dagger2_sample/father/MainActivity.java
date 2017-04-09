package xyz.lmiceli.mvp_dagger2_sample.father;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import java.util.List;
import javax.inject.Inject;
import xyz.lmiceli.mvp_dagger2_sample.DIManager;
import xyz.lmiceli.mvp_dagger2_sample.Injectable;
import xyz.lmiceli.mvp_dagger2_sample.R;
import xyz.lmiceli.mvp_dagger2_sample.son.ActivityComponent;
import xyz.lmiceli.mvp_dagger2_sample.son.ChildActivityModule;

public class MainActivity extends AppCompatActivity implements Injectable {

  @Inject String saludo;
  @Inject List<String> todos;

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    TextView textView = (TextView) findViewById(R.id.hi);

    AppComponent appComponent = DIManager.getAppComponent();

    appComponent.inject(this);

    textView.setText(saludo);

  }

  @Override public void inject() {
    DIManager.getAppComponent().inject(this);
  }

}
