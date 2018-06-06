import java.time.Year;
import java.util.Scanner;

public class Lesson1 {

	public static void main(String[] args) {
		// needed for reading from input
		Scanner reader = new Scanner(System.in);

		System.out.println("Enter the radius:");
		double radius = reader.nextDouble();
		System.out.println("Circumeference is : " + 2 * Math.PI * radius);
		System.out.println("Area is : " + Math.PI * Math.pow(radius, 2)); // also could use Math.pow(radius, 2)
		
		System.out.println("Enter your DOB");
		System.out.println("Day:");
		int day = reader.nextInt();
		System.out.println("Month:");
		int month = reader.nextInt();
		System.out.println("Year:");
		int year = reader.nextInt();

		int age = Year.now().getValue() - year;
		System.out.println("You were born on " + month + "/" + day + "/" + year + " and your age is " + age);

		reader.close();
	}

}
