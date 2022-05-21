package com.home;
import com.about.About;
import com.zoo.Bird;
class Test {

	int use() {
		
		int val = 1_2_3_1_2_3;
		return val;
	}
}

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
		
//		Object for Test class and calling use method
		Test objj = new Test();
//		int result = objj.use();
//		System.out.println(result);
		
		int result = 0;
        short s = 42;
        Long x = new Long("42");
        Long y = new Long(42);
        Short z = new Short("42");
        Short x2 = new Short(s);
        Integer y2 = new Integer("42");
        Integer z2 = new Integer(42);

        if (x == y) /* Line 13 */
            result = 1;
        if (x.equals(y) ) /* Line 15 */
            result = result + 10;
        if (x.equals(z) ) /* Line 17 */
            result = result + 100;
        if (x.equals(x2) ) /* Line 19 */
            result = result + 1000;
        if (x.equals(z2) ) /* Line 21 */
            result = result + 10000;
        System.out.println("result = " + result);
        
        // Create object for Bird from zoo package
        Bird pecock = new Bird();
//        String f = pecock.flying();
        pecock.flying();
        String sh =  pecock.shout();
        
        
//        System.out.println(f);
        System.out.println(sh);
        System.out.println(Bird.legs);
        
	}

}
