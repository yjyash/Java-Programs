package Lec7;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr= {2,4,5,1,7,9,1,22,34,56,7,8};
		Reverse(arr,2,6);
		for(int i=0; i<arr.length ;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
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
