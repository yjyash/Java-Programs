package Lec36;
import java.util.Stack;
public class Stack_Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<Integer>st = new Stack<>();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		st.push(60);
		st.push(70);
		
		System.out.println(st);
		Reverse(st);
		System.out.println(st);
	}

	public static void Reverse(Stack<Integer> st) {
		if(st.isEmpty())
		{
			return;
		}
		int ex = st.pop();
		Reverse(st);
//		System.out.print(ex+" ");
//		st.push(ex);
		Insert(st,ex);
		
	}
	public static void Insert(Stack<Integer>st,int item)
	{
		if(st.isEmpty())
		{
			st.push(item);
			return;
		}
		int ex = st.pop();
		Insert(st,item);
		st.push(ex);
	}
}
