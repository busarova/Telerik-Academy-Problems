package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class HorsePath {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] board = new int[n][n];

        int rows = board.length;
        int cols = board[0].length;

        int[] dRows = {-2, -2, -1, -1, 1, 1, 2, 2};
        int[] dCols = {-1, 1, -2, 2, -2, 2, -1, 1};

        int move = 1;

        for (int i = 0; i < board.length; i++) {

            for (int j = 0; j < board[i].length; j++) {

                int row = i;
                int col = j;
                while (board[row][col] == 0) {

                    board[row][col] = move;
                    move++;

                    for (int index = 0; index < dRows.length; index++) {

                        int nextRow = row + dRows[index];
                        int nextCol = col + dCols[index];

                        if (!inRange(nextRow, rows) || !inRange(nextCol, cols)) {
                            continue;
                        }
                        if (board[nextRow][nextCol] != 0) {
                            continue;
                        }

                        row = nextRow;
                        col = nextCol;
                        break;
                    }
                }
            }
        }
        for (int[] i : board) {
            System.out.println(Arrays.toString(i));
        }
    }

    static boolean inRange(int value, int max) {

        return 0 <= value && value < max;
    }
}

