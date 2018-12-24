package com.example.saitarun.git;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SEMESTER4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_semester4);
    }
    public void btcn(View v){
        Intent i=new Intent(getApplicationContext(),cn.class);
        startActivity(i);
    }
}
