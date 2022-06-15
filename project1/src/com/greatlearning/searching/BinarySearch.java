package com.greatlearning.searching;
import java.util.Scanner;

public class BinarySearch {
	final Scanner input = new Scanner(System.in);
	
	final int size = input.nextInt();
	final int[] array = new int[size];
	

	public void implementationOfBinarySearch() {

	insertValues();	searchValue();

	}
 

	public void insertValues() {
		
	// Your code here...
		for(int i=0;i<size;i++) {
			array[i] = i;
			System.out.print("Enter the value: ");

			int element = input.nextInt();
			array[i] = element;
			
		}

	}

	public void searchValue() {

	// Your code here...
		int first=0,last,mid;
		last = array.length-1;
		mid = (first+last)/2;
		System.out.print("Search Elements position: ");
		int search = input.nextInt();
		
		while(first<=last) {
			if(array[mid]<search) {
				first = mid+1;
			}
			else if(array[mid] == search) {
				System.out.println(String.format("Searching element: %d,Element position: %d",search,mid));
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

	input.close();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearch obj = new BinarySearch();
		obj.implementationOfBinarySearch();
	}

}
