package Pattern;

public class Pattern10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int row=1;
		int n=5;
		int star=n*2-1;
		int space=0;
		
		while(row<=n)
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
			
			
			row++;
			System.out.println();
			star-=2;
			space++;
		}
	}

}
