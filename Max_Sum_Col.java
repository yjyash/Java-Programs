package assignment_4;

import java.util.Scanner;

public class Max_Sum_Col {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [][]arr = new int[n][n];
		
		int []sum = new int[n];
		for(int i = 0; i<n;i++)
		{
			for(int j = 0; j<n ; j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		Max_Col(arr,sum);
	}
	public static void Max_Col(int [][]arr,int []sum)
	{
		int k = 0;
		for(int col = 0; col<arr[0].length ; col++)
		{
			int s = 0;
			for(int row = 0 ;row<arr.length ; row++)
			{
				s+=arr[row][col];
			}
			sum[k++] = s;
		}
		find_max(sum);
	}
	
	public static void find_max(int []arr)
	{
		int max = arr[0];
		int id = 0;
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
				id=i+1;
			}
		}
		System.out.println(id +" "+ max);
		
	}

}

