package lesson5_functions;

public class Functions {

    /*
     * functions or sub-routine or method
     * 
     * f(x) = x^2 + 2x
     * 
     * syntax: <access_modifer> <type> name(arguments){ code; }
     * 
     * access modifiers : public, private, protected type: double, int, String, ....
     * and void arguments : list of parameters that the functions receives example:
     * public double pow(double a, double b) { does stuff; }
     * 
     * 'return' keyword stops the execution of the function immediately and returns
     * the value
     * 
     * function signature : combination of return type, function name, and
     * parameters
     */
    public static void main(String[] args) {
        // function call (executing a function)
        sayHi(3);

        int result = sum(4, 5); // 9
        System.out.println(result);

//        int x = sum(2, 3);

        result = sum(4, 5, 6);
        System.out.println(result);

        int maximum = max(6, 17);
        System.out.println(maximum);

        String sayj = sayJolly("holy");
        System.out.println(sayj);
    }

    // function definition
    public static void sayHi(int a) {
        for (int i = 0; i < a; i++) {
            System.out.println("Hi there");
        }
    }

    // takes 2 numbers and returns the sum
    public static int sum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    // takes 3 numbers and returns the sum
    // overloading a function
    public static int sum(int a, int b, int c) {
        int sum = a + b + c;
        return sum;
    }

    // returns the max of 2 numbers
    public static int max(int a, int b) {
        if (a > b) {
            return a;
        }

        return b;
    }

    // a function that gets a string, appends "jolly" to it and returns the new
    // String
    public static String sayJolly(String str) {
        String j = str + " jolly";
        return j;
    }

    public static boolean isLeapYear(int year) {
        return year % 4 == 0 && year % 100 == 0 && year % 400 == 0;
    }

}
