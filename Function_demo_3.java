package Lec5;

public class Function_demo_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("hey");
		int a=8;
		int b=7;
		System.out.println(Add(a,b));
	}
	
	public static int Add(int a, int b)
	{
		int c=a+b;
		int x=Sub(a,c);
		return x+c;
	}
	
	public static int Sub(int a, int b)
	{
		return a-b;
	}

}
