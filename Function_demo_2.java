package Lec5;

public class Function_demo_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hey");
		System.out.println(Add());
		
	}
public static int Add()
{
	int a=9;
	int b=7;
	sub();
	int c= a+b;
	return c;
}
public static void sub()
{
	int a=9;
	int b=7;
	System.out.println(a-b);
}

}
