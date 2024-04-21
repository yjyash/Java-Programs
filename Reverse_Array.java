package Array;
import java.util.*;
public class Reverse_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		int [] arr = new int [5];
//		for(int i=0;i<arr.length;i++)
//		{
//			arr[i]=sc.nextInt();
//		}
		int []arr = {6,4,3,2,1};
		Reverse(arr);
		Display(arr);
	}
	
	public static void Reverse(int []arr)
	{
		int lo = 0;
		int hi = arr.length-1;
		
		while(lo<hi)
		{
			int temp = arr[lo];
			arr[lo] = arr[hi];
			arr[hi] = temp;
			lo++;
			hi--;
		}
	}
	
//	public static int [] Reverse(int []arr)
//	{
//		int [] lelo = new int[arr.length];
//		int j=0;
//		for(int i = arr.length-1 ; i>=0 ; i--)
//		{
//			lelo[j++]=arr[i];
//		}
//		return lelo;
//	}
	public static void Display(int []arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i] + " ");
		}
	}

}
