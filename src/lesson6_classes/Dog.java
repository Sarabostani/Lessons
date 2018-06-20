package lesson6_classes;

public class Dog {
	int age = 3;
	
	public void sayWoof() {
		Animal animal = new Animal();
		animal.sayStuff();
		
		int w = animal.getWeight();
	}
}
