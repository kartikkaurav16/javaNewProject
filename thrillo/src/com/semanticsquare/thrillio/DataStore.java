package com.semanticsquare.thrillio;

		
	import com.semanticsquare.thrillio.constants.BookGenre;
import com.semanticsquare.thrillio.constants.Gender;
import com.semanticsquare.thrillio.constants.MovieGenre;
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
		 loadBooks();
		 loadMovies();
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
	 
   private static void loadBooks() {
bookmark[1][0]= BookmarkManager.getInstance().createBook(1854, "Wilder Publications", new String[] {"Henry David", "Henry David"}, 4000, "Walden", BookGenre.PHILOSOPHY, 4.3);
bookmark[1][1]= BookmarkManager.getInstance().createBook(1993, "Dover Publications", new String[] {"Ralph Waldo ", "Emerson"}, 4001, "Self-Reliance and Other Essays", BookGenre.PHILOSOPHY, 4.5);
bookmark[1][2]= BookmarkManager.getInstance().createBook(1988, "Touchstone", new String[] {"Eichler Watson"}, 4002, "Light From Many Lamps", BookGenre.PHILOSOPHY, 4.7);
bookmark[1][3]= BookmarkManager.getInstance().createBook(2004, "O'Reilly Media", new String[] {"Bert Bates", "Kathy Sierra", "Elisabeth Robson"}, 4003, "Head First Design Patterns", BookGenre.TECHNOLOGY, 5.0);
bookmark[1][4]= BookmarkManager.getInstance().createBook(2007, "Prentice Hall", new String[] {"Joshua Bloch"}, 4004, "Effective Java Programming Language Guide", BookGenre.TECHNOLOGY, 4.9);

	 }
   
   private static void loadMovies() {
bookmark[2][0] = BookmarkManager.getInstance().createMovie(3000, "Citizen Kane",MovieGenre.CLASSICS, 1941 ,new String[] {"Orson", "Welles"}, new String[] {"Orson Welles","Joseph Cotten"}, 8.5,"");
bookmark[2][1] = BookmarkManager.getInstance().createMovie(3001, "The Grapes of Wrath",MovieGenre.CLASSICS, 1940 ,new String[] {"Henry Fonda", "Jane Darwell"}, new String[] {"John Ford"}, 8.2,"");
bookmark[2][2] = BookmarkManager.getInstance().createMovie(3002, "A Touch of Greatness",MovieGenre.ROMANCE, 2004 ,new String[] {"Albert Cullum"}, new String[] {"Leslie Sullivan"}, 7.3,"");
bookmark[2][3] = BookmarkManager.getInstance().createMovie(3003, "The Big Bang Theory",MovieGenre.DRAMA, 2007 ,new String[] {"Kaley Cuoco", "Kaley Cuoco"}, new String[] {"Kaley Cuoco","Bill Prady"}, 8.7,"");
bookmark[2][4] = BookmarkManager.getInstance().createMovie(3004, "dil chatha hai ",MovieGenre.CLASSICS, 2000 ,new String[] {"Fearhan Akthar", "Zoya"}, new String[] {"Amir","saif","Aksahy Khanna", "prity Zinta"}, 8.5,"");

   }
	 
	 
	}
