package com.sejong.hungryduck.model;

import android.widget.ImageView;
import android.widget.TextView;

public class ViewHolder {
	private ImageView thumbnailImageView;
	private TextView titleView;
	private TextView regDateView;
	private TextView hostView;

	public TextView getHostView() {
		return hostView;
	}

	public void setHostView(TextView hostView) {
		this.hostView = hostView;
	}

	public ImageView getThumbnailImageView() {
		return thumbnailImageView;
	}

	public void setThumbnailImageView(ImageView thumbnailImageView) {
		this.thumbnailImageView = thumbnailImageView;
	}

	public TextView getTitleView() {
		return titleView;
	}

	public void setTitleView(TextView titleView) {
		this.titleView = titleView;
	}

	public TextView getRegDateView() {
		return regDateView;
	}

	public void setRegDateView(TextView regDateView) {
		this.regDateView = regDateView;
	}
}