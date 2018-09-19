package arrays;

import java.util.Scanner;

public class SubsetOfSumDP {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int s = sc.nextInt();
        sc.nextLine();
        String[] input = sc.nextLine().trim().split(" ");
        int[] nums = new int[input.length];

        for (int i = 0; i < nums.length; i++) {

            nums[i] = Integer.parseInt(input[i]);
        }

        boolean[] hasSum = new boolean[s + 1];

        if (hasSubset(nums, hasSum)) {
            System.out.println("yes");

        } else {
            System.out.println("no");
        }
    }

    public static boolean hasSubset(int[] nums, boolean[] hasSum) {

        int nextSum = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = hasSum.length - 1; j >= 0; j--) {

                if (hasSum[j]) {

                    nextSum = j + nums[i];
                }
                if (nextSum >= hasSum.length) {
                    continue;
                }
                hasSum[nextSum] = true;
            }
        }
        return hasSum[hasSum.length - 1];
    }

}
