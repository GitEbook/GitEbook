package com.example.saitarun.git;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SEMESTER1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_semester1);
    }

    public void btphy1(View v){
        Intent i=new Intent(getApplicationContext(),phy1.class);
        startActivity(i);
    }
    public void btche(View v){
        Intent i=new Intent(getApplicationContext(),chemistry.class);
        startActivity(i);
    }
    public void btc(View v){
        Intent i=new Intent(getApplicationContext(),c.class);
        startActivity(i);
    }
}
