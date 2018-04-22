package com.semanticsquare.thrillio.entities;

import com.semanticsquare.thrillio.constants.KidFriendlyStatus;

public abstract class Bookmark {
	private long id; 
	private String title; 
	private String profileURL;
	
	private String isKidfriendlyStatus = KidFriendlyStatus.UNKNOWN ; 
	
	public String getIsKidfriendlyStatus() {
		return isKidfriendlyStatus;
	}
	public void setIsKidfriendlyStatus(String isKidfriendlyStatus) {
		this.isKidfriendlyStatus = isKidfriendlyStatus;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getProfileURL() {
		return profileURL;
	}
	public void setProfileURL(String profileURL) {
		this.profileURL = profileURL;
	} 
	
	public abstract boolean isKidFriendly();
	
}
