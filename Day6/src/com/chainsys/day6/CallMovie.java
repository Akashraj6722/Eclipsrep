package com.chainsys.day6;

public class CallMovie {

	public static void main(String[] args) {

		Movie mv=new Movie();
		
		mv.setMovieName("openheimer");
		mv.setTicketId(89);
		mv.setDirector("Nolan");
		
	    
		System.out.println(mv.toString());
	}

	

}
