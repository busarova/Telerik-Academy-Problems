package DataStructures.Graph;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class horseSpredArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int row = sc.nextInt();
        int col = sc.nextInt();

        int[][] board = new int[n][m];
        int[] start = {row, col, 1};

        bfs(start, board);

        for (int i = 0; i < n; i++) {

            System.out.println(board[i][m / 2]);
        }
    }

    static boolean inRange(int value, int max) {

        return 0 <= value && value < max;
    }

    static void bfs(int[] start, int[][] board) {

        Queue<int[]> queue = new ArrayDeque<>();
        queue.add(start);

        while (!queue.isEmpty()) {

            int[] node = queue.remove();

            int rows = board.length;
            int cols = board[0].length;

            int[] dRows = {-2, -2, -1, -1, 1, 1, 2, 2};
            int[] dCols = {-1, 1, -2, 2, -2, 2, -1, 1};

            for (int i = 0; i < dRows.length; i++) {

                int nextRow = node[0] + dRows[i];
                int nextCol = node[1] + dCols[i];

                if (!inRange(nextRow, rows) || !inRange(nextCol, cols)) {
                    continue;
                }
                if (board[nextRow][nextCol] != 0) {
                    continue;
                }

                int[] next = {nextRow, nextCol, node[2] + 1};
                queue.add(next);
                board[nextRow][nextCol] = next[2];

            }
        }
    }
}
