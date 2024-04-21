package Array;
import java.util.*;

public class Maximum_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 6, 2, 6, 2, 8,92, 3, 6, 9, 1 };

		System.out.println(Max(arr));
	}

	public static int Max(int[] arr) {
		int m = arr[0];

		for (int i = 1; i < arr.length; i++) {
			m = Math.max(m, arr[i]);
//			System.out.println(m);
		}
		return m;
	}

}
