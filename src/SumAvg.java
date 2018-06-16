import java.util.Scanner;

public class SumAvg {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		int[] inputs = new int[5];
		
		System.out.println("Enter 5 digits");
		
		for(int i = 0; i < 5; i++) {
			inputs[i] = reader.nextInt();
		}
		
		double sum = 0;
		for(int i = 0 ; i < 5; i++) {
			sum += inputs[i];
		}
		
		// ['s']['u']['m']
		// double:  [8 byte]   integer :  [4 byte] 
		System.out.println("Enter sum or avg:");
		
		String command = reader.next();
		
		if ( command.equals("sum")) {			
			System.out.println("Sum is : " + sum);
		}
		else if(command.equals("avg")) {			
			System.out.println("Avg is : " + sum/5);
		}
		
		reader.close();
	}

}
