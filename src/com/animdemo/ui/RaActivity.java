package com.animdemo.ui;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;

public class RaActivity extends Activity{
	private RotateAnimation ra;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ra);
//		ra=new RotateAnimation(0,360,100,50);
//		ra.setDuration(1000);
		ra=new RotateAnimation(0,180,Animation.RELATIVE_TO_SELF,0.5f,Animation.RELATIVE_TO_SELF,0.5f);
		ra.setFillAfter(true);
		ra.setDuration(1000);
		findViewById(R.id.btn2).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				v.startAnimation(ra);
			}
		});
	}

}
