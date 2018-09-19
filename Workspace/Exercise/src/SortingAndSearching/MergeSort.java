package SortingAndSearching;

import java.util.Arrays;

public class MergeSort {


    static void sort(int[] arr) {

        int[] temp = new int[arr.length];

        int startIndex = 0;
        int endIndex = arr.length;

        mergeSort(arr, startIndex, endIndex, temp);
    }

    private static void mergeSort(int[] arr, int startIndex, int endIndex, int[] temp) {

        if (endIndex - 1 <= startIndex) {
            return;
        }

        int midIndex = (startIndex + endIndex) / 2;
        mergeSort(arr, startIndex, midIndex, temp);
        mergeSort(arr, midIndex, endIndex, temp);

        merge(arr, startIndex, midIndex, endIndex, temp);
    }

    private static void merge(int[] arr, int startIndex, int midIndex, int endIndex, int[] temp) {

        int left = startIndex;
        int right = midIndex;
        int resultIndex = startIndex;

        while (left < midIndex && right < endIndex) {

            if (arr[left] < arr[right]) {

                temp[resultIndex] = arr[left];
                left++;

            } else {
                temp[resultIndex] = arr[right];
                right++;
            }
            resultIndex++;
        }

        while (left < midIndex) {

            temp[resultIndex] = arr[left];
            left++;
            resultIndex++;
        }

        while (right < endIndex) {

            temp[resultIndex] = arr[right];
            right++;
            resultIndex++;
        }

        for (int i = startIndex; i < endIndex; i++) {

            arr[i] = temp[i];
        }
    }

    public static void main(String[] args) {

        int[] nums = {6, 82, 12, -5, 0, 1, 1};

        sort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
