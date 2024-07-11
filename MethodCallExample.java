package basicjava;

public class MethodCallExample {
	
	public  void mul(int x,int y) {
		System.out.println("The Multiplication Result is "+(x*y));
	}

	public static void main(String[] args) {
		
		MethodCallExample object=new MethodCallExample();
		object.mul(30, 10);
	}
	static{
	System.out.println("Static----------------");
}
}
