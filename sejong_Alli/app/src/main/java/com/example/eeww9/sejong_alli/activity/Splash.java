package com.example.eeww9.sejong_alli.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import com.example.eeww9.sejong_alli.R;

/**
 * 첫 화면시 나타나는 splash view
 *
 * @author hahava
 */
public class Splash extends Activity {

	//5 seconds
	private final int DELAYED_SECONDS = 5000;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_splash);

		new Handler().postDelayed(() -> {
			startActivity(new Intent(getApplication(), MainActivity.class)); // 로딩이 끝난후 이동할 Activity
			finish();
		}, DELAYED_SECONDS);
	}

}
