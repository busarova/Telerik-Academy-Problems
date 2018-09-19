package SortingAndSearching;

import java.util.Arrays;

public class HeapSort {

    static void heapSort(int[] arr) {


        for (int i = arr.length - 1; i >= 0; i--) {

            heapify(arr, i);
            swap(arr, 0, i);

        }
    }

    private static void heapify(int[] arr,int len) {

        for (int i = len / 2; i >= 0; i--) {

            downHeap(arr, i, len);
        }
    }

    private static void downHeap(int[] arr, int index, int len) {

        int left = 2 * index + 1;
        int right = 2 * index + 2;
        int max = index;

        if (left <= len && arr[left] > arr[index]) {
            max = left;
        }
        if (right <= len && arr[right] > arr[max]) {
            max = right;
        }
        if (max != index){
            swap(arr, index, max);
            downHeap(arr, max, len);
        }
    }

    private static void swap(int[] arr, int x, int y) {

        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    public static void main(String[] args) {

        int[] nums = {32369, 82, 12, 1, 1, 4, 59, 0, 61};
        heapSort(nums);
        System.out.println(Arrays.toString(nums));
    }

}
