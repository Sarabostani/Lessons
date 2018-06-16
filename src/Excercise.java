
public class Excercise {

	public static void main(String[] args) {
		int n = 0;

		for (int i = 1; i <= 10; i++) {
			System.out.print(i + " ");
			n = n + i;
		}
		System.out.println();// I wrote this to move the "sum is 55" to next line, but it didn't work.
		System.out.print("sum is " + n);

	}
}
