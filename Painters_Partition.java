package assignment_4;

import java.util.Arrays;
import java.util.Scanner;

public class Painters_Partition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int n= sc.nextInt();
		int []l =new int[n];
		for(int i=0;i<n;i++)
		{
			l[i]=sc.nextInt();
		}
		
		Arrays.sort(l);
		check(l,k);
	}
	
	public static void check(int []l,int k)
	{
		int lo=1;
		int hi=0;
		for(int val:l)
		{
			hi+=val;
		}
//		System.out.println(hi);
		int ans = 0;
		while(lo<=hi)
		{
			int mid=(lo+hi)/2;
			
			if(check2(l,k,mid)) {
				ans = mid;
				hi=mid-1;
			}
			else {
				lo=mid+1;
			}
		}
		System.out.println(ans);
	}
	
	public static boolean check2(int []l,int k,int mid)
	{
		int p=1;
		int t=0;
		
		for(int i=0;i<l.length;i++)
		{
			if(t+l[i]<=mid)
			{
				t+=l[i];
				
			}
			else {
				p++;
				t=0;
				i--;
			}
			if(p>k)
			{
				return false;
			}
		}
		return true;
	}

}
