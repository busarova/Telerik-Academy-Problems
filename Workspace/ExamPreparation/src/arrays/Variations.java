package arrays;

import java.util.HashSet;
import java.util.Scanner;

public class Variations {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String letters = sc.nextLine();
        int rank = sc.nextInt();

        char[] variation = new char[rank];

        getVariations(0, rank, letters, variation, new HashSet<>());
    }

    static void getVariations(int index, int k, String letters, char[] variation, HashSet<Integer> used) {

        if (index == k) {
            for (int i = 0; i < variation.length; i++) {
                System.out.print(variation[i] + " ");
            }
            System.out.println();
            return;
        }

        for (int i = 0; i < letters.length(); i++) {

            if (used.contains(i) || variation[index] == letters.charAt(i)) {
                continue;
            }

            variation[index] = letters.charAt(i);
            used.add(i);

            getVariations(index + 1, k, letters, variation, used);
            used.remove(i);
        }
    }
}
