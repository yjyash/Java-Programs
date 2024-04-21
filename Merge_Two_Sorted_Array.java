package Lec32;

public class Merge_Two_Sorted_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []arr1 = {2,3,4,7,10};
		int[] arr2 = {1,3,6,9,30,60};
		
		int[] ans= Merge(arr1,arr2);
		for(int i=0;i<ans.length;i++)
		{
			System.out.println(ans[i]);
		}
	}
	
	public static int[] Merge(int []arr1,int[]arr2)
	{
		int n1=arr1.length;
		int n2=arr2.length;
		int []ans=new int[n1+n2];
		int i=0;
		int j=0;
		int k=0;
		
		while(i<n1 && j<n2)
		{
			if(arr1[i]<arr2[j])
			{
				ans[k++]=arr1[i];
				i++;
			}
			else {
				ans[k++]=arr2[j];
				j++;
			}
		}
		while(i<n1)
		{
			ans[k++]=arr1[i];
			i++;
		}
		while(j<n2)
		{
			ans[k++]=arr2[j];
			j++;
		}
		
		return ans;
		
		
	}

}
