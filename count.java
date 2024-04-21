package Lec23;

public class count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String ques = "abc";
		print(ques,"");
	}
	
	public static void print(String ques,String ans)
	{
		if(ques.length()==0)
		{
			System.out.println(ans);
			return;
		}
		char ch = ques.charAt(0);
		print(ques.substring(1),ans);//no
		print(ques.substring(1),ans+ch);//yes
	}

	public static int count(String ques,String ans)
	{
		if(ques.length()==0)
		{
			System.out.println(ans);
			return 1;
		}
		char ch = ques.charAt(0);
		int a = count(ques.substring(1),ans);//no
		int b = count(ques.substring(1),ans+ch);//yes
		return a+b;
	}

}
