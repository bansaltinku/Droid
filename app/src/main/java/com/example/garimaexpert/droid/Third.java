package com.example.garimaexpert.droid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Third extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6,b7;
    ImageView i1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        b1=(Button)findViewById(R.id.button3);
        b2=(Button)findViewById(R.id.button4);
        b3=(Button)findViewById(R.id.button5);
        b4=(Button)findViewById(R.id.button6);
        b5=(Button)findViewById(R.id.button7);
        b6=(Button)findViewById(R.id.button8);
        b7=(Button)findViewById(R.id.button9);


        i1=(ImageView)findViewById(R.id.imageView);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(Third.this,MainActivity.class);
                startActivity(i);
                finish();

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j=new Intent(Third.this,Forth.class);
                startActivity(j);
                finish();



            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent k=new Intent(Third.this,Fifth3.class);
                startActivity(k);
                finish();

            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a=new Intent(Third.this,Sixth.class);
                startActivity(a);
                finish();


            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent b=new Intent(Third.this,Seventh.class);
                startActivity(b);
                finish();

            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent c=new Intent(Third.this,Eight.class);
                startActivity(c);
                finish();



            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent d=new Intent(Third.this,Nineth.class);
                startActivity(d);
                finish();


            }
        });
    }

}
