package com.greatlearning.corejava;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;
import java.util.PriorityQueue;  
import java.util.HashSet;
/**
 * @author svraja
 * Sample array illustrate array instancing and initializing arr1
 * Class test are store the mark and display the arr1
 */
public class Test {

	void getList() {
		
		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();
		
		System.out.println(list1);
		
		list1.add(1);list1.add(2);list1.add(3);

		System.out.println(list1);
		
		list1.add(0, 12);
		
		System.out.println("List1: "+list1);
	
		list2.add(10);list2.add(20);list2.add(30);
		
		System.out.println("List2: "+list2);
		
		list1.addAll(list2);
		
		System.out.println("Merged: "+list1);
		
		list1.set(0, 0);
		System.out.println(list1);
		
		list1.remove(0);
		System.out.println(list1);
		
		System.out.println(list1.get(2));
		
		Iterator<Integer> it = list1.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		System.out.println();
	
	for(Integer obj: list1){
		System.out.println(obj);
	}
	}
	public void linkedList() {
		
		LinkedList<Integer> ll = new LinkedList<>();
		ll.add(1);ll.add(2);
		ll.add(3);ll.add(4);
		ll.addFirst(90);
		System.out.println(ll.getFirst());
		System.out.println(ll.peek());
		System.out.println(ll.getLast());
		System.out.println(ll.get(2));
		System.out.println(ll);
		ll.add(5,12);
		System.out.println(ll);
		ll.addLast(13);
		System.out.println(ll);
		ll.offer(45);
		System.out.println(ll);
		ll.poll();
		System.out.println(ll);
		
		
	}
	public void StackClass() {
	
		Stack<Integer> s = new Stack();
		s.push(12);s.push(13);
		System.out.println(s);
		s.pop();
		System.out.println(s);
		s.search(2);
		System.out.println(s.search(12));
		s.peek();
		System.out.println(s);
	}
	public void priorityQueue() {
		PriorityQueue<String> pq = new PriorityQueue<>();
		pq.add("Raja");pq.add("Tinku");
		pq.add("Van");	pq.add("John");
	
		System.out.println(pq);
//		pq.clear();
//		System.out.println(pq);
//		System.out.println(pq.element());
//		System.out.println(pq);
//		System.out.println(pq.peek());
		pq.remove();
		System.out.println(pq);
	
		
	}
	public void HSet() {
		
		HashSet<Integer> hs = new HashSet<>();
		hs.add(12);
		hs.add(12);hs.add(15);hs.add(15);hs.add(16);hs.add(16);
		
		for(Integer obj:hs) {
			System.out.println(obj);
		}
		
	}
}
class Test2 {
	
	
}
