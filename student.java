package Lec35;

public class student {

	private String name = "Raj";
	private int age = 19;
	
	
//	public void setName(String name)
//	{
//		this.name = name;
//	}
//	
//	public String getName()
//	{
//		return this.name;
//	}
	
//	//constructor
	public student() {
		
	}
	
	
	//constructor with parameters
	public student(String name,int age)
	{
		this.name=name;
		this.age=age;
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


	public void setAge(int age) {
		this.age = age;
	}

}
