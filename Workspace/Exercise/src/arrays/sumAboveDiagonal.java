package arrays;

import java.util.Scanner;

public class sumAboveDiagonal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		long[][] matrix = new long[n][n];
		long rowM = 1;
		long colM = 1;

		for (int row = 0; row < n; row++) {
			rowM *= 2;
			for (int col = 0; col < n; col++) {

				matrix[row][col] = colM;
				colM *= 2;
			}
			colM = rowM;

		}
		long sum = 0;
		for (int row = 0; row < matrix.length; row++) {
			for (int col = row; col < matrix[row].length; col++) {

				sum += matrix[row][col];

			}
		}
		System.out.println(sum);

	}

}
