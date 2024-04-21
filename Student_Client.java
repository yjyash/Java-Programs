package Lec35;

public class Student_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		student s1 = new student();
		student s2 = new student("Yash",20);
		student s3 = new student("",-1);
		
		
		s1.setName("Jain");
		System.out.println(s1.getName()); 
		
		
	}

}
