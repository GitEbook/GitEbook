package com.example.saitarun.git;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SEMESTER5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_semester5);
    }

    public void btse(View v){
        Intent i=new Intent(getApplicationContext(),softwareengineering.class);
        startActivity(i);
            }
    public void btdaa(View v){
        Intent i=new Intent(getApplicationContext(),daa.class);
        startActivity(i);
    }
    public void btflat(View v){
        Intent i=new Intent(getApplicationContext(),flat.class);
        startActivity(i);
    }
    public void bteem(View v){
        Intent i=new Intent(getApplicationContext(),eem.class);
        startActivity(i);
    }
    public void btdbms(View v){
        Intent i=new Intent(getApplicationContext(),dbms.class);
        startActivity(i);
    }
}
