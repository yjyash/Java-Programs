package Recursion;

public class print_increasing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=5;
		print(n);
	}
//	public static void print(int n,int a)
//	{
//		if(n==0 || a==n+1)
//		{
//			return;
//		}
//		System.out.println(a);
//		print(n,a+1);
//	}
	public static void print(int n) {
		if(n==0)
		{
			return;
		}
		print(n-1);
		System.out.println(n);
	}
	

}
