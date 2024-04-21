package Lec35;

public class Person {

	private String name = "Raj";
	private int age = 18;

	public Person() {
		
	}
	// constructor
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age){
		
		try {
		if(age<0)
		{
//			return;
			throw new Exception("baklol age -ve ni hoti ");
		}
		this.age = age;
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally {
			System.out.println("Aage se +ve age dena");
		}
		
	}

}
