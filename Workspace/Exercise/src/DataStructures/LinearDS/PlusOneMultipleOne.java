package DataStructures.LinearDS;

import java.util.ArrayList;
import java.util.Scanner;

public class PlusOneMultipleOne {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        ArrayList<Integer> steps = new ArrayList<>();
        steps.add(n);
        int index = 0;

        while (steps.size() < m) {

            steps.add(steps.get(index) + 1);
            steps.add(steps.get(index) * 2 + 1);
            steps.add(steps.get(index) + 2);

            index++;
        }
        System.out.println(steps.get(m - 1));
    }
}