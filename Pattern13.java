package Pattern;

public class Pattern13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int row=1;
		int n=5;
		int star=1;
		
		while(row<n*2)
		{
			int i=1;
			while(i<=star)
			{
				System.out.print("* ");
				i++;
			}
			
			if(row<n)
			{
				star++;
			}
			else
			{
				star--;
			}
			row++;
			System.out.println();
			
		}
	}

}
