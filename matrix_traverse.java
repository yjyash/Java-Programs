package Lec24;

public class matrix_traverse {//Maze Path

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int m=3;
		int n=3;
		traverse(m-1,n-1,"",0,0);
	}
	
	public static void traverse(int m,int n,String ans,int l,int r)
	{
		if(l==m && r==n)
		{
			System.out.println(ans);
		}
		
		if(l>m || r>n)
		{
			return;
		}
		traverse(m,n,ans+"h",l,r+1);
		traverse(m,n,ans+"v",l+1,r);
	}

}
