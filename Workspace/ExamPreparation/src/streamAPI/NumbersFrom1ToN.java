package streamAPI;

import java.util.Scanner;
import java.util.stream.IntStream;

public class NumbersFrom1ToN {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        IntStream.range(1, n + 1)
                .forEach(x -> System.out.print(x + " "));
    }
}
