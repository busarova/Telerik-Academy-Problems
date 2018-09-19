package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSumOfKElements {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		Arrays.sort(arr);
		int sum = 0;
		
		for (int i = arr.length - 1; i >= arr.length - k; i--) {
			
			sum += arr[i];
		}

		System.out.println(sum);
	}

}
/*
 * On the first line you will receive the number N On the second line you will
 * receive the number K On the next N lines the numbers of the array will be
 * given
 */