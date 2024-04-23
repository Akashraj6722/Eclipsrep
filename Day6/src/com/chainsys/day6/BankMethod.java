package com.chainsys.day6;

 abstract class BankMethod {
	
   public void deposit(String phone,String name) {
		
		System.out.println("You have account in our bank");
	}
	
	public void deposit(float acc,int depositedAmount) {
		
		System.out.println("DEPOSITED AMOUNT"+depositedAmount);
	}

    public void deposit(String phone,String bankname,int depositedAmount) {
		
		System.out.println("You have deposited  "+depositedAmount);
	}
    
   
    	
    abstract void deposit(float savings,float depositedAmount);

		
    	

}

