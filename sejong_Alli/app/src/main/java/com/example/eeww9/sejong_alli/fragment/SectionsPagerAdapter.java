package com.example.eeww9.sejong_alli.fragment;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import com.example.eeww9.sejong_alli.fragment.Tab.Group;
import com.example.eeww9.sejong_alli.fragment.Tab.SecondView;
import com.example.eeww9.sejong_alli.fragment.Tab.FirstView;

import java.util.HashMap;
import java.util.Map;

public class SectionsPagerAdapter extends FragmentPagerAdapter {

	private Context mContext;
	private static Map<Integer, String> pageTitle = setPageTitle();

	public SectionsPagerAdapter(Context context, FragmentManager fm) {
		super(fm);
		mContext = context;
	}

	private static Map<Integer, String> setPageTitle() {
		Map<Integer, String> pageTitle = new HashMap<>();
		pageTitle.put(0, "외부");
		pageTitle.put(1, "교내");
		pageTitle.put(2, "소모임");
		return pageTitle;
	}

	@Override
	public Fragment getItem(int position) {
		switch (position) {
			case 0:
				return new FirstView();
			case 1:
				return new SecondView();
			case 2:
				return new Group(mContext);
		}
		return new FirstView();
	}

	@Override
	public int getCount() {
		return pageTitle.size();
	}

	@Override
	public CharSequence getPageTitle(int position) {
		return pageTitle.get(position);
	}

}