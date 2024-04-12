package com.chainsys.day3;

import java.util.Scanner;

public class Eq {

	public static void main(String[] args) {
      
		Scanner input=new Scanner(System.in);
		
		int  limit;
		
		System.out.println("Enter the limit:");
		limit=input.nextInt();
	
		for(int i=5;i<=limit;i++) {
			System.out.println(2*i*i+i+5);
		}
		
		
		
	}

}
