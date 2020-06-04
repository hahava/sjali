package com.sejong.hungryduck.activity;

import androidx.databinding.DataBindingUtil;
import android.os.Bundle;
import com.google.android.material.tabs.TabLayout;
import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;

import com.sejong.hungryduck.activity.fragment.SectionsPagerAdapter;
import com.sejong.hungryduck.sejong.R;
import com.sejong.hungryduck.sejong.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

	private ViewPager mViewPager;
	private TabLayout tabLayout;
	private ActivityMainBinding dataBindingUtil;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		init();

		mViewPager.setAdapter(new SectionsPagerAdapter(getSupportFragmentManager()));
		tabLayout.setupWithViewPager(mViewPager);
	}

	public void init() {
		dataBindingUtil = DataBindingUtil.setContentView(this, R.layout.activity_main);
		mViewPager = dataBindingUtil.container;
		tabLayout = dataBindingUtil.tabView;
	}

}
