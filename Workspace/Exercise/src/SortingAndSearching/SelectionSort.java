package SortingAndSearching;

import java.util.Arrays;

public class SelectionSort {

    public static void selectionSort(int[] nums){

        for (int i = 1; i < nums.length; i++) {

            int maxIndex = 0;

            for (int j = 0; j <= nums.length - i; j++) {

                if (nums[j] > nums[maxIndex]){

                    maxIndex = j;
                }
            }

            int endIndex = nums.length - i;

            int temp = nums[maxIndex];
            nums[maxIndex] = nums[endIndex];
            nums[endIndex] = temp;
        }
    }

    public static void main(String[] args) {

        int[] nums = {6, 82, 12, 1, 4, 59, 0, -32, 61};

        selectionSort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
