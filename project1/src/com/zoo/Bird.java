package com.zoo;

public class Bird {
	
	public static int legs =2; 
	
	public void flying() {		
		String property = "Wings";
		System.out.println(property+"legs:"+this.legs);
	}
	
	public String nonFlying() {		
		String property = "No Wings";
	return property;
	}
	
	public String shout() {
		String property = "mouth";
	return property;
	}
}