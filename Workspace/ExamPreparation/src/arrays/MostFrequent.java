package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MostFrequent {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		Arrays.sort(arr);
		int counter = 1;
		int maxCount = 0;
		int mostFreqNum = 0;

		for (int i = 0; i < arr.length - 1; i++) {

			if (arr[i] == arr[i + 1]) {
				counter++;
			} else {
				counter = 1;
			}
			if (maxCount < counter) {
				maxCount = counter;
				mostFreqNum = arr[i];
			}
		}
		System.out.println(mostFreqNum + "(" + maxCount + " times)");
	}

}
