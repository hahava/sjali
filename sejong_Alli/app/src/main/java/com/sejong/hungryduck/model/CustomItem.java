package com.sejong.hungryduck.model;

import android.graphics.drawable.Drawable;

public class CustomItem {
	private Drawable thumbnailImage;
	private String title;
	private String regDate;

	public Drawable getThumbnailImage() {
		return thumbnailImage;
	}

	public void setThumbnailImage(Drawable thumbnailImage) {
		this.thumbnailImage = thumbnailImage;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getRegDate() {
		return regDate;
	}

	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}
}
