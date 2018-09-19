package streamAPI;

import java.util.Scanner;


public class ТайноСъобщение {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringBuilder in = new StringBuilder(sc.nextLine());
        in.reverse();

        in.chars()
                .filter(x -> Character.isLetter(x))
                .mapToObj(x -> (char) x)
                .forEach(System.out::print);

    }
}
