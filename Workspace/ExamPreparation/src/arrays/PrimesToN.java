package arrays;

import java.util.Scanner;

public class PrimesToN {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        printPrimes(n);
    }

    static  void printPrimes (int n){

        for (int i = 1; i <= n; i++) {

            if (!isPrime(i)){
                continue;
            }
            System.out.print(i + " ");
        }

    }

    static boolean isPrime (int number){

        int maxDivider =(int) Math.sqrt(number);

        for (int divider = 2; divider <= maxDivider; divider++) {
            if (number % divider == 0){
                return false;
            }
        }
        return true;
    }
}
