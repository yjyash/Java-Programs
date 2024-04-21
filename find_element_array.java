package Recursion;

public class find_element_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []arr= {2,33,5,4,62,1};
		int e = 4;
		System.out.println(pass(arr,e,0));
	}
	
	public static int pass(int []arr,int e,int idx)
	{
		if(idx==arr.length)
		{
			return -1;
		}
		if(arr[idx]==e)
		{
			return idx;
		}
		
		return pass(arr,e,idx+1);
	}

}
