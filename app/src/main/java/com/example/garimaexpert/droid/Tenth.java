package com.example.garimaexpert.droid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;


public class Tenth extends AppCompatActivity {
    Button b1, b2;
    RadioButton r1, r2, r3, r4;
    TextView t1;
    static int score = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tenth);
        b1 = (Button) findViewById(R.id.button36);
        r1 = (RadioButton) findViewById(R.id.radioButton5);
        r2 = (RadioButton) findViewById(R.id.radioButton6);
        r3 = (RadioButton) findViewById(R.id.radioButton7);
        r4 = (RadioButton) findViewById(R.id.radioButton8);
        t1 = (TextView) findViewById(R.id.textView3);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (r3.isChecked())
                {
                    ++Eight.score;
                } else

                {
                    --Eight.score;
                }

                Intent i = new Intent(Tenth.this,Eleven.class);
                startActivity(i);
                finish();
            }
        });
    }
}
