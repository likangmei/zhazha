package com.example.zhuang;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class dingdanActivity extends ActionBarActivity{
	private Button bt1,bt2,bt3;
	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);
        bt1=(Button)findViewById(R.id.button1);
		   bt1.setOnClickListener(new OnClickListener(){
		    	public void onClick(View arg0){
		    		Intent intent=new Intent(dingdanActivity.this,MainActivity.class);
		    		  startActivity(intent);
		    	}
		    });
		    
		    bt2=(Button)findViewById(R.id.button2);
		    bt2.setOnClickListener(new OnClickListener(){
		    	public void onClick(View arg0){
		    		Intent intent=new Intent(dingdanActivity.this,dingdanActivity.class);
		    		  startActivity(intent);
		    	}
		    });
		    
		    bt3=(Button)findViewById(R.id.button3);
		    bt3.setOnClickListener(new OnClickListener(){
		    	public void onClick(View arg0){
		    		Intent intent=new Intent(dingdanActivity.this,wodeActivity.class);
		    		  startActivity(intent);
		    	}
		    });
    }
	
}
