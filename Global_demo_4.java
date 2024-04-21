package Lec5;

public class Global_demo_4 {
//Global variable heap  me bnta h aur iske changes sbko dikhte h
	static int val=100;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("hey");
		int a=8;
		int b=7;
		System.out.println(val);
		System.out.println(Add(a,b));
		System.out.println(val);
	}
	
	public static int Add(int a, int b)
	{
		int c=a+b;
		int x=Sub(a,c);
//Local ko zyadaa preference diya jata h aur yha pr val local hh
		int val=80;
		Global_demo_4.val=Global_demo_4.val+5;
		System.out.println(Global_demo_4.val);
		return x+c;
	}
	
	public static int Sub(int a, int b)
	{
		return a-b;
	}


}
