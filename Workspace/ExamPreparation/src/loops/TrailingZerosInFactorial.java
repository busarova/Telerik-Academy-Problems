package loops;

import java.util.Scanner;

public class TrailingZerosInFactorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long n = sc.nextInt();
		long zerosCount = 0;

		while (n >= 5) {
			n /= 5;
			zerosCount += n;
		}
		System.out.println(zerosCount);
	}

}
