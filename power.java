package Recursion;

public class power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=3;
		int b=3;
		pow(a,b,1);
	}

//	public static int pow(int a,int b)
//	{
//		if(b==0)
//		{
//			return 1;
//		}
//		int sp = pow(a,b-1);
//		return sp*a;
//	}
	
	public static void pow(int a,int b,int ans) {
		
		if(b==0)
		{
			System.out.println(ans);
			return;
		}
		pow(a,b-1,ans*a);
	}
}
