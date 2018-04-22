package com.semanticsquare.thrillio.entities;

public class Weblink extends Bookmark {
	private String url; 
	  private String host;
  @Override
	public String toString() {
		return "Weblink [url=" + url + ", host=" + host + "]";
	} 
  public String getUrl() {
	return url;
}
public void setUrl(String url) {
	this.url = url;
}
public String getHost() {
	return host;
}
public void setHost(String host) {
	this.host = host;
}
@Override
public boolean isKidFriendly() {
	// TODO Auto-generated method stub
	if (url.contains("porn") || getTitle().contains("porn")
			|| host.contains("adult")|| url.contains("adult")){
		return false; 
	}
	return true;
}



}
