package Lec23;

public class coin_toss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=4;
		print(n,"");
	}
	
	public static void print(int n,String ans)
	{
		if(n==0)
		{
			System.out.println(ans);
			return;
		}
		if(ans.length()==0 || ans.charAt(ans.length()-1) != 'h' )//this line stops the printing of consecutive "h"
		{
			print(n-1,ans+"h");
		}
		print(n-1,ans+"t");
	}

}
