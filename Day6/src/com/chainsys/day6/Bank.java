package com.chainsys.day6;

public class Bank {

	String bankName;
	String name;
	float accNo;
	float amount;
	String phonee;
	float savings;
	
	
	
	
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getAccNo() {
		return accNo;
	}
	public void setAccNo(float accNo) {
		this.accNo = accNo;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	
	public float getSavings() {
		return savings;
	}
	public void setSavings(float savings) {
		this.savings = savings;
	}
	public String getPhonee() {
		return phonee;
	}
	public void setPhonee(String phonee) {
		this.phonee = phonee;
	}
	
	public Bank(String bankName, float accNo, float amount, String phonee) {
		super();
		this.bankName = bankName;
		this.accNo = accNo;
		this.amount = amount;
		this.phonee = phonee;
	}
	public Bank() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Bank [bankName=" + bankName + ", name=" + name + ", accNo=" + accNo + ", amount=" + amount + ", phonee="
				+ phonee + ", savings=" + savings + "]";
	}
	
	
	
	
	
	
	
	
}
