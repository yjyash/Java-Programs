package Lec34;

public class student_client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		student s = new student();
		s.name= "Yash";
		s.age=19;
		System.out.println(s.name);
		System.out.println(s.age);
		s.Intro_yourself();
		
		student s1 = new student();
		s1.name="Jain";
		s1.age=20;
		s1.Intro_yourself();
		
		s1.SayHey("Raju");
		student.Mentor_Name();
//		s1.Mentor_Name();//refer for warning for more knowledge.
		
	}
	
	static {
		System.out.println("hello me");
	}

}
