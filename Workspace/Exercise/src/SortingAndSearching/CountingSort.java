package SortingAndSearching;

import java.util.Arrays;

public class CountingSort {

    public static int[] countingSort(int[] nums) {

        int maxNum = nums[0];
        for (int i = 1; i < nums.length; i++) {

            maxNum = Math.max(maxNum, nums[i]);
        }

        int[] numsCount = new int[maxNum + 1];
        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {

            int num = nums[i];
            numsCount[num]++;
        }

        for (int i = 1; i < numsCount.length; i++) {

            numsCount[i] += numsCount[i - 1];
        }

        for (int i = 0; i < nums.length; i++) {

            int num = nums[i];
            numsCount[num]--;
            result[numsCount[num]] = num;
        }
        return result;
    }

    public static void main(String[] args) {

        int[] nums = {6, 82, 12, 1, 4, 59, 0, 61};

        System.out.println(Arrays.toString(countingSort(nums)));
    }
}
