package framework1;

public class Implementation implements Abstract{
	
	private int length;
	private int breadth;
	private int result;
	
	public void setValue(int l,int b){
		this.length = l;
		this.breadth = b;
	}
	@Override
	public void cal() {
		// TODO Auto-generated method stub
		result = this.breadth *this.length;
		System.out.println(result);
	}
	public int getValue() {
		return result;
	}
	
	
}
