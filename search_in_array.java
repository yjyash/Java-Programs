package Lec22;

public class search_in_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []arr= {2,3,4,5,7,6,2};
		
		int item=11;
		System.out.println(sea(arr,item,0));
	}
	
	public static int sea(int []arr,int item,int ans)
	{

		if(ans==arr.length)
		{
			return -1;
		}
		if(arr[ans]==item)
		{
			return ans;
		}
		
		return sea(arr,item,ans+1);
		
	}

}
