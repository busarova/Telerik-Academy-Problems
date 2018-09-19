package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class GirlsGoneWild {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int shirts = sc.nextInt();
        sc.nextLine();
        char[] skirts = sc.nextLine().toCharArray();
        Arrays.sort(skirts);
        int girls = sc.nextInt();

        ArrayList<int[]> allCombos = new ArrayList<>();

        shirtCombinations(new int[girls], 0, 0, shirts, girls, allCombos);

        HashSet<String> allVariations = new HashSet<>();

        skirtVariations(0, girls, skirts, new StringBuilder(), new HashSet<Integer>(), allVariations);

        ArrayList<String> result = combine(allVariations, allCombos);

        System.out.println(result.size());
        result.forEach(System.out::println);

//        for (char[] arr: allVariations) {
//            for (char c: arr) {
//                System.out.print(c);
//            }
//            System.out.println();
//        }
    }

    static void shirtCombinations(int[] combo,
                                  int start,
                                  int index,
                                  int shirts,
                                  int girls,
                                  ArrayList<int[]> allCombos) {

        if (index == girls) {

            allCombos.add(combo.clone());
            return;
        }


        for (int i = start; i < shirts; i++) {

            combo[index] = i;

            shirtCombinations(combo, i + 1, index + 1, shirts, girls, allCombos);
        }
    }

    static void skirtVariations(int index,
                                int girls,
                                char[] skirts,
                                StringBuilder variation,
                                HashSet<Integer> used,
                                HashSet<String> allVariations) {

        if (index == girls) {

            allVariations.add(variation.toString());
            return;
        }

        for (int i = 0; i < skirts.length; i++) {

            if (used.contains(i)){
                continue;
            }
            variation.append(skirts[i]);
            used.add(i);

            skirtVariations(index + 1, girls, skirts, variation, used,  allVariations);
            variation.deleteCharAt(variation.length() - 1);
            used.remove(i);
        }
    }

    private static ArrayList<String> combine(HashSet<String> variations,
                                             ArrayList<int[]> combinations) {

        ArrayList<String> result = new ArrayList<>();

        for (int[] shirtCombination : combinations) {
            for (String skirtCombination : variations) {

                StringBuilder comb = new StringBuilder();

                for (int i = 0; i < shirtCombination.length; i++) {
                    comb.append(shirtCombination[i]);
                    comb.append(skirtCombination.charAt(i));
                    comb.append('-');
                }

                comb.deleteCharAt(comb.length() - 1);

                result.add(comb.toString());
            }
        }
        result.sort(String::compareTo);

        return result;
    }
}