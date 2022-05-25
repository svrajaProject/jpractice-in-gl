package com.greatlearning.corejava;

public class ConstructorDemo {
//instance variables
	int a;
	int b;
//	Default constructor
	ConstructorDemo(){
//		instancing the variable
		int a = 0;
		int b = 0;
		System.out.println(a+" "+b);
	}
//	Parameterized constructor
	ConstructorDemo(int h,int w){
		int a = h;
		int b = w;
		System.out.println(a*b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		instantiation part
//		Dynamic memory allocating Java compiler on heap memory
		
		ConstructorDemo p1 = new ConstructorDemo();
		ConstructorDemo p2 = new ConstructorDemo(10,20);
		
	}

}
