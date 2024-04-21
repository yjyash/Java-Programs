package assignment_4;
import java.util.Scanner;
public class lower_Traingle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [][] arr=new int[n][n]; 
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		Lower(arr);
	}
	
	public static void Lower(int [][]arr)
	{
		int flag = 1;
		for(int i = 0 ; i<arr.length ; i++)
		{
			for(int j = i+1 ; j<arr[0].length ; j++)
			{
				if(arr[i][j] != 0)
				{
					System.out.println("false");
					System.exit(0);
				}
			}
		}
		System.out.println("true");
	}

}
