package com.semanticsquare.thrillio;

import com.semanticsquare.thrillio.entities.Bookmark;
import com.semanticsquare.thrillio.entities.User;
import com.semanticsquare.thrillio.manager.BookmarkManager;
import com.semanticsquare.thrillio.manager.UserManager;

public class Launch {
	
	private static User[] users;
	private static Bookmark[][] bookmark;
	private static void loadData() {
		System.out.println("load data");
		DataStore.loadData();
		
		users = UserManager.getInstance().getUsers(); 
		bookmark = BookmarkManager.getInstance().getBookmark();
		
		System.out.println("print Data");
		printUserData();
		printBookmarkData();
	}
	


	private static void printBookmarkData() {
		for (Bookmark [] bookmarkList  : bookmark) {
			for ( Bookmark bookmark : bookmarkList ) {
				System.out.println(bookmark);
			}
		}
		
	}



	private static void printUserData() {
		for (User user : users ) {
			System.out.println(user);
		}
	}


	public static void main(String[] args) {
		 loadData();

	}

	
}
