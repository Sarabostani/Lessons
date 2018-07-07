
public class Functions {
    public static boolean isLeapYear(int year) {

        if ((year % 4 == 0) && (year % 100 != 0) && (year % 400 == 0)) {
            return true;

        } else {
            return false;
        }
    }

    public static int sum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {

            sum = array[i] + sum;
        }
        return sum;

    }

    public static double avg(int[] array) {

        double avg = sum(array) / (double) array.length;

        // return sum(array) / (double) array.length;

        return avg;

    }

    public static boolean containsOdd(int[] array) {
        for (int i = 0; i < array.length; i++) {

            if (array[i] % 2 == 1) {
                return true;
            }

        }

        return false;
    }
}
