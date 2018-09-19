package loops;

import java.util.Scanner;

public class OddorEvenProduct {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.nextLine());
		String[] numbers = sc.nextLine().split(" ");
		long evenProduct = 1;
		long oddProduct = 1;

		for (int i = 0; i < numbers.length; i++) {

			if (i % 2 == 0) {
				oddProduct *= Integer.valueOf(numbers[i]);
			} else {
				evenProduct *= Integer.valueOf(numbers[i]);
			}

		}
		if (evenProduct == oddProduct) {
			System.out.println("yes " + evenProduct);
		} else {
			System.out.println("no " + oddProduct + " " + evenProduct);
		}
	}

}
