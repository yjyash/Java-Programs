package Lec30;

public class Chess_queen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=4;
		//Take any matrix of boolean or int or char
		
		int [][]board = new int [n][n];
		Print(board,n,0);
	}
	
	public static void Print(int [][]board, int tq, int row)
	{
		if(tq==0)
		{
			Display(board);
			System.out.println();
			return;
		}
		for(int col=0;col<board[0].length;col++) {
			if(isitsafe(board,row,col)) {
				board[row][col]=1;
				Print(board,tq-1,row+1);
				board[row][col]=0;
			}
		}
	}
	
	public static boolean isitsafe(int [][]board,int row,int col)
	{
		
		//col
		int r = row;
		while(r>=0)
		{
			if(board[r][col]==1)
			{
				return false;
			}
			r--;
		}
		
		//left diagonal
		r=row;
		int c=col;
		while(c>=0&&r>=0)
		{
			if(board[r][c]==1)
			{
				return false;
			}
			r--;
			c--;
		}
		
		//right diagoneal
		r=row;
		c=col;
		while(c<board[0].length && r>=0)
		{
			if(board[r][c]==1)
			{
				return false;
			}
			r--;
			c++;
		}
		return true;

	}
	
	
	public static void Display(int [][]arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[0].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
