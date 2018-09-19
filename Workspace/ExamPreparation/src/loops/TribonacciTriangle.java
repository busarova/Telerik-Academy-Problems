package loops;

import java.util.Scanner;

public class TribonacciTriangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long num1 = sc.nextInt();
		long num2 = sc.nextInt();
		long num3 = sc.nextInt();
		int l = sc.nextInt();

		long sum = 0;

		for (int i = 0; i < l; i++) {
			String row = "";
			for (int j = 0; j <= i; j++) {

				long n = num1;
				sum = num1 + num2 + num3;
				num1 = num2;
				num2 = num3;
				num3 = sum;

				row += n + " ";
			}
			System.out.println(row.trim());
		}
	}

}
