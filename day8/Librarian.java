package com.chainsys.day8;

import java.util.Scanner;

public class Librarian {
	
	public void librarian() {
		
		
		Scanner input=new Scanner(System.in);
		
		String name = null;

		
		int tamilBooks=467;
		int englishBooks=550;
		
		
		String regex="[a-zA-Z]{1,10}";
		
		
		
		
		System.out.println("Enter  YOUR NAME:");
		name=input.next();
		while(!name.matches(regex)) {
			System.out.println("Enter the VALID  NAME:");
			name=input.next();

		}
			
			System.out.println("What do you want to do?\n"+"1.To see the stocks"+"2.To add stocks");
		     
		    int choice=input.nextInt();
		    
		    if(choice==1) {
		    	System.out.println("TOTAL TAMIL BOOKS:"+tamilBooks+"\nTOTAL ENGLISH BOOKS:"+englishBooks);
		    }
		    if(choice==2) {
		    	
		    	System.out.println("Which type of book,You want to add stock for?\n"+"1.Tamil books"+"2.English books");
		    	int option1=input.nextInt();
		    	
		    	if(option1==1) {
		    		System.out.println("How many books you want to add stock in?");
		    		int add=input.nextInt();
		    		
		    		for(int i=1;i<=add;i++) {
		    			
		    			System.out.println("Enter the book name you want to add:");
			    		String extraBook=input.next();
			    		tamilBooks++;
		    			
		    		}
		    		System.out.println("Total ENGLISH books after adding new books:"+tamilBooks);
		    		
		    		
		    		
		    	}
		    	if(option1==2) {
		    		System.out.println("How many books you want to add stock in?");
		    		int add=input.nextInt();
		    		
		    		for(int i=1;i<=add;i++) {
		    			
		    			System.out.println("Enter the book name you want to add:");
			    		String extraBook=input.next();
			    	
			    		englishBooks++;
		    			
		    		}
		    		System.out.println("Total ENGLISH books after adding new books:"+englishBooks);
		    		
		    				    	}
		    	
		    }
			
		
	
		
		input.close();
	}
}
	
	

	
