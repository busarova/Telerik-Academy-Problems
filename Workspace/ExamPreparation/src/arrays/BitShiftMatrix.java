package arrays;

import java.math.BigInteger;
import java.util.Scanner;

public class BitShiftMatrix {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();

        String[] input = sc.nextLine().trim().split(" ");
        int[] moves = new int[m];

        for (int i = 0; i < moves.length; i++) {

            moves[i] = Integer.parseInt(input[i]);
        }

        boolean[][] visited = new boolean[rows][cols];
        int coef = Math.max(rows, cols);
        int row = rows - 1;
        int col = 0;

        for (int move : moves) {

            int nextRow = getRow(move, coef);
            int nextCol = getCol(move, coef);

            int colDir = col < nextCol
                    ? +1
                    : -1;

            while (col != nextCol) {
                visited[row][col] = true;
                col += colDir;
            }

            int rowDir = row < nextRow
                    ? +1
                    : -1;

            while (row != nextRow) {
                visited[row][col] = true;
                row += rowDir;
            }
            visited[row][col] = true;
        }

        BigInteger sum = BigInteger.ZERO;

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (visited[r][c]) {
                    sum = sum.add(getValue(rows - 1 - r, c));
                }
            }
        }
        System.out.println(sum);
    }

    static int getRow(int code, int coef){

        return code / coef;
    }
    static int getCol(int code, int coef){

        return code % coef;
    }

    static BigInteger getValue(int row, int col) {

        int power = row + col;
        BigInteger value = BigInteger.valueOf(2).pow(power);
        return value;
    }
}
