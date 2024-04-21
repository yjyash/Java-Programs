package Recursion;

public class Board_Path {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		printans(n,0,"");
		
	}
	//curr -> current position
	//end -> n
	public static void printans(int n,int curr, String ans) {
		
		if(curr==n)
		{
			System.out.println(ans);
			return;
		}
		if(curr>n)
		{
			return;
		}
		for(int dice = 1;dice<=3;dice++) {
			printans(n,curr+dice,ans+dice);
		}
//		printans(n,curr+1,ans+1);
//		printans(n,curr+2,ans+2);
//		printans(n,curr+3,ans+3);
		
	}
}
