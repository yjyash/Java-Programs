package Lec39;

public class Linked_List_Client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		linked_list ll = new linked_list();
		
		ll.addFirst(11);
		ll.addFirst(22);
		ll.addFirst(33);
		ll.addFirst(44);
		ll.addFirst(55);
		ll.traverse();
		
		ll.addLast(60);
		ll.addLast(70);
		ll.addLast(80);
		
		ll.traverse();
		
		ll.addatindex(5, 90);
		ll.traverse();
		
		System.out.println(ll.getLast());
		System.out.println(ll.getFirst());
		System.out.println(ll.getatIndex(5));
		System.out.println(ll.removeFirst());
		ll.traverse();
	}
}
