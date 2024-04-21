package One_D_Arrays;

import java.util.Scanner;

public class Linear_Search {

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
		System.out.println("Enter item :");
		int item = sc.nextInt();

		System.out.println(LinearSearch(arr, item));
	}

	public static int LinearSearch(int[] arr, int item) {

		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==item)
			{
				return i;
			}
		}
		return -1;
	}

}
