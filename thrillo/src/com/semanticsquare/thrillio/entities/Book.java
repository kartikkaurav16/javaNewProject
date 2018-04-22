package com.semanticsquare.thrillio.entities;

import java.util.Arrays;

public class Book extends Bookmark {

	@Override
	public String toString() {
		return "Book [publicationYear=" + publicationYear + ", publiser=" + publiser + ", author="
				+ Arrays.toString(author) + ", genre=" + genre + ", amazonRating=" + amazonRating + "]";
	}
	private int publicationYear; 
	private String publiser; 
	private String[] author; 
	private String genre; 
	private  double amazonRating;
	
	public int getPublicationYear() {
		return publicationYear;
	}
	public void setPublicationYear(int publicationYear) {
		this.publicationYear = publicationYear;
	}
	public String getPubliser() {
		return publiser;
	}
	public void setPubliser(String publiser) {
		this.publiser = publiser;
	}
	public String[] getAuthor() {
		return author;
	}
	public void setAuthor(String[] author) {
		this.author = author;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public double getAmazonRating() {
		return amazonRating;
	}
	public void setAmazonRating(double amazonRating) {
		this.amazonRating = amazonRating;
	}
	public boolean isKidFriendly() {
		if (genre.contains("PHILOSOPHY") || getTitle().contains("porn")){
			return false; 
		}
		return true;
	}
	
}
