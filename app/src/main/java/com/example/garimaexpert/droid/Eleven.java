package com.example.garimaexpert.droid;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

import com.example.garimaexpert.droid.Eight;
import com.example.garimaexpert.droid.R;

public class Eleven extends AppCompatActivity {
    Button b1;
    RadioButton r1, r2, r3, r4;
    TextView t1;
    static int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eleven);
        b1 = (Button) findViewById(R.id.button37);
        r1 = (RadioButton) findViewById(R.id.radioButton9);
        r2 = (RadioButton) findViewById(R.id.radioButton10);
        r3 = (RadioButton) findViewById(R.id.radioButton11);
        r4 = (RadioButton) findViewById(R.id.radioButton12);
        t1 = (TextView) findViewById(R.id.textView4);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (r3.isChecked()) {
                    ++Eight.score;
                } else

                {
                    --Eight.score;
                }

                Intent i = new Intent(Eleven.this,Twelve.class);
                startActivity(i);
                finish();
            }
        });
    }
}



