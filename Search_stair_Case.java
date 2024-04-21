package Lec_14;

public class Search_stair_Case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][]arr= { {1,2,3,4,5} , {2,3,4,5,6} , {3,4,5,6,7} , {4,5,6,7,8} };
		
		int item =5;
		
	}

	public static boolean Search(int [][]arr,int item)
	{
		int row=arr.length-1;
		int col=0;
		
		while(row>=0 && col <arr[0].length)
		{
			if(arr[row][col]==item)
			{
				return true;
			}
			else if(arr[row][col]>item)
			{
				row--;
			}
			else {
				col++;
			}
		}
		return false;
	}
}
