package loops;

import java.util.Scanner;

public class BiggestPrimeNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		if (n < 2 || n > 10000000) {

			System.out.println("invalid input");

		} else {
			
			while (true) {
				
				boolean isPrime = true;
				
				for (int i = 2; i < n / 2; i++) {
					if (n % i == 0) {
						isPrime = false;
						break;
					}
				}
				if (isPrime) {
					System.out.println(n);
					break;
					
				}else {
					n--;
				}
			}
				
			
		}
	}

}
