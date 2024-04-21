package assignment_4;

import java.util.Scanner;

public class Wave_Print_Column_Wise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		int[][] arr = new int[n][m];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				arr[i][j] = sc.nextInt();

			}
		}

		Column_Wise(arr);

	}
	
	
	
	public static void Column_Wise(int[][] arr) {
		
		for(int col = 0 ; col<arr[0].length ; col++)
		{
			if(col %2!=0)
			{
				int row=arr.length-1;
				while(row>=0)
				{
					System.out.print(arr[row][col] + ", ");
					row--;
				}
			}
			else
			{
				int row = 0;
				while(row<arr.length)
				{
					System.out.print(arr[row][col] + ", ");
					row++;
				}
			}
		}
		System.out.print("END");
	}

}
