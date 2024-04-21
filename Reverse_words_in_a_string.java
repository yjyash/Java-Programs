package Lec17;

public class Reverse_words_in_a_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "  a  good     example";
		System.out.println(Reversewords(s));

	}
	
	public static String Reversewords(String s)
	{
		s = s.trim();
		String []arr = s.split("\s+");
		String ans="";
		for(int i =arr.length-1 ; i>=0; i--)
		{
			ans = ans+arr[i]+" ";
		}
		return ans.trim();
	}

}
