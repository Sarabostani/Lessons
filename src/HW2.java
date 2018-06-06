import java.util.Scanner;

public class HW2 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Please enter your age");
		int age = reader.nextInt();
		if (age <= 0) {
			System.out.println("That's not correct.");
		} else {
			System.out.println("You are " + age + " years old.");
		}
		
		reader.close();
	}
}
