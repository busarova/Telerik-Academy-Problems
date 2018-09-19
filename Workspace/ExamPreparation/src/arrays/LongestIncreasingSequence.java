package arrays;

import java.util.Scanner;

public class LongestIncreasingSequence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int counter = 1;
		int maxCount = 1;

		for (int i = 1; i < arr.length; i++) {

			if (arr[i] > arr[i - 1]) {
				counter++;

			} else {
				counter = 1;
			}

			if (counter > maxCount) {
				maxCount = counter;
			}

		}
		System.out.println(maxCount);


	}

}
