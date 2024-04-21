package Lec20;
import java.util.*;
public class Divisible_Subarrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []arr= {1,2,3,4,6};
		Sub(arr);
	}
	
	public static void Sub(int[]arr) {
	        // Write your code here
		
		long sum=0;
		int n =arr.length;
		long[] freq = new long[n];
		freq[0] = 1;
		
		for(int i=0;i<n;i++)
		{
			sum +=arr[i];
			int  idx = (int)(sum%n);
			freq[idx] = freq[idx]+1;
			if(idx<0)
			{
				idx+=n;
			}
			freq[idx] = freq[idx]+1;
		}
		
		long ans =0;
		
		for(int i=0;i<freq.length;i++)
		{
			long p = freq[i];
			if(p>=2)
			{
				ans =ans  + (p*(p-1))/2;
			}
		}
		
		
	    }

}
