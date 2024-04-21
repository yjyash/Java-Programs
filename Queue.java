package Lec36;

public class Queue {

	private int []arr;
	private int front;
	private int size;
	
	public Queue()
	{
		arr = new int[5];
	}
	public Queue(int n)
	{
		arr= new int[n];
	}
	
	public boolean isEmpty()
	{
		return size==0;
	}
	
	public boolean isFull() {
		return size ==arr.length;
	}
	
	public int size() {
		return size;
	}
	
	public void Enqueue(int item) throws Exception {
		if(isFull())
		{
			throw new Exception("Baklol Queue Full h");
		}
		int idx = (front+size)%arr.length;
		arr[idx]=item;
		size++;
	}
	
	public int Dequeue() throws Exception
	{
		if(isEmpty())
		{
			throw new Exception("Baklol Queue Kahli h");
		}
		int v = arr[front];
		front=(front+1)%arr.length;
		size--;
		return v;
	
	}
	
	public int getFront() throws Exception{
		if(isEmpty())
		{
			throw new Exception("Baklol Queue Kahli h");
		}
		int v = arr[front];
		return v;
	}
	
	public void Display()
	{
		for(int i=0;i<size;i++)
		{
			int idx = (front+i)%arr.length;
			
			System.out.print(arr[idx]+" ");
		}
		System.out.println();
	}
}



















