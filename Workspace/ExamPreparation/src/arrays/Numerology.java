package arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Numerology {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        ArrayList<Integer> number = new ArrayList<>();
        List<Integer> result = Stream.generate(() -> 0)
                .limit(10)
                .collect(Collectors.toList());
        for (int i = 0; i < input.length(); i++) {
            number.add(input.charAt(i) - '0');
        }
        calcCouples(number, result);

        for (int i: result) {
            System.out.print(i + " ");
        }
    }
    static void calcCouples (ArrayList<Integer> num, List<Integer> result){

        if (num.size() == 1){
            int index = num.get(0);
            result.set(index, 1 + result.get(index));
            return;
        }

        for (int i = 0; i < num.size() - 1; i++){
            int a = num.get(i);
            int b = num.get(i + 1);
            int sum = (a + b) * (a ^ b) % 10;
            num.set(i + 1, sum);
            num.remove(i);
            calcCouples(num, result);
            num.add(i, a);
            num.set(i + 1, b);

        }
    }
}
