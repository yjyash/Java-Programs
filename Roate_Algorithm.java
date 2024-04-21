package Lec8;

public class Roate_Algorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {1,2,3,4,5,6,7};
		int k=3;
		
		Rotate_Array(arr,k);
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		

	}
	public static void Rotate_Array(int []arr,int k)
	{
		int n=arr.length;
		k=k%n;
		Reverse( arr , 0 , n-k-1);//first n-k elements
		Reverse( arr , n-k , n-1);//last k elements
		Reverse(arr, 0, n-1);//All elements
	}
	
	public static void Reverse(int [] arr,int a, int b)
	{
		int i=a;
		int j=b;
		
		while(i<j)
		{
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
	}

}
