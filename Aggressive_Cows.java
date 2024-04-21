package assignment_4;

import java.util.Arrays;
import java.util.Scanner;

public class Aggressive_Cows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int stall = sc.nextInt();
		int nc = sc.nextInt();
		int []arr = new int[stall];
		for(int i=0;i<stall;i++)
		{
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		check(arr,nc);
	}
	
	public static void check(int []arr,int nc)
	{
		int lo = 1;
		int hi = arr[arr.length-1]-arr[0];
		int ans=0;
		while(lo<=hi)
		{
			int mid = (lo+hi)/2;
			if(check2(arr,mid,nc)) {
				ans=mid;
				lo=mid+1;
			}
			else {
				hi=mid-1;
			}
		}
		System.out.println(ans);
	}
	
	public static boolean check2(int []arr,int mid,int nc)
	{
		int c=1;
		int place = arr[0];
		
		for(int i=1;i<arr.length &&c<nc ; i++)
		{
			if(arr[i]-place>=mid)
			{
				c++;
				place = arr[i];
			}
		}
		if(c==nc)
		{
			return true;
		}
		else {
			return false;
		}
	}

}
