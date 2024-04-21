package Recursion;

public class print_decreasing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=1000;
		print(n);
	}

	public static void print(int n)
	{
		if(n==0)
		{
//			System.exit(n);
			return;
		}
		System.out.println(n);
		
		print(n-1);
	}
}
