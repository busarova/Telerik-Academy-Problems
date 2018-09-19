package loops;

import java.math.BigInteger;
import java.util.Scanner;

public class CatalanNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		BigInteger result;

		result = (fact(2 * n)).divide(fact(n + 1).multiply(fact(n)));
		System.out.println(result);
	}

	static BigInteger fact(int num) {

		BigInteger calcFact = BigInteger.ONE;

		for (int i = 1; i <= num; i++) {
			calcFact = calcFact.multiply(BigInteger.valueOf(i));
		}
		return calcFact;
	}
}
