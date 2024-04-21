package lec1;

public class max_min {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=179;
		int b=189;
		int c=189;
		
		if ((a>=b) && (a>=c)) //if first condition is false in case of and then second condition will not be checked
		{
			System.out.println("a is greater");
		}
		else if ((b>=a) && (b>=c))
		{
			System.out.println("b is greater");
		}
		
		else
		{
			System.out.println("c is greater");
		}
	}

}
