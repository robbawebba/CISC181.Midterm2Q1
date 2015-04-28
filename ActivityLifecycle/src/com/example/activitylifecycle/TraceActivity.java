package com.example.activitylifecycle;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class TraceActivity extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		Log.i("Tracer", "On Create Executed");
	}
	
	@Override
	protected void onStart(){
		super.onStart();
		Log.i("Tracer", "On Start Executed");
		
	}
	
	@Override 
	protected void onResume(){
		super.onResume();
		Log.i("Tracer", "On Resume Executed");	
		
	}
	
	@Override
	protected void onPause(){
		super.onPause();
		Log.i("Tracer", "On Pause Executed");
		
	}
	
	@Override
	protected void onStop(){
		super.onStop();
		Log.i("Tracer", "On Stop Executed");
	}
	@Override 
	protected void onRestart(){
		super.onRestart();
		Log.i("Tracer", "On Restart Executed");
	}
	@Override
	protected void onDestroy(){
		super.onDestroy();
		Log.i("Tracer", "On Destroy Executed");
	}

}
