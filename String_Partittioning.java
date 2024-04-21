package Lec29;
import java.util.*;
public class String_Partittioning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> ll = new ArrayList<>();
		List<List<String>> ans = new ArrayList<>();
		String ques = "nitin";
		P(ques,ll,ans );
		System.out.println(ans);
	}
	
	public static void P(String ques,List<String> ll ,List<List<String>> ans)
	{
		if(ques.length()==0)
		{
//			System.out.println(ans);
			ans.add(new ArrayList(ll));
			return;
		}
		
		for(int i=1;i<=ques.length();i++)
		{
			String s = ques.substring(0,i);
			if(pal(s)==true)
			{
				ll.add(s);
				P(ques.substring(i),ll,ans);
				ll.remove(ll.size()-1);
			}
			
		}
	}
	public static boolean pal(String s)
	{
		int i=0;
		int j=s.length()-1;
		
		while(i<j)
		{
			if(s.charAt(i)!=s.charAt(j))
			{
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

}
