package Functions;

public class Fun_Parameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=7;
		int b=11;
		
		System.out.println("Hello");
//		Add(7,4);
		
		System.out.println(Add(a,b));
	}
	//Example of Parameterized Void function
	public static int Add(int a,int b)
	{
		int c  =a+b;
//		System.out.println(c);
		
		return c-Sub(c,b);
	}
	
	public static int Sub(int a , int b)
	{
		int c = a-b;
		return c;
	}
}
