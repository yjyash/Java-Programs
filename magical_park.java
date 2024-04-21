package assignment_4;

import java.util.Scanner;

public class magical_park {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		int k = sc.nextInt();
		int s = sc.nextInt();
		
		char[][] arr = new char[n][m];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				arr[i][j]=sc.next().charAt(0);
			}
		}

		game(arr, k, s);
	}

	public static void game(char[][] arr, int k, int s) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if(arr[i][j]=='.')
				{
					s-=2;
					
				}
				else if(arr[i][j]=='*')
				{
					s+=5;
				}
				else {
					break;
				}
				if(j!=arr[0].length-1)
				{
					s--;
				}
				if(k>s)
				{
					System.out.println("No");
					System.exit(0);
				}
				
			}
		}
		System.out.println("Yes");
		System.out.println(s);
	}

}
