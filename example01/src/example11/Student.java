package example11;

public class Student extends Person {
	
	public int student_ID;
	
	public Student(String name, int ID) {
		super(name);
		this.student_ID = ID;
	}
	
	public void study() {
		System.out.println("공부를 하다.");
	}
}
