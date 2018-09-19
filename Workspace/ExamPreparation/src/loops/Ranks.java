package loops;

import java.util.Scanner;

public class Ranks {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		sc.nextLine();
		String nums = sc.nextLine();
		String[] strArr = nums.split(" ");
		int[] intArr = new int[strArr.length];
		int[] ranks = new int[strArr.length];		

		for (int i = 0; i < strArr.length; i++) {
			intArr[i] = Integer.parseInt(strArr[i]);
		}

		for (int i = 1; i <= n; i++) {
			
			int currentMaxIndex = findMaxIndex(intArr);
			ranks[currentMaxIndex] = i;
			intArr[currentMaxIndex] = Integer.MIN_VALUE;
			
		}
		for (int i = 0; i < ranks.length; i++) {
			System.out.print(ranks[i] + " ");
		}
	}

	public static int findMaxIndex(int[] arr) {
		
		int maxIndex = 0;
		int maxNum = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (maxNum < arr[i]) {
				maxNum = arr[i];
				maxIndex = i;
			}
		}
		return maxIndex;
	}
}
