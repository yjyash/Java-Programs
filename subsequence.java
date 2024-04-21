package Recursion;

public class subsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String ques="abc";
		sub(ques,"");
	}
	
	public static void sub(String ques,String ans)
	{
		if(ques.length()==0)
		{
			System.out.println(ans);
			return;
		}
			
		char ch = ques.charAt(0);
		sub(ques.substring(1),ans);
		sub(ques.substring(1),ans+ch);
	}

}
