package One_D_Arrays;

import java.util.Scanner;

public class Max_Value {

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

		System.out.println(Max_Value(arr));
	}

	public static int Max_Value(int[] arr) {
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}

}
