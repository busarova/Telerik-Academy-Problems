package SortingAndSearching;

import java.util.Arrays;

public class QuickSort {

    static void sort(int[] arr) {

        int startIndex = 0;
        int endIndex = arr.length - 1;

        quickSort(arr, startIndex, endIndex);
    }

    static void swap(int[] arr, int x, int y) {

        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    static int partition(int[] arr, int left, int right) {

        int pivot = arr[right];
        int mid = left - 1;

        for (int i = left; i <= right; i++) {

            if (arr[i] <= pivot) {

                mid++;
                swap(arr, mid, i);
            }
        }
        return mid;
    }

    static void quickSort(int[] arr, int left, int right) {

        if (left >= right) {
            return;
        }

        int mid = partition(arr, left, right);

        quickSort(arr, left, mid - 1);
        quickSort(arr, mid + 1, right);
    }

    public static void main(String[] args) {

        int[] nums = {6, 82, 12, 1, 4, 59, 0, -32, 61};

        sort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
