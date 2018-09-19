package DataStructures.LinearDS;

import java.util.Stack;

public class LargestRectangleArea {

    public static void main(String[] args) {

    }

    public int largestRectangleArea(int[] heights) {

        int max = 0;
        int size = heights.length;
        Stack<Integer> stack = new Stack<>();
        int i = 0;
        while (i <= size) {
            // last bar as size 0 to collect all other bars
            int bar = i < size ? heights[i] : 0;
            if (stack.isEmpty() || bar >= heights[stack.peek()]) {
                // when bar is larger, push bar into stack
                stack.push(i);
                // move right boundary
                i++;
            } else {
                // when bar is smaller, use stack's top bar as height
                int height = heights[stack.pop()];
                // remove bars with the same height from stack
                while (!stack.isEmpty() && height == heights[stack.peek()]) {
                    stack.pop();
                }
                // if stack is NOT empty, left boundary is (stack's top bar + 1)
                // if stack is empty(bar is smallest), left boundary is 0
                int left = stack.isEmpty() ? 0 : stack.peek() + 1;
                // right boundary is (i - 1)
                // so width is (i - left)
                max = Math.max(max, height * (i - left));
                // since we didn't move right boundary, going to calculate all bigger bars in stack
            }
        }
        return max;
    }
}