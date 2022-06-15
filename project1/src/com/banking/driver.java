package com.banking;

import java.util.Scanner;

public class driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);	
		banking obj = new banking();
//		Linear Search
//		System.out.println("Search the value: ");
//		final Scanner sc = new Scanner(System.in);
//		int input = sc.nextInt();
//		
//		int array[] = {1,2,3,54};
//		int size = array.length;
		
//		int result = obj.linearSearch(array,input,size);
//		if(result==-1) {
//			System.out.println("Not present");
//		}
//		else {
//			System.out.println(result);
//		}
		
//		Binary search
//		System.out.println("Search the value: ");
		int array[] = {1,2,3,4,5,6,7,8,9,10,11,12};
		int first = 0;
		int last = array.length-1;
		obj.binarySearch(array,first,last,sc);
//
//		if(result==-1) {
//			System.out.println("Not present");
//		}
//		else {
//			System.out.println(result);
//		}
		sc.close();
	}

}
