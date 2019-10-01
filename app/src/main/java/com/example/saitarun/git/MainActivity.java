package com.example.saitarun.git;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void btsem1(View v){
        Intent i=new Intent(getApplicationContext(),SEMESTER1.class);
        startActivity(i);
    }
    public void btsem2(View v){
        Intent i=new Intent(getApplicationContext(),SEMESTER2.class);
        startActivity(i);
    }
    public void btsem3(View v){
        Intent i=new Intent(getApplicationContext(),SEMESTER3.class);
        startActivity(i);
    }
    public void btsem4(View v){
        Intent i=new Intent(getApplicationContext(),SEMESTER4.class);
        startActivity(i);
    }
    public void btsem5(View v){
        Intent i=new Intent(getApplicationContext(),SEMESTER5.class);
        startActivity(i);
    }
    public void btsem6(View v){
        Intent i=new Intent(getApplicationContext(),SEMESTER6.class);
        startActivity(i);
    }
    public void btsem7(View v){
        Intent i=new Intent(getApplicationContext(),SEMESTER7.class);
        startActivity(i);
    }
}
import java.util.*;
import java.lang.*;
 
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=a+b;
		System.out.print(c);
	}
} 
