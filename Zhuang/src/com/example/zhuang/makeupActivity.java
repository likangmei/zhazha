package com.example.zhuang;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class makeupActivity extends ActionBarActivity{
	private Button bt1,bt2,bt3,bt4;
	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_makeup);
        bt1=(Button)findViewById(R.id.button1);
		   bt1.setOnClickListener(new OnClickListener(){
		    	public void onClick(View arg0){
		    		System.out.println("口红");
		    		System.out.println("价格：56元");
		    	}
		    });
		    
		    bt2=(Button)findViewById(R.id.button2);
		    bt2.setOnClickListener(new OnClickListener(){
		    	public void onClick(View arg0){
		    		System.out.println("眉笔");
		    		System.out.println("价格：25元");
		    	}
		    });
		    
		    bt3=(Button)findViewById(R.id.button3);
		    bt3.setOnClickListener(new OnClickListener(){
		    	public void onClick(View arg0){
		    		System.out.println("腮红");
		    		System.out.println("价格：68元");
		    	}
		    });
		    
		    bt4=(Button)findViewById(R.id.button4);
		    bt4.setOnClickListener(new OnClickListener(){
		    	public void onClick(View arg0){
		    		System.out.println("眼影");
		    		System.out.println("价格：30元");
		    	}
		    });
    }
}
