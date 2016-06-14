package com.example.zhuang;
import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends ActionBarActivity {
	private Button bt1,bt2,bt3;
	private ImageButton ibt1,ibt2,ibt3;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		 bt1=(Button)findViewById(R.id.button1);
		   bt1.setOnClickListener(new OnClickListener(){
		    	public void onClick(View arg0){
		    		Intent intent=new Intent(MainActivity.this,MainActivity.class);
		    		  startActivity(intent);
		    	}
		    });
		    
		    bt2=(Button)findViewById(R.id.button2);
		    bt2.setOnClickListener(new OnClickListener(){
		    	public void onClick(View arg0){
		    		Intent intent=new Intent(MainActivity.this,dingdanActivity.class);
		    		  startActivity(intent);
		    	}
		    });
		    
		    bt3=(Button)findViewById(R.id.button3);
		    bt3.setOnClickListener(new OnClickListener(){
		    	public void onClick(View arg0){
		    		Intent intent=new Intent(MainActivity.this,wodeActivity.class);
		    		  startActivity(intent);
		    	}
		    });
		    
		    
		    ibt1=(ImageButton)findViewById(R.id.imageButton1);
		    ibt1.setOnClickListener(new OnClickListener(){
		    	public void onClick(View arg0){
		    		Intent intent=new Intent(MainActivity.this,makeupActivity.class);
		    		  startActivity(intent);
		    	}
		    });
		    
		    ibt2=(ImageButton)findViewById(R.id.imageButton2);
		    ibt2.setOnClickListener(new OnClickListener(){
		    	public void onClick(View arg0){
		    		Intent intent=new Intent(MainActivity.this,dresserActivity.class);
		    		  startActivity(intent);
		    	}
		    });
		    
		    ibt3=(ImageButton)findViewById(R.id.imageButton3);
		    ibt3.setOnClickListener(new OnClickListener(){
		    	public void onClick(View arg0){
		    		Intent intent=new Intent(MainActivity.this,videoActivity.class);
		    		  startActivity(intent);
		    	}
		    });


	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
