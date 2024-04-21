package Pattern;

public class Pattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int row=1;
		int n=5;
		int space=n-2;
		int star=n;
		
		while(row<=n)
		{
			if(row==1 || row==n)
			{
				int i=1;
				while(i<=star)
				{
					System.out.print("* ");
					i++;
				}
			}
			else {
				System.out.print("* ");
				int j=1;
				while(j<=space)
				{
					System.out.print("  ");
					j++;
				}
				System.out.print("* ");
			}
			row++;
			System.out.println();
		}
	}

}
