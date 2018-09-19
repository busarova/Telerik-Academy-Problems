package DataStructures.ExamRemake;

import java.util.Scanner;

public class Subsequence {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String sub = sc.nextLine();
        String sequence = sc.nextLine();

        System.out.println(isSubsequence(sub, sequence));

    }

    public static boolean isSubsequence(String sub, String sequence) {

        char[] subArr = sub.toCharArray();
        char[] sequenceArr = sequence.toCharArray();

        int last = -1;
        for (int i = 0; i < subArr.length; i++) {
            for (int j = last + 1; j < sequenceArr.length; j++) {
                if (subArr[i] == sequenceArr[j]) {
                    if (i == subArr.length - 1)
                        return true;

                    last = j;
                    break;
                }
                if (j == sequenceArr.length - 1)
                    return false;
            }
        }
        return false;
    }
}