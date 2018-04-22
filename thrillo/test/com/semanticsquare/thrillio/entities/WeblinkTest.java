 package com.semanticsquare.thrillio.entities;

import static org.junit.Assert.*;

import org.junit.Test;

import com.semanticsquare.thrillio.constants.BookGenre;
import com.semanticsquare.thrillio.manager.BookmarkManager;

public class WeblinkTest {

	@Test
	public void testInKidFriendly() {
		
		//test 1 Porn in URL 
		Weblink weblink = BookmarkManager.getInstance().createWeblink("http://www.porn.com/article/2072759/core-java/taming-tiger--part-2.html", "http://www.javaworld.com", 2001, "Taming Tiger, Part 2"); 
		boolean weblinkisKidFriendly = weblink.isKidFriendly(); 
		
		assertFalse("For porn in URL - isKidfriendly() must return false", weblinkisKidFriendly);
		
		// 2. Porn in title
		
		weblink = BookmarkManager.getInstance().createWeblink("http://www.javaworld.com/article/2072759/core-java/taming-porn--part-2.html", "http://www.javaworld.com", 2001, "Taming Tiger, Part 2"); 
		weblinkisKidFriendly = weblink.isKidFriendly(); 
		
		assertFalse("Porn in title - isKidfriendly() must return false", weblinkisKidFriendly);
		
		// 3. Adult in host 
		weblink = BookmarkManager.getInstance().createWeblink("http://www.javaworld.com/article/2072759/core-java/taming-porn--part-2.html", "http://www.Adult.com", 2001, "Taming Tiger, Part 2"); 
		weblinkisKidFriendly = weblink.isKidFriendly(); 
		
		assertFalse("Adult in host  - isKidfriendly() must return false", weblinkisKidFriendly);
		
		//4. Adult in URL, But not in host  
		weblink = BookmarkManager.getInstance().createWeblink("http://www.adult.com/article/2072759/core-java/taming-porn--part-2.html", "http://www.javaworld.com", 2001, "Taming Tiger, Part 2"); 
		weblinkisKidFriendly = weblink.isKidFriendly(); 
		
		assertFalse("Adult in URL- isKidfriendly() must return true", weblinkisKidFriendly);
		
		//5. adult in title only  
		weblink = BookmarkManager.getInstance().createWeblink("http://www.javaworld.com/article/2072759/core-java/taming-porn--part-2.html", "http://www.javaworld.com", 2001, "Taming adult, Part 2"); 
		weblinkisKidFriendly = weblink.isKidFriendly(); 
		
		assertFalse("adult in title only  - isKidfriendly() must return false", weblinkisKidFriendly);
		
		
		//fail("Not yet implemented");
	}

}
