package Pattern;

public class Pattern9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int row=1;
		int n=5;
		int star=1;
		int space=n-1;
		
		while(row<=n)
		{
			int i=1;
			while(i<=space)
			{
				System.out.print("  ");
				i++;
			}
			
			int j=1;
			while(j<=star)
			{
				System.out.print("* ");
				j++;
			}
			
			row++;
			star+=2;
			space--;
			System.out.println();
		}
	}

}
