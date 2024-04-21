package assignment_4;
import java.util.Scanner;
public class Rotate_Array_90 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int [][]arr= new int[n][n];
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = sc.nextInt();

			}
		}
		Rotate(arr);

	}
	
	public static void Rotate(int [][]arr)
	{
		for(int i = 0;i<arr.length ;i++)
		{
			Reverse(arr[i]);
		}
		Transpose(arr);
		Display(arr);
	}
	
	public static void Transpose(int[][] arr) {

		for (int row = 0; row < arr.length; row++) {
			for (int col = row + 1; col < arr[0].length; col++) {

				int temp = arr[row][col];
				arr[row][col] = arr[col][row];
				arr[col][row] = temp;
			}
		}
	}
	
	public static void Reverse(int []arr)
	{
		int lo = 0;
		int hi = arr.length-1;
		
		while(lo<hi)
		{
			int temp = arr[lo];
			arr[lo]=arr[hi];
			arr[hi]=temp;
			lo++;
			hi--;
		}
	}
	
	public static void Display(int [][]arr)
	{
		for(int row=0 ; row<arr.length; row++)
		{
			for (int col=0 ; col<arr[0].length ; col++)
			{
				System.out.print(arr[row][col] +" ");
			}
			System.out.println();
		}
	}

}
