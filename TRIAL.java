package assignment_4;

public class TRIAL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr = {1,2,3,4};
		Reverse(arr);
		
	}
	public static void Reverse(int []arr)
	{
		int lo = 0;
		int hi = arr.length-1;
		
		while(lo<=hi)
		{
			int temp = arr[lo];
			arr[lo]=arr[hi];
			arr[hi]=temp;
			lo++;
			hi--;
			
		}
	}

}
