package Lec17;

import java.util.Scanner;

public class CB_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		String str = sc.next();
		String s = "81615";
		System.out.println(CountCBNumber(s));

	}

	public static int CountCBNumber(String str) {
		int c = 0;
		boolean[] visited = new boolean[str.length()];
		for (int len = 1; len <= str.length(); len++) {
			for (int j = len; j <= str.length(); j++) {
				int i = j - len;
				String s = str.substring(i, j);
				if (IsCBNumber(Long.parseLong(s)) && Isvisited(visited, i, j - 1)) {
					c++;
					for (int k = i; k <= j - 1; k++) {
						visited[k] = true;
					}
				}
			}
		}
		return c;
	}

	public static boolean Isvisited(boolean[] visited, int si, int  p) {
		for (int i = si; i <=p; i++) {
			if(visited[i]) {
				return false;
			}
			
		}
		return true;
	}

	public static boolean IsCBNumber(long num) {
		if (num == 0 || num == 1) {
			return false;
		}

		int[] arr = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29 };
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == num) {
				return true;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			if (num % arr[i] == 0) {
				return false;
			}
		}
		return true;
	}

}
