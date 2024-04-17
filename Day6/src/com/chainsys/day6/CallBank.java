package com.chainsys.day6;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CallBank {

	public static void main(String[] args) {

		Scanner input =new Scanner(System.in);
		
		Bank bankDetails=new Bank();
		
		String bank;
		String name;
		float acc;
		int amountt;
		String phone;
		
		String regexName="[a-zA-Z]{1,20}";
		String regexDigits="[0-9]{1,12}";
		
//		Pattern p=Pattern.compile(regexName);
		
		System.out.println("Enter the bank name: ");
		bank=input.next();
		while(true) {
		if(bank.matches(regexName)) {
			break;
		}
		
		System.out.println("Enter the VALID BANK NAME");
		bank=input.next();

		}
		
				
		System.out.println("Enter  Your name: ");
		name=input.next();
		while(true) {
			if(name.matches(regexName)) {
				break;
			}
			System.out.println("Enter the VALID NAME");
			name=input.next();
		}
		
		System.out.println("Enter the account number: ");
		acc=input.nextFloat();
		while(true) {
			if(acc<=0) {
				System.out.println("Enter the VALID ACCOUNT NUMBER");
				acc=input.nextFloat();
			}
		

	
		
		System.out.println("Enter the amount: ");
		amountt=input.nextInt();

			while(true) {
			if(amountt<=0) {
				System.out.println("Enter the VALID AMOUNT ");
				amountt=input.nextInt();
			}
		

		
		System.out.println("Enter the Phone number: ");
		phone=input.next();
		
		while(true) {
			if(phone.matches(regexDigits)) {
				break;
			}
			System.out.println("Enter the VALID PHONE NUMBER");
			phone=input.next();

		}
		
		bankDetails.setBankName(bank);
		bankDetails.setName(name);
		bankDetails.setAccNo(acc);
		bankDetails.setAmount(amountt);
		

		
		BankMethod bankMethod= new BankMethod();
	
//		bankMethod.deposit(phone, bank, amountt);
		
		
	   bankMethod.deposit(phone, name);
	   System.out.println("Deposited amount"+bankMethod.deposit(acc, amountt));
	    
				
				
		
		
		
		System.out.println(bankDetails.toString());
		
		
		
		
		
		
			}
		}
		
		
	}

}
