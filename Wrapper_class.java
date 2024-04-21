package Lec20;

public class Wrapper_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer a=10;
		int a1=10;
		
		System.out.println(a);
		System.out.println(a1);
		
		//Auto-Boxing(stack->heap)
		int b=9;
		Integer b1 = 90;
		b1=b;
		
		//Un-boxing(heap->stack)
		Integer c =89;
		int c1=-1;
		c1=c;
		
		Integer e1=78;
		Integer e2=78;
		Integer e3=178;
		Integer e4=178;
		//Important Question for interviews
		System.out.println(e1==e2);
		System.out.println(e3==e4);
		
	}
	
	

}
