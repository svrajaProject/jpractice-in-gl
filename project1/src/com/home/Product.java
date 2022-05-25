package com.home;

public class Product {
	
	String access = "Accessed";
	
	void display() {
		
		System.out.println("display from Product");
	}
	int add(int a, int b) {
		
		return a+b;
	}
	
	
}
class Product2 {

	public int add(int a, int b, int c) {
			
			int var = a+b+c;
			
			return var;
		}
		
}