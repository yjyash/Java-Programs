package Lec29;

import java.util.Scanner;

public class Rat_Chase_CodeSkiller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc =new Scanner(System.in);
		
		int m =sc.nextInt();
		int n = sc.nextInt();
		char [][] maze = new char[m][n];
		
		for(int i=0;i<maze.length;i++)
		{
			String s = sc.next();
			
			for(int j =0 ;j<s.length();j++)
			{
				maze[i][j] = s.charAt(j);
			}
		}
		int [][]ans =new int[m][n];
		print(maze,0,0,ans);
		if(val==0)
		{
			System.out.println("NO PATH FOUND");
		}
		
	}
	static int val=0;
	public static void print(char[][]maze,int cr,int cc,int [][] ans)
	{
		if(cr ==maze.length-1 && cc==maze[0].length-1 && maze[cr][cc]=='o')
		{
			ans[cr][cc]=1;
			val=1;
//			System.out.println(ans);
			Display(ans);
			return;
		}
		if(cr<0 || cr>=maze.length || cc<0 || cc>=maze[0].length || maze[cr][cc]=='x')
		{
			return;
		}
		maze[cr][cc]='x';
		ans[cr][cc]=1;
		print(maze,cr-1,cc,ans);//up
		print(maze,cr,cc-1,ans);//left
		print(maze,cr+1,cc,ans);//down
		print(maze,cr,cc+1,ans);//right
		maze[cr][cc]='o';
		ans[cr][cc]=0;
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
