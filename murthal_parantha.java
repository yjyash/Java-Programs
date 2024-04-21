package assignment_4;

import java.util.Arrays;
import java.util.Scanner;

public class murthal_parantha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc =new Scanner(System.in);
		int p = sc.nextInt();
		int c = sc.nextInt();
		int ranks[] = new int[c];
		for(int i=0;i<c;i++)
		{
			ranks[i]=sc.nextInt();
		}
		Arrays.sort(ranks);
		check(ranks,p);
	}
	
	public static void check(int []rank,int p)
	{
		int lo = 1;
		int hi = 0;
		int i=1;
		while(i<=p)
		{
			hi = hi + rank[rank.length-1] * i;
			i++;
		}
		int ans =0;
		while(lo<=hi)
		{
			int mid = (lo+hi)/2;
			
			if(check2(rank,mid,p))
			{
				ans =mid;
				lo=mid+1;
			}
			else {
				hi=mid-1;
			}
		}
		System.out.println(ans);
	}
	
	public static boolean check2(int []rank,int mid,int p)
	{
		int cook =1;
		int result = 0;
		
	}

}
