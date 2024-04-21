package assignment_4;

import java.util.*;

public class Spiral_Clockwise {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		int arr[][] = new int[n][m];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		Spiral(arr);
	}

	public static void Spiral(int[][] arr) {
		int minc = 0;
		int minr = 0;
		int maxr = arr.length - 1;
		int maxc = arr[0].length - 1;

		int c = 0;
		int t = arr.length * arr[0].length;

		while (c < t) {
			for (int i = minc; i <= maxc && c < t; i++) {
				System.out.print(arr[minr][i] + ", ");
				c++;
			}
			minr++;
			for (int i = minr; i <= maxr && c < t; i++) {
				System.out.print(arr[i][maxc] + ", ");
				c++;
			}

			maxc--;
			for (int i = maxc; i >= minc && c < t; i--) {
				System.out.print(arr[maxr][i] + ", ");
				c++;
			}
			maxr--;
			for (int i = maxr; i >= minr && c < t; i--) {
				System.out.print(arr[i][minc] + ", ");
				c++;
			}
			minc++;
		}
		System.out.print("END");
	}

}
