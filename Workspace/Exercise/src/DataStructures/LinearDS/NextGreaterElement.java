package DataStructures.LinearDS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {

        ArrayList<Integer> keys = new ArrayList<>();
        ArrayList<Integer> values = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();

        for (int num : nums2) {
            while (!stack.isEmpty() && stack.peek() < num) {
                keys.add(stack.pop());
                values.add(num);
            }
            stack.push(num);
        }

        int[] result = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {

            if (keys.contains(nums1[i])) {

                int index = keys.indexOf(nums1[i]);
                result[i] = values.get(index);

            } else
                result[i] = -1;
        }
        return result;
    }

    public static void main(String[] args) {

        int[] nums1 = {4, 1, 2};
        int[] nums2 = {1, 3, 4, 2};

        int[] result = nextGreaterElement(nums1, nums2);

        System.out.println(Arrays.toString(result));
    }
}