package com.example.eeww9.sejong_alli.activity;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import com.example.eeww9.sejong_alli.R;
import com.example.eeww9.sejong_alli.fragment.SectionsPagerAdapter;

public class MainActivity extends AppCompatActivity {

	private SectionsPagerAdapter mSectionsPagerAdapter;
	private ViewPager mViewPager;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		mSectionsPagerAdapter = new SectionsPagerAdapter(getApplicationContext(), getSupportFragmentManager());

		mViewPager = (ViewPager)findViewById(R.id.container);
		mViewPager.setAdapter(mSectionsPagerAdapter);

		TabLayout tabLayout = (TabLayout)findViewById(R.id.tabs);
		tabLayout.setupWithViewPager(mViewPager);

	}

}
