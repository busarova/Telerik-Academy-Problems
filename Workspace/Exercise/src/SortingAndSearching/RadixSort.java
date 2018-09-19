package SortingAndSearching;

import java.util.Arrays;

public class RadixSort {

    static int[] radixSort(int[] nums) {

        int maxNumOfDigits = getMaxNumOfDigits(nums);

        for (int digit = 1; digit <= maxNumOfDigits; digit++) {

            nums = countingSort(nums, digit);
        }
        return nums;
    }

    static int[] countingSort(int[] nums, int digit) {


        int[] numsCount = new int[10];
        int[] result = new int[nums.length];

        for (int i : nums) {

            int num = nthDigit(i, digit);
            numsCount[num]++;
        }

        for (int i = 1; i < numsCount.length; i++) {

            numsCount[i] += numsCount[i - 1];
        }

        for (int i = nums.length - 1; i >= 0; i--) {

            int num = nums[i];
            int numDigit = nthDigit(num, digit);
            numsCount[numDigit]--;
            int pos = numsCount[numDigit];
            result[pos] = num;
        }
        return result;
    }

    static int nthDigit(int num, int n) {

        int restOfNum = (int) Math.pow(10, n - 1);
        return (num / restOfNum) % 10;
    }

    static int getMaxNumOfDigits(int[] nums) {

        int maxNum = nums[0];
        for (int i = 1; i < nums.length; i++) {

            maxNum = Math.max(maxNum, nums[i]);
        }

        int digitsCount = 0;

        while (maxNum > 0) {

            maxNum /= 10;
            digitsCount++;
        }

        return digitsCount;
    }

    public static void main(String[] args) {

        int[] nums = {6, 82, 12, 1, 4, 59, 0, 61356};

        System.out.println(Arrays.toString(radixSort(nums)));
    }
}
