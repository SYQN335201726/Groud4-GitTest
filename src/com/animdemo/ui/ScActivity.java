package com.animdemo.ui;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;

public class ScActivity extends Activity {
	private ScaleAnimation sc;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.sc);
//		sc=new ScaleAnimation(0, 1, 0, 1);
//		sc=new ScaleAnimation(0, 1, 0, 1,100,50);
		sc=new ScaleAnimation(0,1,0,1,Animation.RELATIVE_TO_SELF,0.5f,Animation.RELATIVE_TO_SELF,0.5f);
		sc.setDuration(1000);
		findViewById(R.id.btn4).setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				 arg0.startAnimation(sc);
			}
		});
	}
}
