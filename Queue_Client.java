package Lec36;

public class Queue_Client {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		Queue q = new Queue();
		q.Enqueue(10);
		q.Enqueue(20);
		q.Enqueue(30);
		q.Enqueue(40);
		q.Enqueue(50);
//		q.Enqueue(60);
//		q.Enqueue(70);
		System.out.println(q.Dequeue());
		System.out.println(q.Dequeue());
		q.Enqueue(60);
		System.out.println(q.getFront());
		q.Display();
	}

}
