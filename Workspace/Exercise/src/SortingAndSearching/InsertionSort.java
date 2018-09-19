package SortingAndSearching;

public class InsertionSort {

    void insertionSort(int arr[]) {

        for (int i = 1; i < arr.length; i++) {
            int currNum = arr[i];
            int prev = i - 1;

            while (prev >= 0 && arr[prev] > currNum) {
                arr[prev + 1] = arr[prev];
                prev = prev - 1;
            }
            arr[prev + 1] = currNum;
        }
    }
}
