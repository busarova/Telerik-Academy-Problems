package loops;

import java.util.Scanner;

public class AllocateArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		if (n < 1 || n > 20) {
			System.out.println("invalid input");
		} else {

			int[] arr = new int[n];

			for (int i = 0; i < arr.length; i++) {

				arr[i] = i * 5;
				System.out.println(arr[i]);
			}
		}

	}
}
/*	boolean isPrime = true;
					for (int j = 2; j < i; j++) {

						if (i % j == 0) {
							isPrime = false;
							break;
						}
					}
					if (isPrime) {
						biggestPrime = i;
					}
				}
				System.out.println(biggestPrime);
*/