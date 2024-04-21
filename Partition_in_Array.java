package Lec32;

public class Partition_in_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 2, 5, 2, 7, 1, 7, 3 };
		int idx = Partition(arr, 0, arr.length - 1);

		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println(idx);
	}

	public static int Partition(int[] arr, int si, int ei) {

		int item = arr[ei];
		int idx = si;

		for (int i = si; i < ei; i++) {
			if (arr[i] < item) {
				int temp = arr[i];
				arr[i] = arr[idx];
				arr[idx] = temp;
				idx++;
			}
		}
		
		int temp = arr[ei];
		arr[ei]=arr[idx];
		arr[idx]=temp;
		
		return idx;

	}

}
