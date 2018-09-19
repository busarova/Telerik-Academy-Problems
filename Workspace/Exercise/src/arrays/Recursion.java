 package arrays;

public class Recursion {

	public static void main(String[] args) {

		char[][] maze = { { ' ', 'X', ' ', 'X', 'X' }, { ' ', ' ', ' ', ' ', 'E' }, { ' ', ' ', 'X', ' ', ' ' },
				{ ' ', ' ', 'X', ' ', 'X' }, { 'X', ' ', ' ', ' ', ' ' } };

		System.out.println(pathsExist(0, 0, maze));
	}

	static boolean inRange(int value, int max) {

		return 0 <= value && value < max;

	}

	static boolean pathsExist(int row, int col, char[][] maze) {

		int rows = maze.length;
		int cols = maze[row].length;

		int[] dRows = { 0, -1, 0, 1 };
		int[] dCols = { -1, 0, 1, 0 };

		for (int i = 0; i < dRows.length; i++) {

			int nextRow = row + dRows[i];
			int nextCol = col + dCols[i];

			if (!inRange(nextRow, rows) || !inRange(nextCol, cols)) {
				continue;
			}
			if (maze[nextRow][nextCol] == 'X') {
				continue;
			}
			if (maze[nextRow][nextCol] == 'E') {
				return true;
			}

			maze[nextRow][nextCol] = 'X';

			boolean hasPath = pathsExist(nextRow, nextCol, maze);

			maze[nextRow][nextCol] = ' ';

			if (hasPath) {
				return true;
			}
		}
		return false;
	}

}
