package arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Combinations {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] input = reader.readLine().split(" ");
        int n = convert(input[0]);
        int k = convert(input[1]);


        int[] b = new int[k];
        generateCombinations(1, 0, n, k, b);

    }

    private static int convert(String s) {
        int value = 0;
        int flag = 1;
        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '-') {
                flag = -1;
            } else {
                value = value * 10 + (s.charAt(i) - '0');
            }
        }
        if (flag == -1) {
            return -value;
        }
        return value;
    }

    static void generateCombinations(int start, int index, int n, int k, int[] combo) {

        if (index == k) {

            for (int i = 0; i < combo.length; i++) {
                System.out.print(combo[i] + " ");
            }
            System.out.println();
            return;
        }

        for (int i = start; i <= n; i++) {

            combo[index] = i;

//            without repetitions \generateCombinations(i + 1, index + 1, n, k, combo);\
//            with repetition \generateCombinations(i, index + 1, n, k, combo);\\

            generateCombinations(i, index + 1, n, k, combo);
        }

    }

}
