package assignment_4;

import java.util.Scanner;

public class kth_root {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();
		int c = 1;
		while (c <= t) {
			long n = sc.nextLong();
			long k = sc.nextLong();
//			Now we have to find x.
//			 x^k <= n
			pass(n, k);
			c++;
		}
	}

	public static void pass(long n, long k) {
		long lo = 1;
		long hi = n;
		long ans = 0;
		while (lo <= hi) {
			long mid = (hi + lo) / 2;
			if (isitpossible(mid, n, k)) {
				ans = mid;
				lo = mid + 1;
			} else {
				hi = mid - 1;
			}
		}
		System.out.println(ans);

	}

	public static boolean isitpossible(long mid, long n, long k) {
		if (Math.pow(mid, k) <= n) {
			return true;
		} else {
			return false;
		}
	}

}
