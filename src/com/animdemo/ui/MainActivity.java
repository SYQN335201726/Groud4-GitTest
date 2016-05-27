package com.animdemo.ui;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends Activity {
	private Button Btn;
	private ImageView img;
	private ViewGroup vg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        addListener();
    }

	private void addListener() {
		Btn.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				switch (v.getId()) {
				case R.id.button1:
					animTranslate();
					break;

				default:
					break;
				}
			}

			private void animTranslate() {
				Animation anim=new TranslateAnimation(0, 300, 0, 0);
				anim.setDuration(3000);
				anim.setFillAfter(true);
				img.startAnimation(anim);
			}
		});
	}

	private void initView() {
		Btn=(Button) findViewById(R.id.button1);
		img=(ImageView) findViewById(R.id.img);
	}
}
