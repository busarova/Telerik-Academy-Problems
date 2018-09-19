package loops;

import java.util.Scanner;

public class LargestThanNeighbours {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		sc.nextLine();
		String nums = sc.nextLine();
		String[] numsArr = new String[n];
		numsArr = nums.split(" ");
		int[] intArr = new int[numsArr.length];

		for (int i = 0; i < intArr.length; i++) {
			intArr[i] = Integer.parseInt(numsArr[i]);
		}

		System.out.println(CheckNeighbours(intArr));

	}

	public static int CheckNeighbours(int[] arr) {

		for (int i = 1; i < arr.length - 1; i++) {
			if ((arr[i] > arr[i - 1] && arr[i] > arr[i + 1])) {
				return i;

			}
		}
		return -1;
	}
}
