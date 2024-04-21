package Pattern;

public class Pattern14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int row=1;
		int n=5;
		int star=1;
		int space=n-1;
		
		while(row<n*2)
		{
			int j=1;
			while(j<=space)
			{
				System.out.print("  ");
				j++;
			}
			int i=1;
			while(i<=star)
			{
				System.out.print("* ");
				i++;
			}
			
			if(row<n)
			{
				star++;
				space--;
			}
			else
			{
				star--;
				space++;
			}
			row++;
			System.out.println();
			
		}
	}

}
