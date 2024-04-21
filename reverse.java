package lec1;

public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=274;
		
		int sum=0;
		int rem;
		while (n>0)
		{
			rem=n%10;
			sum=sum*10+rem;
			n=n/10;
			
		}
		System.out.println(sum);
			
	}

}
