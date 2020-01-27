package com.example.garimaexpert.droid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Fifth3 extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6;
    EditText e1,e2;
    TextView t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth);
        b1=(Button)findViewById(R.id.button26);
        b2=(Button)findViewById(R.id.button27);
        b3=(Button)findViewById(R.id.button15);
        b4=(Button)findViewById(R.id.button16);
        b5=(Button)findViewById(R.id.button17);
        b6=(Button)findViewById(R.id.button14);
        e1=(EditText)findViewById(R.id.editText8);
        e2=(EditText)findViewById(R.id.editText9);
        t=(TextView)findViewById(R.id.textView7);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1 = e1.getText().toString();
                String s2 = e2.getText().toString();
                Float f1 = Float.parseFloat(s1);
                Float f2 = Float.parseFloat(s2);
                Float f3 = f1 + f2;
                String s3 = Float.toString(f3);
                t.setText(s3);

            }

        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1=e1.getText().toString();
                String s2=e2.getText().toString();
                Float f1=Float.parseFloat(s1);
                Float f2=Float.parseFloat(s2);
                Float f3=f1- f2;
                String s3=Float.toString(f3);
                t.setText(s3);

            }

        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String s1=e1.getText().toString();
                String s2=e2.getText().toString();
                Float f1=Float.parseFloat(s1);
                Float f2=Float.parseFloat(s2);
                Float f3=f1* f2;
                String s3=Float.toString(f3);
                t.setText(s3);

            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1=e1.getText().toString();
                String s2=e2.getText().toString();
                Float f1=Float.parseFloat(s1);
                Float f2=Float.parseFloat(s2);
                Float f3=f1/ f2;
                String s3=Float.toString(f3);
                t.setText(s3);

            }

        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t.setText("0");

            }

        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Fifth3.this, Third.class);
                startActivity(i);
                finish();
            }
});
}}



