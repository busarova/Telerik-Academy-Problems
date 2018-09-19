package loops;

import java.math.BigInteger;
import java.util.Scanner;

public class Tribonacci {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		BigInteger num1 = sc.nextBigInteger();
		BigInteger num2 = sc.nextBigInteger();
		BigInteger num3 = sc.nextBigInteger();

		int n = sc.nextInt();
		BigInteger sum = num3.add(num2).add(num1);

		for (int i = 4; i <= n; i++) {

			num1 = num2;
			num2 = num3;
			num3 = sum;
			sum = num3.add(num2).add(num1);
		}

		System.out.println(num3);
	}
}
