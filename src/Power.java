
public class Power {

	public static void main(String[] args) {
		System.out.print(1 + " ");
		int base = 2;
		
		for(int power = 1; power <= 16; power++) {
			base = 2;
			for (int j = 1; j < power; j++) {
				base = base * 2;
				/// 2x2x2x2x2 power times
			}
			
			System.out.print(base + " ");
		}

	}

}
