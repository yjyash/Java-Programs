package Lec7;

public class Largest_in_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr= {3,2,1,7,8,9,11,13};
		/*int max=arr[0];
		for (int i=1; i<arr.length ; i++)
		{
			if(max<arr[i])
			{
				max=arr[i];
			}
		}*/
		System.out.println(max(arr));
		
	}
	public static int max(int []arr)
	{
		int m=arr[0];
		for(int i=1; i<arr.length ; i++)
		{
			if(arr[i]>m)
			{
				m=arr[i];
			}
		}
		return m;

	}

}
