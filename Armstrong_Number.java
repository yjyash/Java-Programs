package Lec5;
import java.util.*;
public class Armstrong_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(is_armstrong(n));
	}
	
	public static boolean is_armstrong(int n)
	{
		int n1=n;
		int count=count(n);
		int sum=0;
		while(n>0)
		{
			int rem=n%10;
			sum +=(int)Math.pow(rem, count);
			n=n/10;
		}
		//System.out.println(sum);
		if(n1==sum)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static int count(int n)
	{
		int count=0;
		while(n>0)
		{
			n=n/10;
			count++;
		}
		return count;
	}

}
