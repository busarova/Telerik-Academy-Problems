package DataStructures.LinearDS;

import java.util.Scanner;
import java.util.Stack;

public class CokiSkoki {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] buildings = new int[n];
        int[] allJumps = new int[n];
        int maxJumps = 0;

        for (int i = 0; i < n; i++) {

            buildings[i] = sc.nextInt();
        }

        Stack<Integer> jumpIndexes = new Stack<>();

        for (int i = buildings.length - 1; i >= 0; i--) {

            while (!jumpIndexes.isEmpty() &&
                    buildings[jumpIndexes.peek()] <= buildings[i]) {
                int index = jumpIndexes.pop();
                allJumps[index] = jumpIndexes.size();

                maxJumps = Math.max(maxJumps, allJumps[index]);
            }
            jumpIndexes.push(i);

        }
        while (!jumpIndexes.isEmpty()) {
            int index = jumpIndexes.pop();
            allJumps[index] = jumpIndexes.size();

            maxJumps = Math.max(maxJumps, allJumps[index]);
        }
        System.out.println(maxJumps);
        for (int i : allJumps) {
            System.out.print(i + " ");
        }
    }
}
