package loops;

import java.math.BigInteger;
import java.util.Scanner;

public class CalculateAgain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();

		System.out.println(fact(n).divide((fact(k).multiply(fact(n-k)))));

	}

	static BigInteger fact(int num) {

		BigInteger calcFact = BigInteger.ONE;

		for (int i = 1; i <= num; i++) {
			calcFact = calcFact.multiply(BigInteger.valueOf(i));
		}
		return calcFact;
	}

}
