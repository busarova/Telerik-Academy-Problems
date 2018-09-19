package DataStructures.LinearDS;

import java.util.Stack;

public class BaseballGame {

    public static int calPoints(String[] ops) {

        Stack<Integer> stack = new Stack();

        for(String op : ops) {

            switch (op) {
                case "+":
                    int top = stack.pop();
                    int nextTop = top + stack.peek();
                    stack.push(top);
                    stack.push(nextTop);
                    break;
                case "C":
                    stack.pop();
                    break;
                case "D":
                    stack.push(2 * stack.peek());
                    break;
                default:
                    stack.push(Integer.valueOf(op));
                    break;
            }
        }

        int ans = 0;
        for(int score : stack){
            ans += score;
        }
        return ans;

    }

    public static void main(String[] args) {

        String[] ops = {"5","2","C","D","+"};

        System.out.println(calPoints(ops));
    }
}
