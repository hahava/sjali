package com.sejong.hungryduck.model;

import android.graphics.drawable.Drawable;

public class Postings {
	private String mainTitle;
	private Drawable secondImage;
	private String secondTitle;
	private String host;
	private String limitingCondition;
	private String contents;
	private String winnerPrize;
	private String startDate;
	private String endDate;
	private String reception;
	private String notice;
	private String contact;

	public String getMainTitle() {
		return mainTitle;
	}

	public void setMainTitle(String mainTitle) {
		this.mainTitle = mainTitle;
	}

	public Drawable getSecondImage() {
		return secondImage;
	}

	public void setSecondImage(Drawable secondImage) {
		this.secondImage = secondImage;
	}

	public String getSecondTitle() {
		return secondTitle;
	}

	public void setSecondTitle(String secondTitle) {
		this.secondTitle = secondTitle;
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getLimitingCondition() {
		return limitingCondition;
	}

	public void setLimitingCondition(String limitingCondition) {
		this.limitingCondition = limitingCondition;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public String getWinnerPrize() {
		return winnerPrize;
	}

	public void setWinnerPrize(String winnerPrize) {
		this.winnerPrize = winnerPrize;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getReception() {
		return reception;
	}

	public void setReception(String reception) {
		this.reception = reception;
	}

	public String getNotice() {
		return notice;
	}

	public void setNotice(String notice) {
		this.notice = notice;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}
}
