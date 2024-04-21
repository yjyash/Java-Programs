package Lec20;
import java.util.*;
public class Array_List_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList <Integer> ll = new ArrayList<>();
		System.out.println(ll);
		
		//Size
		System.out.println(ll.size());//to get length of arraylist
		
		//Add
		ll.add(10);//auto-boxing
		ll.add(20);//Add element at last  -> O(1)
		ll.add(30);
		System.out.println(ll);
		
		ll.add(1,4);//Add element at particular index -> O(n)
		System.out.println(ll);
		
		//Get
		System.out.println(ll.get(3));
		
		//Remove
		System.out.println(ll.remove(2));
		System.out.println(ll);
		
		//Set
		ll.set(1, -30);
		System.out.println(ll);
		
		for(int i=0;i<ll.size();i++)
		{
			System.out.print(ll.get(i) +" ");
		}
		System.out.println();
		//for_each
		
		for(int v : ll) {//unboxing
			System.out.print(v +" ");
		}
		
	}

}
