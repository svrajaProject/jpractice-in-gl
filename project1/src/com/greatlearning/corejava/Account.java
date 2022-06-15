package com.greatlearning.corejava;

public class Account {
	String customerName;
	int accountNo;
	Account(String cName, int aNumber){
		
		customerName = cName;
		accountNo = aNumber;
	}
	void display() {
		System.out.println(customerName);
		System.out.println(accountNo);
	}
}
class CurrentAccount extends Account{
	int currentBalance;
	CurrentAccount(String a, int b, int c){
		super(a, b);
		currentBalance = c;
	 }
	void display() {
		
		super.display();
		System.out.println(currentBalance);
	}
}
class AccountDetails extends CurrentAccount{
	int depositAmount,withdrawalAmount;	
	AccountDetails(String a, int b, int c, int d, int e){
		super(a, b, c);
		depositAmount = d;
		withdrawalAmount = e;
	}
	void display() {
		super.display();
		System.out.println(depositAmount);
		System.out.println(withdrawalAmount);
	}
	
}
