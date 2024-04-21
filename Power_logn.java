package Lec33;

public class Power_logn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n =3;
		int a=3;
		System.out.println(pow(a,n));
	}
	
	public static int pow(int a,int n)
	{
		if(n==1)
		{
			return a;
		}
		int ans = pow(a,n/2);
		ans = ans*ans;
		if(n%2!=0)
		{
			ans*=a;
		}
		
		return ans;
	}

}
