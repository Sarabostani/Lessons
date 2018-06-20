package lesson6_classes;

// Encapsulation: encapsulating all the code in an object

public class Animal {
	
	// by default, all variables and functions are public
	private int weight = 0;
	
	public void sayStuff() {
		System.out.println("woof");
	}
	
	// access modifier
	public String getSound() {
		String sound = "meow";
		return sound;
	}
	
	public void increaseWeight() {
		weight += 5;
	}
	
	public int getWeight() {
		return weight;
	}
	
}
