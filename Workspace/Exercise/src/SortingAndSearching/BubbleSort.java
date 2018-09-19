package SortingAndSearching;

import java.util.Arrays;

public class BubbleSort {

    public static void bubbleSort(int[] nums) {

        for (int i = 0; i < nums.length; i++) {

            boolean hasSwap = false;

            for (int j = 0; j < nums.length - 1 - i; j++) {

                if (nums[j] > nums[j + 1]) {

                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;

                    hasSwap = true;
                }
            }
            if (!hasSwap) {
                break;
            }
        }
    }

    public static void main(String[] args) {

        int[] nums = {6, 82, 12, 1, 4, 59, 0, -32, 61};

        bubbleSort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
