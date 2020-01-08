package com.example.eeww9.sejong_alli.model;

import android.support.v4.app.Fragment;

public class TabMetaInfo {

	public TabMetaInfo(String pageTitle, Fragment innerView) {
		this.pageTitle = pageTitle;
		this.innerView = innerView;
	}

	private String pageTitle;

	public String getPageTitle() {
		return pageTitle;
	}

	public Fragment getInnerView() {
		return innerView;
	}

	private Fragment innerView;

}
