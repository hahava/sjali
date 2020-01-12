package com.sejong.hungryduck.model;

import android.graphics.drawable.Drawable;

public class ListItem {
	private String mainTitle;
	private Drawable secondImage;
	private String secondTitle;
	private String secondHost;
	private String secondDate;
	private String detAttend;
	private String detContents;
	private String detBenefits;
	private String detDate;
	private String detReception;
	private String detNotice;
	private String detContact;

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

	public String getSecondHost() {
		return secondHost;
	}

	public void setSecondHost(String secondHost) {
		this.secondHost = secondHost;
	}

	public String getSecondDate() {
		return secondDate;
	}

	public void setSecondDate(String secondDate) {
		this.secondDate = secondDate;
	}

	public String getDetAttend() {
		return detAttend;
	}

	public void setDetAttend(String detAttend) {
		this.detAttend = detAttend;
	}

	public String getDetContents() {
		return detContents;
	}

	public void setDetContents(String detContents) {
		this.detContents = detContents;
	}

	public String getDetBenefits() {
		return detBenefits;
	}

	public void setDetBenefits(String detBenefits) {
		this.detBenefits = detBenefits;
	}

	public String getDetDate() {
		return detDate;
	}

	public void setDetDate(String detDate) {
		this.detDate = detDate;
	}

	public String getDetReception() {
		return detReception;
	}

	public void setDetReception(String detReception) {
		this.detReception = detReception;
	}

	public String getDetNotice() {
		return detNotice;
	}

	public void setDetNotice(String detNotice) {
		this.detNotice = detNotice;
	}

	public String getDetContact() {
		return detContact;
	}

	public void setDetContact(String detContact) {
		this.detContact = detContact;
	}
}
