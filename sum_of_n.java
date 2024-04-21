package lec1;

public class sum_of_n {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		int i =1;
		int sum=0;
		while (i<=n)
		{
			sum+=i;//sum=sum+i
			System.out.println(i++);;
		}
		System.out.println(sum);
		
	}

}
