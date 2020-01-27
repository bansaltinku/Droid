package com.example.garimaexpert.droid;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class Thirtheen extends AppCompatActivity {
    Button b1;
    RadioButton r1, r2, r3, r4;
    TextView t1;
    static int score = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thirtheen);
        b1 = (Button) findViewById(R.id.button39);
        r1 = (RadioButton) findViewById(R.id.radioButton17);
        r2 = (RadioButton) findViewById(R.id.radioButton18);
        r3 = (RadioButton) findViewById(R.id.radioButton19);
        r4 = (RadioButton) findViewById(R.id.radioButton20);
        t1 = (TextView) findViewById(R.id.textView6);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (r4.isChecked())
                {
                    ++Eight.score;
                }
                else
                {
                    --Eight.score;
                }

                Intent i = new Intent(Thirtheen.this, Forteen.class);
                startActivity(i);
                finish();
            }
        });

    }
}

