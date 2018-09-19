package DataStructures.Graph;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

class Coord {

    public int x;
    public int y;
    public int depth;

    public Coord(int x, int y, int depth) {

        this.x = x;
        this.y = y;
        this.depth = depth;
    }

    @Override
    public boolean equals(Object o) {
        Coord c = (Coord) o;
        return c.x == x && c.y == y;
    }
}

public class HorseMatrix {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        char[][] maze = new char[n][n];
        Coord start = null;
        Coord exit = null;

        for (int i = 0; i < maze.length; i++) {

            String temp = sc.nextLine().replaceAll(" ", "");

            for (int j = 0; j < temp.length(); j++) {
                maze[i][j] = temp.charAt(j);
                if (maze[i][j] == 's') {
                    start = new Coord(i, j, 0);

                }
                if (maze[i][j] == 'e') {
                    exit = new Coord(i, j, 0);
                }
            }
        }

       int shortestPathCount =  bfs(start, exit, maze);

        if (shortestPathCount < 0){
            System.out.println("No");
        }else
            System.out.println(shortestPathCount);
    }

    static boolean inRange(int value, int max) {

        return 0 <= value && value < max;
    }

    static int bfs(Coord start, Coord exit, char[][] maze) {

        Queue<Coord> queue = new ArrayDeque<>();
        queue.add(start);

        while (!queue.isEmpty()) {

            Coord node = queue.remove();

            int rows = maze.length;
            int cols = maze[0].length;

            int[] dRows = {-2, -2, -1, -1, 1, 1, 2, 2};
            int[] dCols = {-1, 1, -2, 2, -2, 2, -1, 1};

            for (int i = 0; i < dRows.length; i++) {

                int nextRow = node.x + dRows[i];
                int nextCol = node.y + dCols[i];

                if (!inRange(nextRow, rows) || !inRange(nextCol, cols)) {
                    continue;
                }
                if (maze[nextRow][nextCol] == 'x') {
                    continue;
                }

                Coord next = new Coord(nextRow, nextCol, node.depth + 1);
                queue.add(next);
                maze[nextRow][nextCol] = 'x';

                if (next.equals(exit)) {
                    return next.depth;
                }
            }
        }
        return -1;
    }
}
