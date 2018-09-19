package DataStructures.LinearDS;

import java.util.Stack;

public class ValidParentheses {

    public static boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

            if (stack.isEmpty()) {
                stack.push(c);

            } else {

                if ((stack.peek() == '(' && c == ')') ||
                        (stack.peek() == '{' && c == '}') ||
                        (stack.peek() == '[' && c == ']')) {

                    stack.pop();
                } else
                    stack.push(c);

            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {

        String s = "{[]}";

        System.out.println(isValid(s));
    }
}
