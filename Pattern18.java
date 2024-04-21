package Pattern;
import java.util.*;
public class Pattern18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int row=1;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int star=1;
		int space=n/2;
		
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
			
			if(row<=n/2)
			{
				star+=2;
				space--;
			}
			else {
				star-=2;
				space++;
			}
			row++;
			System.out.println();

		}
	}

}
