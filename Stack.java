package Lec36;

public class Stack {

	private int []arr;
	private int idx;
	public Stack() {
		arr = new int [5];
	}
	
	public Stack(int n)
	{
		arr = new int[n];
	}
	
	public boolean isEmpty()
	{
		return idx==0;
	}
	
	public void push(int item) throws Exception
	{
		if(isFull()) {
			throw new Exception("Baklol Stack Full h");
		}
		arr[idx]=item;
		idx++;
	}
	
	public boolean isFull()
	{
		return arr.length==idx;
	}
	
	public int size() {
		return idx;
	}
	
	public int pop() throws Exception{
		if(isEmpty()) {
			throw new Exception("Baklol Stack kahli h");
		}
		idx--;
		return arr[idx];
	}
	
	public int peek() throws Exception{
		if(isEmpty()) {
			throw new Exception("Baklol Stack kahli h");
		}
		return arr[idx-1];
	}
	
	public void Display() {
		for(int i=0;i<idx;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	
	
}
