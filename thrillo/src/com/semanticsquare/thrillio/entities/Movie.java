package com.semanticsquare.thrillio.entities;

public class Movie extends Bookmark {

	private int releaseYear; 
	private String Name;
	private String[] director; 
	private String[] cast; 
	private double imdbRating;
	public int getReleaseYear() {
		return releaseYear;
	}
	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
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
	
	
	
	
}
