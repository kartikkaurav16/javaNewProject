package com.semanticsquare.thrillio.entities;

import static org.junit.Assert.*;

import org.junit.Test;

import com.semanticsquare.thrillio.constants.BookGenre;
import com.semanticsquare.thrillio.manager.BookmarkManager;

public class BookTest {

	@Test
	public void testIsKidFriendly() {
		Book book = BookmarkManager.getInstance().createBook(1854, "Wilder Publications", new String[] {"Henry David", "Henry David"}, 4000, "Walden", BookGenre.PHILOSOPHY, 4.3);
		boolean bookisKidFriendly = book.isKidFriendly(); 
		
		assertFalse("For PHILOSOPHY in Genre - isKidfriendly() must return false", bookisKidFriendly);
		
		// 2. Porn in title
		
		book = BookmarkManager.getInstance().createBook(1854, "Wilder Publications", new String[] {"Henry David", "Henry David"}, 4000, "porn", BookGenre.PHILOSOPHY, 4.3);
		bookisKidFriendly = book.isKidFriendly(); 
		
		assertFalse("For porn in Name - isKidfriendly() must return false", bookisKidFriendly);
		
				

	}

}
