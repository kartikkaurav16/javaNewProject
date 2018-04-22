package com.semanticsquare.thrillio.entities;

import java.util.Arrays;

public class Movie extends Bookmark {

	@Override
	public String toString() {
		return "Movie [releaseYear=" + releaseYear + ", genre=" + genre + ", title=" + title + ", profileUrl="
				+ profileUrl + ", director=" + Arrays.toString(director) + ", cast=" + Arrays.toString(cast)
				+ ", imdbRating=" + imdbRating + "]";
	}
	private int releaseYear;
	private String genre;
	private String title;
	private String profileUrl; 
	private String[] director; 
	private String[] cast; 
	private double imdbRating;
	public String getGenre() {
		return genre;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public int getReleaseYear() {
		return releaseYear;
	}
	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}
	public String[] getDirector() {
		return director;
	}
	public void setDirector(String[] director) {
		this.director = director;
	}
	public String[] getCast() {
		return cast;
	}
	public void setCast(String[] cast) {
		this.cast = cast;
	}
	public double getImdbRating() {
		return imdbRating;
	}
	public void setImdbRating(double imdbRating) {
		this.imdbRating = imdbRating;
	}
	public String getProfileUrl() {
		return profileUrl;
	}
	public void setProfileUrl(String profileUrl) {
		this.profileUrl = profileUrl;
	} 
	
	public boolean isKidFriendly() {
		// TODO Auto-generated method stub
		if (getProfileURL().contains("porn") || getTitle().contains("porn"))
			{
			return false; 
		}
		return true;
	}

	
	
	
}
