package com.greatlearning.corejava;
/*
 * Language using: Java
 * Array Demonstration
 */

public class ArrayDemo {
	
	int arr[];
	int size;
	int capacity;
	
	ArrayDemo(int capacity){
		this.capacity = capacity;
		arr = new int[capacity];
		size = 0;
	}
//	inserting elements on arr
	void insert(int elements) {
		
		if(size==capacity) {
			growArray();
		}
		arr[size++] = elements;
	}
	void growArray() {
		int[] tempArray = new int[2*size];
		
		for(int i =0;i<size;i++) {
			tempArray[i] = arr[i];
		}
		arr = tempArray;
	}
	int delete(int index) {
		if(index>=size) 
			return -1;
		
		int deletedElements = arr[index];
		
		for(int i=index+1;i<size;i++)
			arr[i-1] = arr[i];
		size++;
		
		return deletedElements;

	}
	void display() {
		System.out.println("\nArray with size");
		for(int i = 0;i<size;i++) {
			System.out.println(arr[i]+" ");
		}
		System.out.println("\nArray with capacity");
		for(int i = 0;i<capacity;i++) {
			System.out.println(arr[i]+" ");
		}
	}

}
