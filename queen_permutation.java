package Lec27;

public class queen_permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 4;
		boolean[] board = new boolean[n];
		int tq = 2;//total queen
		Per(board,tq,0,"");
		
	}
	
	public static void Per(boolean []board , int tq ,int qpsf , String ans)
	{
		if(tq==qpsf)
		{
			System.out.println(ans);
			return;
		}
		for(int i=0;i<board.length ; i++)
		{
			if(board[i]==false)
			{
				board[i]=true;//placed queen
				Per(board,tq,qpsf+1,ans+"b"+i+"Q"+qpsf);
				board[i]=false;//remove queen undo
			}
		}
	}

}
