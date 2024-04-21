package Lec_Fifteen;

public class Rotate_Matrix_90 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][]arr= {{1,2,3,4} , {5,6,7,8} , {9,10,11,12} , {13,14,15,16}};
		display(arr);
		System.out.println();
		Rotate(arr);
		display(arr);
	}
	
	public static void Rotate(int [][] arr)
	{
		for(int row=0 ; row<arr.length ; row++)
		{
			for (int col=row +1 ; col<arr[0].length ; col++)
			{
				int temp = arr[row][col];
				arr[row][col]= arr[col][row];
				arr[col][row]=temp;
				
			}
		}
		
		
		
		int k;
		for(int row=0; row<arr.length ; row++)
		{
			int temp=arr[0].length-1;
			for(int col=0; col<=(arr[0].length/2)-1 ; col++)
			{
				k=arr[row][col];
				arr[row][col]=arr[row][temp];
				arr[row][temp]=k;
				temp--;
			}
		}
	}
	
	public static void display(int [][]arr)
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
