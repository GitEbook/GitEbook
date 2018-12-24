package com.example.saitarun.git;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SEMESTER3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_semester3);

    }
    public void btplp(View v){
        Intent i=new Intent(getApplicationContext(),plp.class);
        startActivity(i);
    }
    public void btcoa(View v){
        Intent i=new Intent(getApplicationContext(),coa.class);
        startActivity(i);
    }
    public void btdc(View v){
        Intent i=new Intent(getApplicationContext(),dc.class);
        startActivity(i);
    }
    public void btcpp(View v){
        Intent i=new Intent(getApplicationContext(),cpp.class);
        startActivity(i);
    }
}
