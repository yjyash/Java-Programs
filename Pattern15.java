package Pattern;

public class Pattern15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int row=1;
		int n=5;
		int star=n;
		int space=0;
		
		while(row<=n*2-1)
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
			if(row<n)
			{
				star--;
				space+=2;
			}
			else
			{
				star++;
				space-=2;
			}
			
			row++;
			System.out.println();
		}
	}

}
