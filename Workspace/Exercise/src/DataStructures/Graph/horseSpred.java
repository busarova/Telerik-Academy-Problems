package DataStructures.Graph;
import java.util.*;

//class Coord {
//
//    public int x;
//    public int y;
//    public int depth;
//
//    public Coord(int x, int y, int depth) {
//
//        this.x = x;
//        this.y = y;
//        this.depth = depth;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        Coord c = (Coord) o;
//        return c.x == x && c.y == y;
//    }
//}

public class horseSpred {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int row = sc.nextInt();
        int col = sc.nextInt();

        int[][] board = new int[n][m];
        Coord start = new Coord(row, col, 1);

        bfs(start, board);

        for (int i = 0; i < n; i++) {

            System.out.println(board[i][m / 2]);
        }
    }

    static boolean inRange(int value, int max) {

        return 0 <= value && value < max;
    }

    static void bfs(Coord start, int[][] board) {

        Queue<Coord> queue = new ArrayDeque<>();
        queue.add(start);

        while (!queue.isEmpty()) {

            Coord node = queue.remove();

            int rows = board.length;
            int cols = board[0].length;

            int[] dRows = {-2, -2, -1, -1, 1, 1, 2, 2};
            int[] dCols = {-1, 1, -2, 2, -2, 2, -1, 1};

            for (int i = 0; i < dRows.length; i++) {

                int nextRow = node.x + dRows[i];
                int nextCol = node.y + dCols[i];

                if (!inRange(nextRow, rows) || !inRange(nextCol, cols)) {
                    continue;
                }
                if (board[nextRow][nextCol] != 0) {
                    continue;
                }

                Coord next = new Coord(nextRow, nextCol, node.depth + 1);
                queue.add(next);
                board[nextRow][nextCol] = next.depth;

            }
        }
    }

}
