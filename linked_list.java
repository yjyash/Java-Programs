package Lec39;

public class linked_list {

	class Node{
		int val;
		Node next;
	}
	
	private Node head;
	private Node tail;
	private int size;
	
	
	public void addFirst(int item) // o(1)
	{
		Node nn = new Node();
		nn.val=item;
		if(size==0)
		{
			head = nn;
			tail=nn;
			size++;
		}
		else {
			nn.next = head;
			head= nn;
			size++;
		}
	}
	
	public void traverse() {
		Node temp = head;
		while(temp!=null)
		{
			System.out.print(temp.val +" --> ");
			temp =temp.next;
		}
		System.out.println(".");
	}
	
	public void addLast(int item)
	{
		Node nn = new Node();
		nn.val=item;
		if(size==0)
		{
			head = nn;
			tail=nn;
			size++;
		}
		else {
			tail.next=nn;
			tail=nn;
			size++;
		}
	}
	
	public Node getNode(int k)throws Exception
	{
		if(k<0 || k>size)
		{
			throw new Exception("Please enter valid");
		}
		Node temp = head;
		for(int i=0;i<k;i++)
		{
			temp =temp.next;
		}
		return temp;
		
	}
	
	public void addatindex(int k,int item)throws Exception
	{
		if(k==0)
		{
			addFirst(item);
		}
		else if(k==size)
		{
			addLast(item);
		}
		else {
			Node nn = new Node();
			nn.val=item;
			Node m = getNode(k-1);//fetching k_th element
			nn.next=m.next;
			m.next=nn;
			size++;		
		}
	}
	
	// O(1)
	public int getFirst()
	{
		return head.val;
	}
	
	//O(1)
	public int getLast() {
		return tail.val;
	}
	
	//O(N)
	public int getatIndex(int k)throws Exception
	{
		return getNode(k).val;
	}
	
	//O(1)
	public int removeFirst() {
		Node temp = head;
		if(size==1)
		{
			head=null;
			tail=null;
			size--;
	
		}
		else {
			head=head.next;
			temp.next=null;
			size--;
		}
		return temp.val;
		
	}
	
	// O(N)
	public int removeLast() throws Exception {
		if(size==1)
		{
			return removeFirst();
		}
		else {
			Node prev = getNode(size-2);
			int rv = tail.val;
			tail=prev;
			tail.next=null;
			size--;
			return rv;
		}
	}
	
	// O(N)
	public int removeatIndex(int k) throws Exception
	{
		if(k==0)
		{
			return removeFirst();
		}
		else if(k==size-1)
		{
			return removeLast();
		}
		else {
			Node curr= getNode(k);
			Node prev = getNode(k-1);
			prev.next = curr.next;
			curr.next=null;
			size--;
			return curr.val;
		}
	}
}
