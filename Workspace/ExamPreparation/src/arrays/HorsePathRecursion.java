package arrays;

import java.util.Scanner;

public class HorsePathRecursion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] board = new int[n][n];

        nextEmpty(board);

        for (int[] i : board) {
            for (int j: i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    static void nextEmpty(int[][] board) {
        int[] move = {1};

        for (int i = 0; i < board.length; i++) {

            for (int j = 0; j < board[i].length; j++) {


                if (board[i][j] != 0) {
                    continue;
                }
                followHorsePath(move, i, j, board);
            }
        }
    }

    static boolean inRange(int value, int max) {

        return 0 <= value && value < max;
    }

    static void followHorsePath(int[] move, int row, int col, int[][] board) {

        board[row][col] = move[0];
        move[0]++;

        int rows = board.length;
        int cols = board[row].length;

        int[] dRows = {-2, -2, -1, -1, 1, 1, 2, 2};
        int[] dCols = {-1, 1, -2, 2, -2, 2, -1, 1};

        for (int i = 0; i < dRows.length; i++) {

            int nextRow = row + dRows[i];
            int nextCol = col + dCols[i];

            if (!inRange(nextRow, rows) || !inRange(nextCol, cols)) {
                continue;
            }
            if (board[nextRow][nextCol] != 0) {
                continue;
            }

            followHorsePath(move, nextRow, nextCol, board);
            return;
        }
    }
}

