package com.example.intentactivity2activity;

import android.R.string;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.widget.TextView;

public class Second_MainActivity extends Activity {

	TextView t1;
	TextView t2;
	TextView t3;
	TextView t4;
	TextView t5; 
	double d;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second__main);
		t1=(TextView) findViewById(R.id.textView9);
		t2=(TextView) findViewById(R.id.textView3);
		t3=(TextView) findViewById(R.id.textView4);
		t4=(TextView) findViewById(R.id.textView5);
		t5=(TextView) findViewById(R.id.textView6);
		
		
		Intent i1= getIntent();
		Bundle b1=i1.getExtras();
		 String s1 = b1.getString("key");
		t1.setText("Hi  "+s1);
		d=b1.getDouble("key2");
		
		
		t2.setText( d+"+5="+(d+5));
		t3.setText( d+"-5="+(d-5));
		t4.setText( d+"*5="+(d*5));
		t5.setText( d+"/5="+(d/5));
	}				
	} 
	


