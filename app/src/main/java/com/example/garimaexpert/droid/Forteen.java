package com.example.garimaexpert.droid;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Forteen extends AppCompatActivity {
    TextView t1;
    Button b1,b2,b3,b4;
    EditText e1;
    WebView w1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forteen);
        w1=(WebView)findViewById(R.id.webView);
        t1=(TextView)findViewById(R.id.textView8);
        b1=(Button)findViewById(R.id.button41);
        b2=(Button)findViewById(R.id.button42);
        b3=(Button)findViewById(R.id.button43);
        b4=(Button)findViewById(R.id.button44);

         int i=Eight.score;
         String s=Integer.toString(i);
        t1.setText(s);

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j=new Intent(Forteen.this,MainActivity.class);
                startActivity(j);
                finish();

            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1="http://m.facebook.com";
                w1.loadUrl(s1);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s2="http://www.twitter.com";
                w1.loadUrl(s2);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s3="http://www.netcamp.in";
                w1.loadUrl(s3);


            }
        });
    }
}
