package com.example.activitylifecycletest;

import java.util.StringTokenizer;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;

public class ActivityMain extends Activity {
	public static final String TAG="MainActivity";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		Log.d(TAG,"onCreate");
		requestWindowFeature(Window.FEATURE_OPTIONS_PANEL);
		setContentView(R.layout.activity_main);
		Button startNormalActivity=
				(Button)findViewById(R.layout.normal_layout);
		Button startDialogActivity=
				(Button)findViewById(R.layout.dialog_layout);
		startNormalActivity.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent=new Intent(ActivityMain.this, NormalActivity.class);
				startActivity(intent);
			}
		});
		startDialogActivity.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent=new Intent(ActivityMain.this,DialogActivity.class);
				startActivity(intent);
			}
		});
	}
}
