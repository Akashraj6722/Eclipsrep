package com.chainsys.day3;

import java.util.*;
public class PatterB {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        
        int num = scanner.nextInt();
     while(num<0) {
         System.out.println("Dont enter negative number!");
         System.out.println("Enter Valid Number ");
         num=scanner.nextInt();
     }
            for(int i=1; i<num; i+=2)
            {
                for(int j=i; j<=num; j+=1)
                {
                    System.out.print(" ");
                }
                for(int j=1; j<=i; j+=1)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
            for(int i=1; i<=num; i+=2)
            {
                for(int j=1; j<=i; j+=1)
                {
                    System.out.print(" ");
                }
                for(int j=i; j<=num; j+=1)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
            scanner.close();
	}

}
