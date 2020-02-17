package com.sejong.hungryduck.activity;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.sejong.hungryduck.activity.fragment.SectionsPagerAdapter;
import com.sejong.hungryduck.sejong.R;

public class MainActivity extends AppCompatActivity {

	private ViewPager mViewPager;
	private TabLayout tabLayout;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		viewBinding();
		mViewPager.setAdapter(new SectionsPagerAdapter(getSupportFragmentManager()));
		tabLayout.setupWithViewPager(mViewPager);
	}

	public void viewBinding() {
		mViewPager = (ViewPager)findViewById(R.id.container);
		tabLayout = (TabLayout)findViewById(R.id.tab_view);
	}
}
