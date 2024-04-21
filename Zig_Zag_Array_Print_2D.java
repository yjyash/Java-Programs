package Lec_14;

public class Zig_Zag_Array_Print_2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] arr = { { 10, 20, 30, 40, 50 }, { 60, 70, 80, 90, 100 }, { 110, 11, 12, 13, 14 },
				{ 21, 22, 23, 24, 25 } };
		display(arr);
		System.out.println();

		WavePrint(arr);
	}

	public static void WavePrint(int[][] arr) {
		for (int col = 0; col < arr[0].length; col++) {//col
			if (col % 2 == 0) {
				for (int row = 0; row < arr.length; row++) {//row
					System.out.print(arr[row][col] + " ");
				}

			}

			else {
				for (int row = arr.length - 1; row >= 0; row--) {
					System.out.print(arr[row][col] + " ");
				}
			}
			System.out.println();

		}

	}

	public static void display(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
