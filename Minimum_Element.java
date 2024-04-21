package Array;

public class Minimum_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr = {3,5,6,2,0,4,6,45,1};
		System.out.println(Min(arr));
	}
	
	public static int Min(int []arr)
	{
		int m = arr[0];
		for(int i=1;i<arr.length;i++)
		{
			m = Math.min(m, arr[i]);
		}
		return m;
	}

}
