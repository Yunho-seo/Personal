package example11;

public class RunningExample {

	public static void main(String[] args) {
		Person person = new Person("Carl Sagan");
		person_information(person);
		Person person_1 = new Student("Carl Sagan", 1);
		person_information(person_1);
	}
	
	private static void person_information(Person person) {
		person.walk();
		
		if(person instanceof Student) {
			Student student = (Student)person;
			student.study();
		}
		
		if(person instanceof Student student) {
			student.study();
		}
	}

}
