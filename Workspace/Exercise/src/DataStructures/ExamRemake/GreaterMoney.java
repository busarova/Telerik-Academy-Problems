package DataStructures.ExamRemake;

import java.util.Scanner;

public class GreaterMoney {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] bag1 = sc.nextLine().split(",");
        String[] bag2 = sc.nextLine().split(",");
        int[] bag1Nums = new int[bag1.length];
        int[] bag2Nums = new int[bag2.length];
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < bag1.length; i++) {
            int num1 = Integer.parseInt(bag1[i]);
            bag1Nums[i] = num1;

        }
        for (int i = 0; i < bag2.length; i++) {
            int num2 = Integer.parseInt(bag2[i]);
            bag2Nums[i] = num2;

        }
        for (int i = 0; i < bag1Nums.length; i++) {

            sb.append(findNextGreater(bag1Nums[i], bag2Nums)).append(",");

        }
        sb.deleteCharAt(sb.length() - 1);
        System.out.println(sb);
    }

    private static int findNextGreater(int num, int[] bag2) {

        int index = -1;
        for (int i = 0; i < bag2.length; i++) {
            int next = bag2[i];

            if (next == num) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            return -1;

        } else {
            for (int i = index; i < bag2.length; i++) {
                if (bag2[i] > num) {
                    return bag2[i];
                }
            }
        }
        return -1;
    }
}
