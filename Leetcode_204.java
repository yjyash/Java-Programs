package Lec31;

public class Leetcode_204 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(checkPrime(6));
		
	}
	
	public static boolean checkPrime(int n)
	{
		int div=2;
		while(div*div<=n)
		{
			if(n%div==0)
			{
				return false;
			}
			div++;
		}
		return true;
	}
	

}
