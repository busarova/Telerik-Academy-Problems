package loops;

import java.util.Scanner;

public class MazeRunner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] nums = new int[n];

		for (int i = 0; i < n; i++) {

			nums[i] = sc.nextInt();

		}
		for (int i = 0; i < nums.length; i++) {

			if (nums[i] < 1000 && nums[i] > 9999) {
				continue;
			}
			System.out.println(sumDigits(nums[i]));

		}

	}

	public static String sumDigits(int num) {

		int sumEven = 0;
		int sumOdd = 0;

		while (num > 0) {
			int digit = num % 10;

			if (digit % 2 == 0) {
				sumEven += digit;
			} else {
				sumOdd += digit;
			}
			num /= 10;
		}

		if (sumEven > sumOdd) {
			return "left";

		} else if (sumOdd > sumEven) {
			return "right";

		} else {
			return "straight";
		}
	}
}
