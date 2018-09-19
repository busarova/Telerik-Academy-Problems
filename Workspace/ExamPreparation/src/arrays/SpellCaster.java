package arrays;

import java.util.Scanner;

public class SpellCaster {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] words = sc.nextLine().trim().split(" ");
        StringBuilder spell = new StringBuilder();
        boolean isEmpty = false;
        int countEmpty = 0;

        while (countEmpty <= words.length) {

            for (int i = 0; i < words.length; i++) {

                String word = words[i];

                if (word.equals("")) {
                    isEmpty = true;
                    continue;
                }

                spell.append(word.charAt(word.length() - 1));
                words[i] = word.substring(0, word.length() - 1);

            }
            if(isEmpty){
                countEmpty++;
            }
        }

        for (int i = 0; i < spell.length(); i++) {

            String helper = spell.toString().toLowerCase();
            char toMove = spell.charAt(i);
            int move = (helper.charAt(i) - 'a') + 1;
            int index = (i + move) % spell.length();

            spell.deleteCharAt(i);
            spell.insert(index, toMove);

        }

        System.out.println(spell);
    }
}
