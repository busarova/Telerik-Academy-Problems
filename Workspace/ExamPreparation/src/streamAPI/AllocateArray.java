package streamAPI;

import java.util.Scanner;
import java.util.stream.IntStream;

public class AllocateArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        IntStream.range(0, n)
                .map(x -> x * 5)
                .forEach(System.out::println);

    }
}
