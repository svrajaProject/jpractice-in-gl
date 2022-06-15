package com.greatlearning.corejava;

public class ThreeDimensionShape {
	
	double width,height,depth;
	
	ThreeDimensionShape(double w, double h, double d){
		width = w;
		height = h;
		depth = d;
	}
	ThreeDimensionShape(double length){
		
		height = width = depth = length;
		
	}
	ThreeDimensionShape(){
		height= width = depth = 0;
	}
		
	double volume() {
			
		return width*height*depth;
	} 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	Dynamic memory allocation for ThreeDimensionShape class object and reference td
		ThreeDimensionShape t1 = new ThreeDimensionShape(5,6,7);
		ThreeDimensionShape t2 = new ThreeDimensionShape();
		ThreeDimensionShape t3 = new ThreeDimensionShape(8);
		double volume;
		volume = t1.volume();
		System.out.println(volume);
		volume = t2.volume();
		System.out.println(volume);
		volume = t3.volume();
		System.out.println(volume);
	}

}
