package arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MessagesInABottle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String message = sc.nextLine();
        String cipher = sc.nextLine();
        String[] letters = cipher.split("\\d+");
        String[] numbers = cipher.substring(1).split("\\D");
        StringBuilder text = new StringBuilder();
        ArrayList<String> result = new ArrayList<>();

        deciferMessage(0, text, message, result, letters, numbers);

        System.out.println(result.size());
        Collections.sort(result);
        for (String str: result) {
            System.out.println(str);
        }
    }

    public static void deciferMessage(int index,
                                      StringBuilder text,
                                      String message,
                                      ArrayList<String> result,
                                      String[] letters,
                                      String[] numbers) {

        if (index == message.length()) {
            result.add(text.toString());
            return;
        }
        for (int i = 0; i < numbers.length; i++) {

            if (message.substring(index).startsWith(numbers[i])) {

                text.append(letters[i]);

                deciferMessage(index + numbers[i].length(), text, message, result, letters, numbers);

                text.deleteCharAt(text.length() - 1);

            }
        }


    }

}
