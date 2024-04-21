package Lec22;

public class Print_dec_inc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=5;
		pdi(n);
	}
	
	public static void pdi(int n)
	{
		if(n==0)
		{
			return;
		}
			
		System.out.println(n);
		pdi(n-1);
		System.out.println(n);
	}

}
