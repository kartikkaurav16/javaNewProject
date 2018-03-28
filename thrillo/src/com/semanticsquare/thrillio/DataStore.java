package com.semanticsquare.thrillio;

		
	import com.semanticsquare.thrillio.constants.Gender;
import com.semanticsquare.thrillio.constants.UserType;
import com.semanticsquare.thrillio.entities.Bookmark;
	import com.semanticsquare.thrillio.entities.User;
	import com.semanticsquare.thrillio.entities.UserBookmark;
import com.semanticsquare.thrillio.manager.BookmarkManager;
import com.semanticsquare.thrillio.manager.UserManager;

	public class DataStore {
		private static final int USER_BOOKMARK_LIMIT = 5; 
		private static final int BOOKMARK_COUNT_PERTYPE = 5; 
		private static final int BOOKMARK_TYPES= 3;
		private static final int TOTAL_USER_COUNT = 5; 
		
		
	 private static User[] users  = new User[TOTAL_USER_COUNT] ; 
	 private static Bookmark[][] bookmark   = new Bookmark[BOOKMARK_TYPES][BOOKMARK_COUNT_PERTYPE] ; 
	 private static UserBookmark[] userBookmark = new UserBookmark[TOTAL_USER_COUNT * USER_BOOKMARK_LIMIT] ;
	   
	 
	 public static void loadData () {
		 loadUsers();
		 loadWebLinks(); 
	 }
	 
	 private static void loadUsers() { 
 users[0] = UserManager.getInstance().createUser(1000, "user0@semanticsquare.com", "test" , "John" , "M", UserType.USER, Gender.MALE); 
 users[1] = UserManager.getInstance().createUser(1001, "user1@semanticsquare.com", "test", "Sam", "M", UserType.USER, Gender.MALE); 
 users[2] = UserManager.getInstance().createUser(1002, "user2@semanticsquare.com", 	"test", "Anita", "M" , UserType.EDITOR, Gender.FEMALE); 
 users[3] = UserManager.getInstance().createUser(1003, "user3@semanticsquare.com",	"test",	"Sara", "M" ,UserType.EDITOR, Gender.FEMALE); 
 users[4] = UserManager.getInstance().createUser(1004, "user4@semanticsquare.com", 	"test", "Dheeru", "M", UserType.CHIEF_EDITOR, Gender.MALE); 
		
	} 
	 
	 private static void loadWebLinks() {
bookmark[0][0] = BookmarkManager.getInstance().createWeblink("http://www.javaworld.com/article/2072759/core-java/taming-tiger--part-2.html", "http://www.javaworld.com", 2001, "Taming Tiger, Part 2"); 
bookmark[0][1] = BookmarkManager.getInstance().createWeblink("http://www.javaworld.com/article/2072759/core-java/taming-tiger--part-2.html", "	http://www.stackoverflow.com", 2002, "How do I import a pre-existing Java project into Eclipse and get up and running?"); 
bookmark[0][1] = BookmarkManager.getInstance().createWeblink("http://mindprod.com/jgloss/interfacevsabstract.html", "http://mindprod.com	unknown", 2003, "Interface vs Abstract Class"); 
bookmark[0][1] = BookmarkManager.getInstance().createWeblink("http://cs.brown.edu/courses/cs161/papers/j-nio-ltr.pdf", "http://cs.brown.eduunknown", 2004, "NIO tutorial by Greg Travis"); 
bookmark[0][1] = BookmarkManager.getInstance().createWeblink("http://tomcat.apache.org/tomcat-6.0-doc/virtual-hosting-howto.html", "http://tomcat.apache.org", 2005, "Virtual Hosting and Tomcat"); 


	 }
	 
	 
	}
