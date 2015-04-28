package com.example.activitylifecycle;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class SecondActivity extends TraceActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);
		
	}
}
