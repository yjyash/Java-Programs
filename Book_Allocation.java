package assignment_4;

import java.util.Arrays;
import java.util.Scanner;

public class Book_Allocation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();

		while (t-- > 0) {
			int books = sc.nextInt();
			int stu = sc.nextInt();
			int pages[] = new int[books];
			for (int i = 0; i < books; i++) {
				pages[i] = sc.nextInt();
			}

			Arrays.sort(pages);

			check(pages, stu);
		}

	}

	public static void check(int[] pages, int stu) {
		int lo = 0;
		int hi = 0;
		for (int i = 0; i < pages.length; i++) {
			hi += pages[i];
		}

		int ans = 0;

		while (lo <= hi) {
			int mid = (lo + hi) / 2;
			if (check2(pages, mid, stu)) {
				ans = mid;
				hi = mid - 1;
			} else {
				lo = mid + 1;
			}
		}
		System.out.println(ans);
	}

	public static boolean check2(int[] pages, int mid, int stu) {
		int s = 1;
		int rp = 0;
		for (int i = 0; i < pages.length; i++) {
			if (rp + pages[i] <= mid) {
				rp += pages[i];
			} else {
				s++;
				rp = 0;
				i--;
			}
		}
		if (s > stu) {
			return false;
		} else {
			return true;
		}
	}

}
