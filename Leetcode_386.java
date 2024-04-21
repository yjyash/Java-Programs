package Lec25;

public class Leetcode_386 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=1000;
		LPrint(n,0);
	}
	
	public static void LPrint(int n,int curr)
	{
		if(curr>n)
		{
			return;
		}
		System.out.println(curr);
		int i=0;
		if(curr==0)
		{
			i=1;
		}
		
		for(;i<=9;i++)
		{
			LPrint(n,curr*10+i);
		}
	}

}
