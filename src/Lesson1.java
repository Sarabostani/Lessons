import java.util.Scanner;

public class Lesson1 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int x = 0;
		int y = 0;
		System.out.println("enter number 1");
		
		x = reader.nextInt();
		
		System.out.println("enter number 2");
		y = reader.nextInt();

		System.out.println(x + y);

		System.out.println("enter number 3");
		int z = reader.nextInt();
		double root = Math.sqrt(z);
		System.out.println("Root is = " + root);

		System.out.println("PI is = " + Math.PI);

		reader.close();
	}

}
