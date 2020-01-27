package com.example.garimaexpert.droid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

import com.example.garimaexpert.droid.Third;

import java.net.ContentHandler;

public class Eight extends AppCompatActivity {
    Button b1;
    RadioButton r1,r2,r3,r4;
    TextView t1;
    static int score=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eight);
        b1=(Button)findViewById(R.id.button35);
        r1=(RadioButton)findViewById(R.id.radioButton);
        r2=(RadioButton)findViewById(R.id.radioButton2);
        r3=(RadioButton)findViewById(R.id.radioButton3);
        r4=(RadioButton)findViewById(R.id.radioButton4);
        t1=(TextView)findViewById(R.id.textView2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                score=0;
                if(r3.isChecked())
                {
                    ++score;

                }
                else
                {
                    --score;
                }
                Intent i=new Intent(Eight.this,Tenth.class);
                startActivity(i);
                finish();
            }
        });

    }
}
