package com.sejong.hungryduck.fragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import com.sejong.hungryduck.fragment.Tab.FirstView;
import com.sejong.hungryduck.fragment.Tab.SecondView;
import com.sejong.hungryduck.fragment.Tab.ThirdView;
import com.sejong.hungryduck.model.TabMetaInfo;

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