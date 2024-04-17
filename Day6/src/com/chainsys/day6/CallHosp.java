package com.chainsys.day6;

import java.util.*;

public class CallHosp {

	public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
		
		Hospital hp=new Hospital();
		
		int hospId1;
		String hospName1;
		String hospLocation1;
		
		
		System.out.println("Ener the Hospital ID:");
		hospId1=input.nextInt();
		while(true) {
			
			if(hospId1<0) {
				System.out.println("Enter the valid number");
				hospId1=input.nextInt();
			}else {
				

			}

		
			
	    System.out.println("Enter the Hospital Name:");
		hospName1=input.next();
		
		
		
		System.out.println("Ener the Hospital Location:");
		hospLocation1=input.next();
		
		
		
		
		
		
		hp.setHospId(hospId1);
		hp.setHospName(hospName1);
		hp.setHospLocation(hospLocation1);
		
		
//		
//		System.out.println("Hospital ID: " + hp.getHospId());
//		System.out.println("Hospital Name: "+hp.getHospName());
//		System.out.println("Hospital Location: " + hp.getHospLocation());
		System.out.println(hp.toString());
		
		
		
	
	}
	}
}
	

	


