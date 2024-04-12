package example13;

public class AbstractRun {
	
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.sound();
		Cat cat = new Cat();
		cat.sound();
		
		sound_animals(dog);
		sound_animals(cat);
		
		// 임시객체
		sound_animals(new Dog());
		sound_animals(new Cat());
	}
	
	public static void sound_animals(Animal animal) {
		animal.sound();
	}
}
