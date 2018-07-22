package lesson4_loops;

import java.util.Scanner;

/*
 * looping in programming:
 * 
 *  for ( index intialization; condition; increment ){
 *     statement; (code)
 *  }
 *  
 *  while( boolean expression ){
 *  
 *     code;
 *  }
 *  
 *  do{
 *  
 *  
 *  }
 *  while(condition)
 *  
 * 
 * 
 * */

public class Lesson4 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
//        int index = 1;

        /*
         * while( index <= 10 ) { System.out.println(index); if( index % 7 == 0) {
         * break; } index++; }
         * 
         * int value = 0;
         * 
         * while(true) { System.out.println("Enter value"); value = read.nextInt();
         * if(value == -1) { break; } System.out.println("you entered " + value);
         * 
         * }
         */

        /*
         * for(int i = 0; i < 10; i++) { System.out.print(i + " "); // nested loop
         * for(int j = 1; j <= 4; j++) { System.out.print(j + " "); }
         * 
         * System.out.println(""); }
         */

        // arrays or vectors
        // [][][][][][][][][][][][][][][]

        // syntax
        /*
         * double[] heights = new double[10];
         * 
         * heights[0] = 32; heights[1] = 10; heights[2] = 11;
         * 
         * System.out.println(heights[3]);
         */

        /*
         * for( int i = 0; i < heights.length; i++) { heights[i] = Math.sin(i*2); }
         */

        // System.out.println(heights[9]);

        /*
         * for( int i = 0; i < heights.length; i++) { System.out.print(heights[i] +
         * " "); }
         */

        for (int i = 1; i <= 8; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        String name = "Houman";

        boolean areEqual = name.equals("Houman");

        if (areEqual) {
            System.out.println("You're awesome");
        }

        name.charAt(0);

        char[] lastName = new char[3]; // "Lee"

        lastName[0] = 'L';
        lastName[1] = 'e';
        lastName[2] = 'f';
        System.out.println("");
        for (int i = 0; i < lastName.length; i++) {
            System.out.print(lastName[i]);
        }
        
        
        read.close();

    }
}
