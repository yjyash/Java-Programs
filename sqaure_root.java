package assignment_4;

import java.util.Scanner;

public class sqaure_root {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc =new Scanner(System.in);
		
		long n = sc.nextLong();
		
		System.out.println(sq(n));
	}
	public static int sq(long n) {
		int x = (int)Math.pow(n, 0.5);
//		System.out.println(x);
//		if(Math.pow(x, 2)==n)
//		{
			return (int)x;
			
//		}
//		else {
//			return (int)Math.floor(x);
//		}
	}

}
