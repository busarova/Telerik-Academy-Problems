package arrays;

import java.util.Scanner;

public class MaxSumOfSubsequence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int sum = arr[0];
		int maxSum = arr[0];

		for (int i = 1; i < arr.length; i++) {

			sum = Math.max(arr[i], sum + arr[i]);
			maxSum = Math.max(maxSum, sum);
		}
		System.out.println(maxSum);

	}

}
