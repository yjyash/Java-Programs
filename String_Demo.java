package String;

public class String_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "hello";
		String s2 = "hello";
		String s3 = new String("hello");
		String s4 = new String("hello");
		// literal kya hota h bhai

		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		System.out.println(s3 == s4);
		// Upr ki 3 lines me address compare kr rhe h. Checking working of string pool
		// and heap memory concept.
		int[] arr = new int[5];
		System.out.println(arr.length);
		System.out.println(s1.length());// isme length ek method h vahi array me length ek variable h

	}

}
