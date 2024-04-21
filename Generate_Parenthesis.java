package Recursion;

public class Generate_Parenthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=3;
		GP(n,0,0,"");
	}
	

	public static void GP(int n,int open,int close,String ans) {
		
		if(open==n &&close==n)
		{
			System.out.println(ans);
			return;
		}
		
		if(open >n || close>open)
		{
			return;
		}
		
		GP(n,open+1,close,ans+"(");
		GP(n,open,close+1,ans+")");
			
	}

}
