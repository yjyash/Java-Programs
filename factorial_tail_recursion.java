package Recursion;

public class factorial_tail_recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=4;
		fac(n,1);
	}
	public static void fac(int n,int ans)
	{
		if(n==0)
		{
			System.out.println(ans);
			return;
		}
		fac(n-1,ans*n);
	}

}
