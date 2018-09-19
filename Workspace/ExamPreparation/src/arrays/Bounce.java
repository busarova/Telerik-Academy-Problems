package arrays;

import java.util.Scanner;

public class Bounce {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int cols = sc.nextInt();

        if (rows == 1 || cols == 1) {
            System.out.println(getValue(0, 0));

        } else {

            long result = getValue(0, 0);

            int row = 1;
            int col = 1;

            int rowDir = 1;
            int colDir = 1;


            while (!isAtCorner(row, col, rows, cols)) {

                result += getValue(row, col);

                int nextRow = row + rowDir;

                if (nextRow < 0 || nextRow > rows - 1) {

                    rowDir *= -1;
                }
                int nextCol = col + colDir;

                if (nextCol < 0 || nextCol > cols - 1) {

                    colDir *= -1;
                }

                row += rowDir;
                col += colDir;

            }
            result += getValue(row, col);
            System.out.println(result);
        }
    }

    static boolean isAtCorner(int row, int col, int rows, int cols) {

        return ((row <= 0 || row >= rows - 1) &&
                (col <= 0 || col >= cols - 1));

    }

    static long getValue(int row, int col) {

        int power = row + col;
        return (long) Math.pow(2, power);
    }
}
