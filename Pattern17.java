package Pattern;
import java.util.*;

public class Pattern17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		
		int row=1;
		int star=n/2;
		int space=1;
		
		while(row<=n)
		{
			int i=1;
			while(i<=star)
			{
				System.out.print("* ");
				i++;
			}
			
			int j=1;
			while(j<=space)
			{
				System.out.print("  ");
				j++;
			}
			
			i=1;
			while(i<=star)
			{
				System.out.print("* ");
				i++;
			}
			
			if(row<=n/2)
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
