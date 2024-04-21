package Lec32;

public class Merge_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 7, 5, 1, 4, 3 };
		
		int [] ans = Sort(arr,0,arr.length-1);
		
		for(int i=0;i<ans.length;i++)
		{
			System.out.println(ans[i]+" ");
		}
	}

	public static int[] Sort(int []arr,int si,int ei)
	{
		
		if(si == ei)
		{
			int bs[] = new int[1];
			bs[0] = arr[si];
			return bs;
		}
		int mid = (si+ei)/2;
		int [] f = Sort(arr,si,mid);
		int [] s = Sort(arr,mid+1,ei);
		return Merge(f,s);
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
