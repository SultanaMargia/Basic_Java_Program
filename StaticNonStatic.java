package basicjava;

public class StaticNonStatic  extends Methodusingobject{
	/*
	 * Static--> static,non static(object required)
	 * Non Static---> All allow to access
	 */
	int a= 7;
	static int b = 8;
	
	
	public static void add(int x,int y) {
		System.out.println("The Result is "+(x+y));
		
		StaticNonStatic obj2=new StaticNonStatic();
		
		System.out.println("The Result is "+(obj2.a+b));
		
	} 
	public void sub(int x,int y) {
		System.out.println("The Result is " +(x-y));
		System.out.println("The Result is "+(a+b));
	}

 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add(30,40);
		StaticNonStatic obj=new StaticNonStatic();
		obj.sub(40,10);
		
		
		}

	}

