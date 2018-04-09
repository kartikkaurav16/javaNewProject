package com.semanticsquare.thrillio;

import com.semanticsquare.thrillio.controllers.BookmarkController;
import com.semanticsquare.thrillio.entities.Bookmark;
import com.semanticsquare.thrillio.entities.User;
import com.semanticsquare.thrillio.manager.BookmarkManager;

public class View {
 public static void bookmark (User user, Bookmark[][] bookmark) {
	 System.out.println("\n + " + user.getEmail() + "isBookmarking" );
	 for(int i = 0 ; i< DataStore.USER_BOOKMARK_LIMIT; i++) {
		 int typeOffSet = (int)(Math.random() * DataStore.BOOKMARK_TYPES) ; 
		 int bookmarkOffSet = (int)(Math.random() * DataStore.BOOKMARK_COUNT_PERTYPE); 
		 
		 Bookmark bookmarks = bookmark[typeOffSet][bookmarkOffSet]; 
		 BookmarkController.getInstance().saveUserBookmark(user, bookmarks);
		 
		 System.out.println("bookmark in view" + bookmark);
		 
		 
		
	 }
 }
}
  