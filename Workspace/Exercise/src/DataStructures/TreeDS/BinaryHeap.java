package DataStructures.TreeDS;

import java.util.ArrayList;
import java.util.Scanner;

public class BinaryHeap {

    private ArrayList<Integer> data;

    public BinaryHeap() {

        data = new ArrayList<>();
    }

    public void insert(int x) {

        data.add(x);
        upHeap(data, data.size() - 1);
    }

    public void delete(int x) {

        int index = data.indexOf(x);
        swap(data, index, data.size() - 1);

        data.remove(data.size() - 1);
        int parent = (index - 1) / 2;
        if (data.get(index) > data.get(parent)) {

            upHeap(data, index);

        } else
            downHeap(data, index);
    }

    private static void upHeap(ArrayList<Integer> arr, int child) {

        int parent = (child - 1) / 2;
        int min = child;

        if (parent >= 0 && arr.get(parent) < arr.get(child)) {
            min = parent;
        }

        if (min != child) {
            swap(arr, child, min);
            upHeap(arr, min);
        }
    }

    private static void downHeap(ArrayList<Integer> arr, int parent) {

        int left = 2 * parent + 1;
        int right = 2 * parent + 2;
        int max = parent;

        if (left < arr.size() && arr.get(left) > arr.get(parent)) {
            max = left;
        }
        if (right < arr.size() && arr.get(right) > arr.get(max)) {
            max = right;
        }
        if (max != parent) {
            swap(arr, parent, max);
            downHeap(arr, max);
        }
    }

    private static void swap(ArrayList<Integer> arr, int x, int y) {

        int temp = arr.get(x);
        arr.set(x, arr.get(y));
        arr.set(y, temp);
    }

    public void print() {

        data.forEach(System.out::println);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BinaryHeap heap = new BinaryHeap();
        int i = 0;

        while (i < 10) {
            heap.insert(sc.nextInt());
            i++;
        }

        heap.print();

        System.out.println("--------");
        heap.delete(51);
        heap.print();
    }
}
