package Lec35;

public class Person_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person p = new Person("Yash",20);
		System.out.println(p.getAge()); 
		p.setAge(-9);
		System.out.println(p.getName() + " " + p.getAge());
	}

}
