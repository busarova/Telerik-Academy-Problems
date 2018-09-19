package loops;

import java.util.Scanner;

public class NotDivisableNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		if (n < 1 || n > 1500) {

			System.out.println("invalid input");

		} else {

			for (int i = 1; i <= n; i++) {

				if (i % 3 == 0 || i % 7 == 0) {
					continue;
				}
				System.out.print(i + " ");
			}
		}
	}

}
