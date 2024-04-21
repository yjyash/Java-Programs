package Array;

public class Maximum_SubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(MAXS(arr));
	}

	public static int MAXS(int[] arr) {
		int[] narr = new int[arr.length];
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
			sum+=arr[i];
			narr[i] = sum;
			System.out.println(sum);
		}
		
		return getmax(narr);
	}
	
	public static int getmax(int []arr)
	{
		int m = arr[0];
		for(int i=1;i<arr.length;i++)
		{
			m = Math.max(m, arr[i]);
		}
		return m;
	}

}
