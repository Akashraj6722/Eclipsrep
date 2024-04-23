package com.chainsys.day8;

import java.util.Scanner;

public class LibraryMain {

	public static void main(String[] args) {
        


		int num;
		
		Scanner input=new Scanner(System.in);
		LibBooks libc=new LibBooks();
		Librarian librarian=new Librarian();

		
		System.out.println("1.Customer\n"+"2.Librarian");
		
		System.out.println("Are you a customer OR Librarian?");
		num=input.nextInt();
		
		while(num!=1 && num!=2) {
			
			System.out.println("Enter the valid choice");
			num=input.nextInt();

			
		}
		if(num==1) {
			
			libc.customer();
		}
		 if(num==2) {
			
			librarian.librarian();
		}
		
		
		
		
		
		
		input.close();
		
	}

}


