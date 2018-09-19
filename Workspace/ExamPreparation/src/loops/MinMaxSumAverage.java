package loops;

import java.util.Scanner;

public class MinMaxSumAverage {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		double min = Double.MAX_VALUE;
		double max = -Double.MAX_VALUE;
		double sum = 0;
		double avg = 0;
		double[] arr = new double[n];

		for (int i = 0; i < arr.length; i++) {

			arr[i] = sc.nextDouble();

			if (min > arr[i]) {
				min = arr[i];
			}
			if (max < arr[i]) {
				max = arr[i];
			}
			sum += arr[i];
		}
		avg = sum / n;

		System.out.printf("min=%.2f %nmax=%.2f %nsum=%.2f %navg=%.2f %n", min, max, sum, avg);

	}

}
