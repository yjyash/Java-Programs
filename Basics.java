package Functions;

public class Basics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		Add();
		System.out.println("Bye");

	}
	
	// Example of non parameterized void function
	public static void Add()
	{
		int a= 9;
		int b=4;
		int c=a+b;
		Sub();
		System.out.println(c);
		
	}
	
	
	public static void Sub()
	{
		int a= 9;
		int b=4;
		int c=a-b;
		System.out.println(c);
		
	}
	
	

}
