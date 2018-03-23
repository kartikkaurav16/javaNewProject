package com.semanticsquare.thrillio.data;

import com.semanticsquare.thrillio.entities.Bookmark;
import com.semanticsquare.thrillio.entities.User;
import com.semanticsquare.thrillio.entities.UserBookmark;

public class DataStrore {
	private static final int USER_BOOKMARK_LIMIT = 5; 
	private static final int BOOKMARK_COUNT_PERTYPE = 5; 
	private static final int BOOKMARK_TYPES= 5;
	private static final int TOTAL_USER_COUNT = 5; 
	
	
 private static User[] users  = new User[USER_BOOKMARK_LIMIT] ; 
 private static Bookmark[][] bookmark   = new Bookmark[BOOKMARK_COUNT_PERTYPE][5] ; 
 private static UserBookmark[] userBookmark = new UserBookmark[BOOKMARK_TYPES * 5] ;
   
 
 
 
 
}
