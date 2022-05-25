package com.greatlearning.corejava;

public class CustomerDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Dynamic memory allocating for customer object in heap and stack memory
		Customer customer = new Customer(); // Default constructor creating by JAVA compiler. object will invoking the constructor 
//		printing the values which is presents in customers class with help of customer object 
		System.out.println("Customers Name:"+customer.name);
		System.out.println("Amount:"+customer.amount);
		
		Customerr c = new Customerr();
		
		System.out.println(c);
		
	}

}
