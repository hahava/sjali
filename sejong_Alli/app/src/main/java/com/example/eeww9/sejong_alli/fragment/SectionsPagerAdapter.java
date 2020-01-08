package com.example.eeww9.sejong_alli.fragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import com.example.eeww9.sejong_alli.fragment.Tab.FirstView;
import com.example.eeww9.sejong_alli.fragment.Tab.SecondView;
import com.example.eeww9.sejong_alli.fragment.Tab.ThirdView;
import com.example.eeww9.sejong_alli.model.TabMetaInfo;

import java.util.HashMap;
import java.util.Map;

public class SectionsPagerAdapter extends FragmentPagerAdapter {

	private static Map<Integer, TabMetaInfo> tabPageInfo = setPageTitle();

	public SectionsPagerAdapter(FragmentManager fm) {
		super(fm);
	}

	private static Map<Integer, TabMetaInfo> setPageTitle() {
		Map<Integer, TabMetaInfo> pageTitle = new HashMap<>();
		pageTitle.put(0, new TabMetaInfo("외부", new FirstView()));
		pageTitle.put(1, new TabMetaInfo("교내", new SecondView()));
		pageTitle.put(2, new TabMetaInfo("소모임", new ThirdView()));
		return pageTitle;
	}

	@Override
	public Fragment getItem(int position) {
		return tabPageInfo.get(position).getInnerView();
	}

	@Override
	public int getCount() {
		return tabPageInfo.size();
	}

	@Override
	public CharSequence getPageTitle(int position) {
		return tabPageInfo.get(position).getPageTitle();
	}

}