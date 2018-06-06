import java.util.Scanner;

// ctrl + shift + F  to reformat code
// cmnd + shift + f on mac
public class Lesson2 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		System.out.println("Enter your age");
		int age = reader.nextInt();
		// > < >= <= == !=

		if (age <= 50) {
			System.out.println("Good luck!");
		} else {
			System.out.println("You still have time!");
		}

		reader.close();
	}
}