package One_D_Arrays;

import java.util.Scanner;

public class Array_Reverse_Range {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of Array :");
		int n = sc.nextInt();

		int[] arr = new int[n];
		System.out.println("Enter Array items : ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		ReverseRange(arr,3,7);
		Display(arr);
	}

	public static void ReverseRange(int[] arr,int i,int j) {
		int lo = i;
		int hi = j;
		while (lo < hi) {
			int temp = arr[lo];
			arr[lo] = arr[hi];
			arr[hi] = temp;
			lo++;
			hi--;
		}
	}

	public static void Display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
