package com.semanticsquare.thrillio;

import com.semanticsquare.thrillio.constants.KidFriendlyStatus;
import com.semanticsquare.thrillio.constants.UserType;
import com.semanticsquare.thrillio.controllers.BookmarkController;
import com.semanticsquare.thrillio.entities.Bookmark;
import com.semanticsquare.thrillio.entities.User;
import com.semanticsquare.thrillio.manager.BookmarkManager;

public class View {

	public static void browse(User user, Bookmark[][] bookmark) {
		System.out.println("\n + " + user.getEmail() + "isBrowsing");

		int bookmarkCount = 0;

		for (Bookmark[] bookmarkList : bookmark) {
			for (Bookmark bookmarks : bookmarkList) {
				// bookmarking
				if (bookmarkCount < DataStore.USER_BOOKMARK_LIMIT) {
					boolean isBookmarked = getBookmarkDecision(bookmarks);

					if (isBookmarked)
						bookmarkCount++;
					BookmarkController.getInstance().saveUserBookmark(user, bookmarks);
					System.out.println("new Item is bookamerked bookmark in view" + bookmarks);

				}
				if (user.getUserType().equals(UserType.EDITOR) || user.getUserType().equals(UserType.CHIEF_EDITOR)) {
					if (bookmarks.isKidFriendly()
							&& bookmarks.getIsKidfriendlyStatus().equals(KidFriendlyStatus.UNKNOWN)) {
						String kidFriendlyStatus = getKidFriendlyStatusDecision(bookmarks);
						if(!kidFriendlyStatus.equals(KidFriendlyStatus.UNKNOWN)){
							bookmarks.setIsKidfriendlyStatus(kidFriendlyStatus);
							System.out.println("Kid friendly status " + kidFriendlyStatus +", " + bookmarks);
						}
					}
				}
			}
		}
	}

	private static String getKidFriendlyStatusDecision(Bookmark bookmarks) {
		return Math.random() < 0.4 ? KidFriendlyStatus.APPROVED
				: (Math.random() >= 0.4 && Math.random() < 0.8) ? KidFriendlyStatus.REJECTED
						: KidFriendlyStatus.UNKNOWN;

	}

	private static boolean getBookmarkDecision(Bookmark bookmarks) {
		return Math.random() < 0.5 ? true : false;

	}

	// public static void bookmark (User user, Bookmark[][] bookmark) {
	// System.out.println("\n + " + user.getEmail() + "isBookmarking" );
	// for(int i = 0 ; i< DataStore.USER_BOOKMARK_LIMIT; i++) {
	// int typeOffSet = (int)(Math.random() * DataStore.BOOKMARK_TYPES) ;
	// int bookmarkOffSet = (int)(Math.random() *
	// DataStore.BOOKMARK_COUNT_PERTYPE);
	//
	// Bookmark bookmarks = bookmark[typeOffSet][bookmarkOffSet];
	// BookmarkController.getInstance().saveUserBookmark(user, bookmarks);
	// System.out.println("bookmark in view" + bookmark);
	//
	//
	//
	// }
	// }
}
