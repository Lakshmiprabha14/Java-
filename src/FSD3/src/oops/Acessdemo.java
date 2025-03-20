package oops;
class student{
	public String name ="Ram";
	private int age=20;
	protected String grade="A";
	String school="School";
	
	public void display() {
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
		System.out.println("Grade:"+grade);
		System.out.println("School:"+school);
	}
}

public class Acessdemo {
	public static void main(String [] args) {
		student s1 = new student();
		s1.display();
	}

}
