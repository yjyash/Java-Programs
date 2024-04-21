package Lec22;

public class power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=3;
		int n=4;
		System.out.println(pow(3,4));
	}
	
	public static int pow(int a,int n)
	{
		if(n==0) {
			return 1;
		}
		int sp= pow(a,n-1);
		
		return sp*a;
	}

}
