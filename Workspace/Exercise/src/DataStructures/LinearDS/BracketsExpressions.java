package DataStructures.LinearDS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BracketsExpressions {

    public static void main(String[] args) throws IOException {

        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));

        String s = sc.readLine();
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

            if (c == '(') {

                stack.push(i);
            }
            if (c == ')') {

                System.out.println(s.substring(stack.pop(), i + 1));
            }
        }
    }
}
