import java.util.Scanner;

public class Lesson3 {

	/*
	 * new assignment operators a += 2 is the same as a = a + 2 a -= 2 is the same
	 * as a = a - 2 similarly a *= and /=
	 *
	 * Modulus operator % a % 2 == 0
	 *
	 * boolean operations && (and) || (or)
	 * 
	 * char is one byte
	 * int is 4 bytes (most computers)
	 * double 8 byte
	 */
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		String str1 = new String("some string");
		
		int len = str1.length();
		
		System.out.println(len);
		
		/*int a = 5 % 3;
		a -= 2;
		if(a == 0) {
			System.out.println("zero");
		}
		else {
			System.out.println("not zero");
		}*/
		
		// ASCII characters
		
		double x = 1/3;
		
		System.out.println(x);
		
		/*
		 * statement: 5 > 3 == true AND 4 > 1 == true
		 * 5 > 3 AND 1 > 7
		 * 5 < 3 AND 1 > 7
		 * 
		 * 
		 * 5 > 4 OR 4 > 1
		 * 5 > 4 OR 4 < 1
		 * 5 > 10 OR 4 > 8
		 * exclusive 
		 * 
		 * 
		 *   TRUTH TABLE
		 * 
		 *   p        q    |   result
		 *   ---------------------------
		 *   T   AND  T    |    T
		 *   T   AND  F    |    F
		 *   F   AND  T    |    F
		 *   F   AND  F    |    F
		 *   
		 *   T   OR   T    |    T
		 *   T   OR   F    |    T
		 *   F   OR   T    |    T
		 *   F   OR   F    |    F
		 *   
		 *   
		 * --------------
		 *  p = T
		 *  !p  is F
		 *  
		 *  !(p AND q) |  result
		 *  ---------------------
		 *  T       T  |    F
		 *  T       F  |    T
		 *  F       T  |    T				George Bool was an English
		 *  F       F  |    T
		 *  								!(p AND q) == (!p OR !q)    De Morgan's Law
		 *  								!(p OR q) == (!p AND !q)
		 *  
		 *  (!p OR !q) |  result           ~q v p ^ ~p v q ===  ~q 
		 *  ---------------------
		 * 	T      T  |    F
		 *  T      F  |    T
		 *  F      T  |    T
		 *  F      F  |    T
		 *  
		 *   1  AND 0 == 0
		 *    true in cpu is NON-ZERO
		 *    
		 *  
		 *  p OR true == true
		 *  p AND false == false
		 *  
		 * */
		
		
		boolean p = true;
		boolean q = false;
		boolean result1 = !(p && q);
		boolean result2 = (!p || !q);
		
		String someString = read.nextLine();
		
		char c = someString.charAt(0);
		/*char a = 'A';
		if ( c == '+') {
			// do something
		}
		else if( c == '-') {
			// do something else
		}
		else if(c == 'A') {
			// 
		}*/
		
		switch(c) {
		case 'A':
			// do something
			// 
			// 
			break;
		case '_':
			// do stuff
			break;
			
		default:
			///
			///
			/// System.out.print("operation not found");
			///
			break;
		}
		
		System.out.println(c);
		
		/* condition's syntax:
		 * 
		 * if ( logical expression ){
		 *     code to execute
		 * }
		 * 
		 * */
		
		/*
		 * 
		 * 
		 * 10 / 2 = 5 and remainder = 0    10 % 2 = 0
		 * 7 / 2 = 3  and remainder = 1    7 % 2 = 1
		 * 8 / 3 = 2  and remainder = 2    8 % 3 = 2
		 * 
		 * 15 % 1 = 0
		 * 15 % 2 = 1
		 * 15 % 3 = 0
		 * 15 % 4 = 3
		 * 15 % 5 = 0
		 * 15 % 6 = 3
		 * 15 % 7 = 1
		 * 15 % 8 = 7
		 * 15 % 9 = 6
		 * 15 % 10 = 5
		 * 15 % 11 = 4
		 * 15 % 12 = 3
		 * 15 % 13 = 2
		 * 15 % 14 = 1
		 * 15 % 15 = 0
		 * 15 % 16 = 15
		 * 15 % 17 = 15
		 * 15 % 18 = 15
		 * 
		 * 6 % 2 = 0
		 * 7 % 2 = 1
		 * 19 % 2 = 1
		 * 24 % 2 = 0
		 * 
		 * A % B = 0...(B-1)
		 * 
		 * 15 % 3 = (0..2)
		 * 
		 * 
		 * */
		
		System.out.println(15 % 5);
		
		/*System.out.println(result1);
		System.out.println(result2);*/
		
		read.close();
		
	}

}
