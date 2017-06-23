package expensetracker.adinacontiu.camera2basic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import expensetracker.adinacontiu.expensestracker.R;

public class CameraActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera);
        if (null == savedInstanceState) {
            getFragmentManager().beginTransaction()
                    .replace(R.id.container, Camera2BasicFragment.newInstance())
                    .commit();
        }
    }
}
