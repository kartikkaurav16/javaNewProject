package com.semanticsquare.thrillio.entities;

import static org.junit.Assert.*;

import org.junit.Test;

import com.semanticsquare.thrillio.constants.BookGenre;
import com.semanticsquare.thrillio.constants.MovieGenre;
import com.semanticsquare.thrillio.manager.BookmarkManager;

public class MovieTest {

	@Test
	public void test() {
		Movie movie = BookmarkManager.getInstance().createMovie(3000, "Citizen porn",MovieGenre.CLASSICS, 1941 ,new String[] {"Orson", "Welles"}, new String[] {"Orson Welles","Joseph Cotten"}, 8.5,"Porn");
		boolean bookisKidFriendly = movie.isKidFriendly(); 
		
		assertFalse("porn in name -> isKidfriendly() must return false", bookisKidFriendly);
		
		// 2. Porn in title
		
		movie = BookmarkManager.getInstance().createMovie(3000, "porn",MovieGenre.CLASSICS, 1941 ,new String[] {"Orson", "Welles"}, new String[] {"Orson Welles","Joseph Cotten"}, 8.5,"");
		bookisKidFriendly = movie.isKidFriendly(); 
		
		assertFalse("For porn in Name - isKidfriendly() must return false", bookisKidFriendly);
		
	}

}
