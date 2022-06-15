package com.banking;
import java.util.Scanner;
public class banking {
//	Scanner sc = new Scanner(System.in);
	public void deposite(Scanner sc) {
		
		System.out.print("Enter the value: ");
		int inp = sc.nextInt();
		System.out.println(inp);
		
	}
	public void withdraw() {}
	public void transaction() {}
	
	public int linearSearch(int[] value,int element,int size) {
		
		for(int i=0;i<size;i++) {
			if(value[i]==element) {
				return i;		
			}
		}
		return -1;

	}
	public void binarySearch(int[] value,int first,int last,Scanner sc) {
		
		int input = sc.nextInt();

		int mid = (first+last)/2;
		
		while(first<last) {

			if(value[mid]<input) {
				first = mid+1;
			}
			else if(value[mid]==input) {
				
				String result = String.format("Mid %d:",mid);
				System.out.println(result);
				break;
			}
			else {
				last = mid-1;
			}
			mid = (first+last)/2;			
		
		}
		if(first>last) {
			System.out.println("Not found!");
		}
			

	}
}