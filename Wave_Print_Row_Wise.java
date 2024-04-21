package assignment_4;

import java.util.Scanner;

public class Wave_Print_Row_Wise {

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

		Row_Wise(arr);

	}

	public static void Row_Wise(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
				if(i%2!=0)
				{
					int j = arr[0].length-1;
					while(j>=0)
					{
						System.out.print(arr[i][j] + ",");
						j--;
					}
				}
				else {
					int j = 0;
					while(j< arr[0].length)
					{
						System.out.print(arr[i][j] + ",");
						j++;
					}
				}
		}
		System.out.print("END");
	}


}