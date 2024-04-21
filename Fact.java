package Lec22;

public class Fact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=5;
		System.out.println(fac(5));
	}
	
	public static int fac(int n)
	{
		if(n==0) {
			return 1;
		}
		int sp = fac(n-1);//24
		return sp*n;
	}

}
