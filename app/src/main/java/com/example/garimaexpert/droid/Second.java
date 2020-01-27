package com.example.garimaexpert.droid;


import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.icu.lang.UCharacterEnums;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Second extends AppCompatActivity {
    Button b1,b2;
    EditText e1,e2,e3,e4,e5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        b1=(Button)findViewById(R.id.button12);
        b2=(Button)findViewById(R.id.button13);
        e1=(EditText)findViewById(R.id.editText3);
        e2=(EditText)findViewById(R.id.editText4);
        e3=(EditText)findViewById(R.id.editText5);
        e4=(EditText)findViewById(R.id.editText6);
        e5=(EditText)findViewById(R.id.editText7);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String s1 = e1.getText().toString();
                String s2 = e2.getText().toString();

                String s3 = e3.getText().toString();
                String s4 = e4.getText().toString();
                String s5 = e5.getText().toString();

                if (s1.equals("") || s2.equals("") || s3.equals("")||s4.equals("")||s5.equals("")) {
                    Toast.makeText(Second.this, " PLEASE FILL ALL", Toast.LENGTH_SHORT).show();
                } else {
                    SQLiteDatabase data=openOrCreateDatabase("mnnit",MODE_PRIVATE,null);
                    data.execSQL("create table if not exists student(name varchar,password varchar,email varchar,city varchar,phone varchar)");
                    String s6="select * from student where name='"+s1+"'and password='"+s2+"' ";
                    Cursor cursor=data.rawQuery(s6,null);
                    if(cursor.getCount()>0){
                        Toast.makeText(Second.this, "USER EXIST", Toast.LENGTH_SHORT).show();
                    }
                    else{
                        data.execSQL("insert into student values('"+s1+"','"+s2+"','"+s3+"','"+s4+"','"+s5+"')");
                        Toast.makeText(Second.this, "ALL DONE", Toast.LENGTH_SHORT).show();
                        Intent j=new Intent(Second.this,MainActivity.class);
                        startActivity(j);
                        finish();
                    }
                }
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent k=new Intent(Second.this,MainActivity.class);
                startActivity(k);
                finish();
            }
        });


    }
}
