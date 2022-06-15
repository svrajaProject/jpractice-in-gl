package framework2;

public class Implementations implements Interface2{
	
	private int num1,num2,result;
	
	Implementations(int a,int b){
		this.num1 = a;
		this.num2 = b;
	}
	@Override
	public int subtract() {
		// TODO Auto-generated method stub
		this.result = num1 - num2;
		return result;
	}

	@Override
	public int multiple() {
		// TODO Auto-generated method stub
		this.result = num1 * num2;
		return result;
	}
}
class Implementations2 implements Interface3{
	
	private int num1,num2,result;
	
	Implementations2(int num1,int num2){
		this.num1 = num1;
		this.num2 = num2;
		
	}
	@Override
	public int add() {
		// TODO Auto-generated method stub
		result = num1 + num2;
		return result;
	}
	@Override
	public int multiple() {
		// TODO Auto-generated method stub
		result = num1 * num2;
		return result;
	}
}

