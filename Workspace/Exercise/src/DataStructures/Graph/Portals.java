package DataStructures.Graph;

import java.util.ArrayList;
import java.util.Scanner;

class Point {

    public int x;
    public int y;
    public int power;


    public Point(int x, int y, int power) {

        this.x = x;
        this.y = y;
        this.power = power;
    }

    @Override
    public boolean equals(Object o) {
        Point c = (Point) o;
        return c.x == x && c.y == y;
    }
}

public class Portals {

    ArrayList<ArrayList<Point>> paths = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int startX = sc.nextInt();
        int startY = sc.nextInt();
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();

        String[][] maze = new String[n][m];
        boolean[][] visited = new boolean[n][m];

        for (int i = 0; i < n; i++) {

            String input = sc.nextLine();
            String[] temp = input.split(" ");

            for (int j = 0; j < m; j++) {
                maze[i][j] = temp[j];

            }
        }

    }

    static boolean inRange(int value, int max) {

        return 0 <= value && value < max;

    }

    static void findAllPaths(int row, int col, String[][] maze, boolean[][] visited) {

        visited[row][col] = true;
        int rows = maze.length;
        int cols = maze[0].length;
        int portalPower = Integer.parseInt(maze[row][col]);

        int[] dRows = {0, portalPower, 0, -portalPower};
        int[] dCols = {portalPower, 0, -portalPower, 0};

        for (int i = 0; i < dRows.length; i++) {

            int nextRow = row + dRows[i];
            int nextCol = col + dCols[i];

            if (!inRange(nextRow, rows) || !inRange(nextCol, cols)) {
                continue;
            }
            if (maze[nextRow][nextCol].equals("#")) {
                continue;
            }
            if (visited[nextRow][nextCol]) {
                continue;
            }

        }

    }

}
