package com.chainsys.day6;

public class Movie {

	
	String movieName;
	int ticketId;
	String director;
	
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public int getTicketId() {
		return ticketId;
	}
	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public Movie(String movieName, int ticketId, String director) {
		
		this.movieName = movieName;
		this.ticketId = ticketId;
		this.director = director;
	}
	public Movie() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Movie [movieName=" + movieName + ", ticketId=" + ticketId + ", director=" + director + "]";
	}
	
	
	
	
}
