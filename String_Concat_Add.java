package Strings;

public class String_Concat_Add {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "hello";// pool
		String s2 = "hello";// pool

		System.out.println(s1 == s2);// true
		String sm = s1 + s2;// heap

		String s = new String(s1 + s2);// heap
		System.out.println(sm);

		String s3 = s1.concat(s2);// heap
		System.out.println(s3);
		System.out.println(s1 == s2);// true

		String s4 = "Kaaju" + s1;// heap

		String s5 = "Kaaju" + "Katli";// pool

		String s6 = "KaajuKatli";// pool
		System.out.println(s6 == s5);// true

		System.out.println("hello" + 10 + 30 + "ok" + 40);

		System.out.println(5 + 10 + "hello" + 5 + 3);

		System.out.println("Hey" + (10 + 30) + "Bye" + 4 + 2);

		System.out.println(2 + 2 + 42 + 24 + 11 + "heelo");

		System.out.println("ok" + 31 + 33 + 13 + 14);

		System.out.println(2 + 2 + 1 + 1 + "okay" + 2 + 4 + 1);

		System.out.println(10 + 20 + ("hello" + 2) + 82 + "okay");
		
		
	}

}
