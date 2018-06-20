package lesson4_loops;

public class Triangle {

    public static void main(String[] args) {
        int rows = 9;
        int cols = 2 * rows - 1;
        int mid = cols / 2;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (j >= mid - i && j <= mid + i) {
                    System.out.print('*');
                } else {
                    System.out.print(' ');
                }
            }

            System.out.println();
        }

    }

}
