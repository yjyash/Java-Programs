package Lec4;

public class decimal_to_binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=57;
		int sum=0;
		int mul=1;
		
		while (n>0)
		{
			int rem=n%2;
			sum=sum+rem*mul;
			n=n/2;
			mul=mul*10;
			
		}
		System.out.println(sum);
	}

}
