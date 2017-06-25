package expensetracker.adinacontiu;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import expensetracker.adinacontiu.camera.MakePhotoActivity;
import expensetracker.adinacontiu.expensestracker.R;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class FirstPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_page);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(FirstPage.this, SecondPage.class);
                intent.putExtra(EXTRA_MESSAGE, "Sending from main activity");
                System.out.println("before starting new activity");
                startActivity(intent);
                System.out.println("after starting new activity");

//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
            }
        });
    }

}