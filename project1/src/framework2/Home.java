package framework2;
import java.util.Scanner;
import java.util.ArrayList;
public class Home {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final Scanner s =  new Scanner(System.in);
		System.out.print("Enter the 1 value: ");
		int inp = s.nextInt();
		
		System.out.print("Enter the 2 value: ");
		int inp2 = s.nextInt();
		
		ArrayList<Integer> a = new ArrayList<>();
		
		a.add(inp);a.add(inp2);		
		System.out.println(a);
		
		System.out.println("Option 1: Addition, Option 2: Subtract, Option 3: Multiplication");
		int option = s.nextInt();
		
		Implementations obj = new Implementations(inp,inp2);
		Implementations2 obj2 = new Implementations2(inp,inp2);
		
		switch(option) {
		case 1:
			System.out.print("Addition: "+obj2.add()+" ");
		
		case 2:
			System.out.print("Subtraction: "+obj.subtract()+" ");
			break;
		
		default: 
			System.out.print("Multiplication: "+obj2.multiple()+" ");
		//	System.out.print("Division: "+obj.divid()+" ");
			break;
		}	
		s.close();
	}
}
