package assignment_4;

import java.util.Scanner;

public class Boolean_matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc  = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int [][]arr= new int [n][m];
		
		for(int i = 0; i<n ; i++)
		{
			for(int j = 0; j<m ; j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		
		Bools(arr);
	}
	
	public static void Bools(int[][]arr)
	{
		for(int i = 0 ; i<arr.length ; i++)
		{
			for(int j = 0;j<arr[0].length ;j++)
			{
				if(arr[i][j] == 1)
				{
					Makeone(arr,i,j);
					System.exit(0);
				}
			}
		}
	}
	
	public static void Makeone(int [][]arr,int row ,int col)
	{
		for(int i = 0 ; i<arr.length ; i++)
		{
			for(int j = 0; j<arr[0].length;j++)
			{
				if(row == i || col == j)
				{
					System.out.print("1 ");
				}
				else
				{
					System.out.print(arr[i][j]+" ");
				}
			}
			System.out.println();
		}
	}

}
