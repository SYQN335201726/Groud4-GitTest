package com.animdemo.ui;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationSet;
import android.view.animation.RotateAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.Toast;

public class SetActivity extends Activity {
	private AnimationSet as;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.set);

		as = new AnimationSet(true);
		as.setDuration(1000);
		AlphaAnimation aa = new AlphaAnimation(0, 1);
		aa.setDuration(1000);
		TranslateAnimation ta = new TranslateAnimation(0, 30, 30, 30);
		ta.setDuration(1000);
		RotateAnimation ra = new RotateAnimation(0, 1);
		ra.setDuration(1000);
		as.addAnimation(aa);
		as.addAnimation(ta);
		as.addAnimation(ra);

		findViewById(R.id.btn5).setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				v.startAnimation(as);
				as.setAnimationListener(new AnimationListener() {

					@Override
					public void onAnimationStart(Animation arg0) {
						// TODO Auto-generated method stub

					}

					@Override
					public void onAnimationRepeat(Animation arg0) {
						// TODO Auto-generated method stub

					}

					@Override
					public void onAnimationEnd(Animation arg0) {
						Toast.makeText(SetActivity.this, "end",
								Toast.LENGTH_SHORT).show();
					}
				});
			}
		});

	}
}
