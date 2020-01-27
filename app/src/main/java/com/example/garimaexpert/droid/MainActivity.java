package com.example.garimaexpert.droid;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b1,b2;
    EditText e1,e2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button)findViewById(R.id.button);
        b2=(Button)findViewById(R.id.button2);
        e1=(EditText)findViewById(R.id.editText);
        e2=(EditText)findViewById(R.id.editText2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,Second.class);
                startActivity(i);
                finish();

            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                String s1=e1.getText().toString();
            String s2=e2.getText().toString();
            if(s1.equals("")||s2.equals(""))
            {
                Toast.makeText(MainActivity.this, " PLEASE FILL ALL", Toast.LENGTH_SHORT).show();
            }
            else
            {
                SQLiteDatabase data=openOrCreateDatabase("mnnit",MODE_PRIVATE,null);
                data.execSQL("create table if not exists student(name varchar,password varchar)");
                String s4="select * from student where name='"+s1+"'and password ='"+s2+"'";
                Cursor cursor=data.rawQuery(s4,null);
                if(cursor.getCount()>0)
                {
                    Toast.makeText(MainActivity.this, "LOGIN SUCCESSFUL", Toast.LENGTH_SHORT).show();
                    Intent j=new Intent(MainActivity.this,Third.class);
                    startActivity(j);
                    finish();

                }
                else{
                    Toast.makeText(MainActivity.this, " NOT MATCH", Toast.LENGTH_SHORT).show();
                }




            }

            }
        });

    }
}
