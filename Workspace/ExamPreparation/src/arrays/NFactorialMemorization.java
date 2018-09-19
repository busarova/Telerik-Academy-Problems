package arrays;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class NFactorialMemorization {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ArrayList<BigInteger> memoFactorial = new ArrayList<>();

        System.out.println(calcFactorial(n, memoFactorial));
    }

    static BigInteger calcFactorial(int n, ArrayList<BigInteger> memoFactorial) {

        if (n <= 1) {
            return BigInteger.ONE;

        }
        if (n < memoFactorial.size()) {
            return memoFactorial.get(n);

        }
        BigInteger factorial = calcFactorial(n - 1, memoFactorial).multiply(BigInteger.valueOf((long)n));
        memoFactorial.add(factorial);
        return factorial;

    }
}
