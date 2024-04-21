package assignment_4;

import java.util.Scanner;

public class Stair_case_Search {

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
		int x = sc.nextInt();

		System.out.println(SearchM(arr,x));
	}

	public static int SearchM(int [][]arr,int x)
	{
		int maxr = arr.length-1;
		int maxc = arr[0].length -1;
		int minr =0;
		int minc=0;
		while(true)
		{
			if(arr[maxr][minc]<x)
			{
				minc++;
			}
			else if(arr[maxr][minc]>x)
			{
				maxr--;
			}
			else {
				return 1;
			}
			if(minc >maxc || maxr<minr)
			{
				return 0;
			}
		}
		
	}
}
