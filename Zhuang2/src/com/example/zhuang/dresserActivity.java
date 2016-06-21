package com.example.zhuang;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class dresserActivity extends ActionBarActivity{
	private Button bt1,bt2,bt3,bt4;
	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dresser);
        bt1=(Button)findViewById(R.id.button1);
		   bt1.setOnClickListener(new OnClickListener(){
		    	public void onClick(View arg0){
		    		System.out.println("化妆师：小美");
		    		System.out.println("预约价格：120元/次");
		    	}
		    });
		    
		    bt2=(Button)findViewById(R.id.button2);
		    bt2.setOnClickListener(new OnClickListener(){
		    	public void onClick(View arg0){
		    		System.out.println("化妆师：青儿");
		    		System.out.println("预约价格：125元/次");
		    	}
		    });
		    
		    bt3=(Button)findViewById(R.id.button3);
		    bt3.setOnClickListener(new OnClickListener(){
		    	public void onClick(View arg0){
		    		System.out.println("化妆师：蓝蓝");
		    		System.out.println("预约价格：135元/次");
		    	}
		    });
		    
		    bt4=(Button)findViewById(R.id.button4);
		    bt4.setOnClickListener(new OnClickListener(){
		    	public void onClick(View arg0){
		    		System.out.println("化妆师：兰儿");
		    		System.out.println("预约价格：130元/次");
		    	}
		    });
    }
}
