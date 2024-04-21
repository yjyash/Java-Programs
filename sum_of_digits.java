package lec1;

public class sum_of_digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=454;
		int sum=0;
		int r;
		while(n>0)
		{	
			r=n%10;
			n=n/10;
			sum=sum+ r;
		}
		System.out.println(sum);
			
	}

}
