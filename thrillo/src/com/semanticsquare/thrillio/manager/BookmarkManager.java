package com.semanticsquare.thrillio.manager;

import com.semanticsquare.thrillio.dao.BookmarkDao;
import com.semanticsquare.thrillio.entities.Book;
import com.semanticsquare.thrillio.entities.Bookmark;
import com.semanticsquare.thrillio.entities.Movie;
import com.semanticsquare.thrillio.entities.Weblink;

public class BookmarkManager {
private static BookmarkManager instance = new BookmarkManager();

private static BookmarkDao dao = new BookmarkDao();

	private BookmarkManager() {};
	public static BookmarkManager getInstance() {
		return instance;
	}
	
	public Movie createMovie(long id,String title,String genre, 
 int releaseYear ,String[] director, String[] cast,double imdbRating, String profileUrl) {
	
		Movie movie = new Movie();
		movie.setCast(cast);
		movie.setDirector(director);
		movie.setId(id);
	movie.setImdbRating(imdbRating);
	movie.setTitle(title);	
	movie.setGenre(genre);
	movie.setReleaseYear(releaseYear);
	movie.setProfileURL(profileUrl);
		return movie; 
		
	}	
	
	public Book createBook(int publicationYear, String publiser, String[] author, long id,  String title, String genre,  double amazonRating ) {
	
		Book book = new Book();
		book.setAmazonRating(amazonRating);
		book.setAuthor(author);
		book.setGenre(genre);
		book.setId(id);
		book.setPublicationYear(publicationYear);
		book.setTitle(title);
		book.setPubliser(publiser);
		book.setTitle(title);
		
		
		return book; 
		
	}	
	
	public Weblink createWeblink(String url, String host, long id ,  String title) {
		
		Weblink weblink = new Weblink();
		weblink.setHost(host);
		weblink.setId(id);
		weblink.setTitle(title);
		weblink.setUrl(url);
		
		return weblink; 
		};
		
	public Bookmark[][] getBookmark(){
		return dao.getBookmark();
	}
	
	
     

}
