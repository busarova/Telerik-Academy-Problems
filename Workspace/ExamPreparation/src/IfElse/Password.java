package IfElse;

import java.util.Scanner;

public class Password {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int revN = 0;

        while(n > 0){

            int digit = n % 10;
            n /= 10;
            revN *= 10;
            revN += digit;

        }

        System.out.println(revN / k + revN % k);
    }
}
