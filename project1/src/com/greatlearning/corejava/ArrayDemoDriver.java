package com.greatlearning.corejava;

public class ArrayDemoDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayDemo ad = new ArrayDemo(3);
		ad.insert(1);
		ad.insert(2);	
		ad.insert(3);	
		ad.display();
		System.out.println("\nDeleted Element: "+ad.delete(4));
	}

}
