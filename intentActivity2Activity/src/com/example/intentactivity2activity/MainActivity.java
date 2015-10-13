package com.example.intentactivity2activity;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {
	 EditText username;
	 EditText numericals;
	 Button login;
	 
	 
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        username=(EditText) findViewById(R.id.editText1);
        numericals=(EditText) findViewById(R.id.editText2);
        login=(Button) findViewById(R.id.button1);
        
        login.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				 String firstspace = username.getText().toString();
				// double Secondspace = Double.parseDouble(numericals.getText().toString());
				 String secondspace=numericals.getText().toString();
				if((firstspace.length()>0) && (secondspace.length()>0))
						 {
					 double d=Double.parseDouble(secondspace);
					 Intent intent =new Intent(MainActivity.this,Second_MainActivity.class);
					 intent.putExtra("key", firstspace);
					 intent.putExtra("key2", d);
					 startActivity(intent);
						 }
				 else if((firstspace.length()==0))
				 {
					 Toast.makeText(MainActivity.this, "enter the another feild", Toast.LENGTH_SHORT).show();
				 }
				 
				 else if((secondspace.length()==0))
				 {
					 Toast.makeText(MainActivity.this, "enter the  another feild", Toast.LENGTH_SHORT).show();
				 }
				 else  
				 {
					 Toast.makeText(MainActivity.this, "enter the 3rd another feild", Toast.LENGTH_SHORT).show();
				 }
			}
        });
    }
}
			 