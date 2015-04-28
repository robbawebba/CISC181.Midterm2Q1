package com.example.activitylifecycle;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends TraceActivity {

	private Button button;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		button = (Button)findViewById(R.id.newActivityButton);
		button.setOnClickListener(new View.OnClickListener() {
		@Override
		public void onClick(View V){

		Intent newIntent = new Intent(MainActivity.this, SecondActivity.class);
		startActivity(newIntent);
		}
	});
	}

}
