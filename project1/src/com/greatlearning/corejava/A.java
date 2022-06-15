package com.greatlearning.corejava;

public class A {
	
	final float pi = 22/7;
	private float radius,result;
	
	void circleArea(float r) {
		radius = r;
		result = pi*radius*radius;
		System.out.println("Circle Area: "+result);
	}
}
class B extends A{
	

	public float breadth,height,result;
	
	void rectangleArea(float l,float h) {
		breadth = l;
		height = h;
		result = breadth * height;
		System.out.println("Rectangle Area: "+result);
		
	}
}
class C extends B{
	final float val = 0.5f ;
	public float base,height,result;
	void triangleArea(float b,float h) {
		base = b;
		height = h;
		result = val*base*height;
		System.out.println("Triangle Area: "+result);
		
	}
}
