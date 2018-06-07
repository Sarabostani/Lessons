import java.util.Scanner;

public class Roots {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		System.out.println("For the equation of form ax^2 + bx + c = 0, enter the parameters");
		
		System.out.println("a :");
		double a = read.nextDouble();
		
		System.out.println("b :");
		double b = read.nextDouble();
		
		System.out.println("c :");
		double c = read.nextDouble();
		
		double quad = b*b - 4*a*c;
		
		if (quad < 0) {
			System.out.println("No real roots");
		}
		else if( a == 0 && b != 0) {
			System.out.println("root is : " + (-c/b) );
		}
		else if( quad == 0 && a != 0) {
			double root = -b/(2*a);
			System.out.println("Single root : " + root);
		}
		else if(a != 0) {
			double root1 = (-b + Math.sqrt(quad))/(2*a);
			double root2 = (-b - Math.sqrt(quad))/(2*a);
			
			System.out.println("2 roots found, root 1 : " + root1 + " root 2: " + root2);
		}
		else {
			System.out.println("No roots found");
		}
		
		read.close();

	}

}
