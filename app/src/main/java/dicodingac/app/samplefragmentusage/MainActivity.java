package dicodingac.app.samplefragmentusage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import dicodingac.app.samplefragmentusage.Fragment.FirstFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null){
            getSupportFragmentManager().beginTransaction().add(
                    R.id.fragment_containe,
                    new FirstFragment(),
                    FirstFragment.class.getSimpleName()).commit();
        }
    }
}
