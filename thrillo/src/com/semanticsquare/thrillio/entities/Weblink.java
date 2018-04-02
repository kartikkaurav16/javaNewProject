package com.semanticsquare.thrillio.entities;

public class Weblink extends Bookmark {
  @Override
	public String toString() {
		return "Weblink [url=" + url + ", host=" + host + "]";
	}
private String url; 
  private String host; 
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

}
