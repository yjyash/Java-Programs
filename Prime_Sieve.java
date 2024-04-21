package Lec31;

import java.util.Iterator;

public class Prime_Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=100;
		Prime_Sieve(n);
	}
	//false mtlb prime true mtlb not prime
	public static int Prime_Sieve(int n)
	{
		int c=0;
		boolean []prime=new boolean[n];
		prime[0]=true;
		prime[1]=true;
		for (int i = 2; i*i <= prime.length; i++) {
			if(prime[i]==false)//prime
			{
				for (int j = 2; i*j < prime.length; j++) {
					prime[i*j]=true;
				}
			}
		}
		for(int i=2;i<prime.length;i++)
		{
			if(prime[i]==false)
			{
				c++;
			}
		}
		return c;
	}

}
