package Lec8;

public class Insertion_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []arr= {6,98,2,1,8};
		Sort(arr);
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void Sort(int []arr)
	{
		for(int i=1; i<arr.length;i++)
		{
			Insert_Element(arr,i);
		}
	}
	
	public static void Insert_Element(int []arr, int i)
	{
		int j=i-1;
		int item=arr[i];
		while(j>=0 && arr[j]>item)
		{
			arr[j+1]=arr[j];
			j--;
		}
		arr[j+1]=item;
	}

}
