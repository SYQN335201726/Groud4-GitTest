package com.animdemo.ui;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.TranslateAnimation;

public class TranslateActivity extends Activity{
	private TranslateAnimation tr;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tr);
		tr=new TranslateAnimation(0, 30, 0, 30);
		tr.setDuration(1000);
		findViewById(R.id.btn3).setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				arg0.startAnimation(tr);
			}
		});
	}

}
