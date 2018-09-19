package loops;

import java.util.Scanner;

public class SpiralMatrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[][] matrix = new int[n][n];
		String direction = "right";
		int row = 0;
		int col = 0;

		for (int i = 1; i <= n * n; i++) {

			if (direction.equals("right") && (col >= n || matrix[row][col] != 0)) {

				col--;
				row++;
				direction = "down";

			} else if (direction.equals("down") && (row >= n || matrix[row][col] != 0)) {

				row--;
				col--;
				direction = "left";

			} else if (direction.equals("left") && (col < 0 || matrix[row][col] != 0)) {

				col++;
				row--;
				direction = "up";

			} else if (direction.equals("up") && (row < 0 || matrix[row][col] != 0)) {

				row++;
				col++;
				direction = "right";
			}
			matrix[row][col] = i;

			if (direction.equals("right")) {
				col++;
			} else if (direction.equals("down")) {
				row++;
			} else if (direction.equals("left")) {
				col--;
			} else if (direction.equals("up")) {
				row--;
			}
		}
		for (int x = 0; x < n; x++) {
			for (int y = 0; y < n; y++) {

				System.out.print(matrix[x][y] + " ");
			}
			System.out.println();
		}

	}

}
