package assignment_4;

import java.util.Scanner;

public class Spiral_AntiClockwise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int [][]arr= new int[n][m];
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		spiral(arr);
	}
	
	public static void spiral(int [][]arr)
	{
		int minr = 0;
		int minc = 0;
		int maxr = arr.length-1;
		int maxc = arr[0].length-1;
		
		int c=0;
		int t= maxr*maxc;
		
		while(c<t)
		{
			for(int i = minr ; i<=maxr ;i++)
			{
				System.out.print(arr[i][minc] +", ");
				c++;
			}
			minc++;
			for(int i = minc ; i<=maxc ;i++)
			{
				System.out.print(arr[maxr][i]+", ");
				c++;
			}
			maxr--;
			for(int i = maxr ; i>=minr ;i--)
			{
				System.out.print(arr[i][maxc]+", ");
				c++;
			}
			maxc--;
			for(int i=maxc;i>=minc;i--)
			{
				System.out.print(arr[minr][i]+", ");
				c++;
			}
			minr++;
		}
		System.out.println("END");
		
	}

}
