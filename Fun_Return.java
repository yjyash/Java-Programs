package Functions;

public class Fun_Return {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Hello");
//		Add();
//		int ans = Add();
//		System.out.println(ans);
//		or
//		System.out.println(Add());
		
		Add();
	}
	
	public static void Add()
	{
		int a=0;
		int b=1;
		int c = a+b;
		int x = Sub();
		System.out.println(x+c);
	}
	
	public static int Sub()
	{
		int a=0;
		int b=1;
		int c = a-b;
		return c;
	}


}
