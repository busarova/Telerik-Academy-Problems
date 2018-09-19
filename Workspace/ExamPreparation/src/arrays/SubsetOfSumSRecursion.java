package arrays;

import java.util.Scanner;

public class SubsetOfSumSRecursion {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int s = sc.nextInt();
		sc.nextLine();
		String input = sc.nextLine();
		String[] str = input.split(" ");
		int[] nums = new int[str.length];

		for (int i = 0; i < nums.length; i++) {

			nums[i] = Integer.parseInt(str[i]);
		}

		if (hasSubset(nums, 0, s)) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
	}

	public static boolean hasSubset(int[] arr, int index, int sum) {

		if (sum == 0)
			return true;

		if (index == arr.length)
			return false;

		return hasSubset(arr, index + 1, sum - arr[index]) ||
				hasSubset(arr, index + 1, sum);
	}

}
