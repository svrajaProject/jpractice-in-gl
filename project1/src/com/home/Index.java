package com.home;
import com.about.About;
import com.practice.Customer;
import com.zoo.Bird;

public class Index {

	public static void main(String[] args) {

//		from same package
		Product indexObj = new  Product();
		indexObj.display();
		
		 
//		Compile time  Polymorphism method overloading
		Product2 indexObj2 = new Product2();
		int add = indexObj2.add(1,2,3);
		
		System.out.println(add);
		
//		from other About package
		About obj = new About();
		obj.display();
		        
// 		Create object for Bird from zoo package
        Bird pecock = new Bird();
//        String f = pecock.flying();
        pecock.flying();
        String sh =  pecock.shout();
        
        
//      System.out.println(f);
        System.out.println(sh);
        System.out.println(Bird.legs);
        
//      Creating the object/entity/instants of Customer class from com.practice package
//      dynamci memory allocating for customer object in Heap memory and stack memory for references([fullName,age])
        Customer customer = new Customer();
        customer.fullName = "Raja";
        customer.age = 20;
        customer.dispaly();
        
	}

}
