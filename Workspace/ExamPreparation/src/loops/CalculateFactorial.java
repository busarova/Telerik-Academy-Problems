package loops;

import java.util.Scanner;

public class CalculateFactorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		double x = sc.nextDouble();
		double fact = 1;
		double s = 1;
			
			for (int i = 1; i <= N; i++) {

				fact *= i;
				s += fact / Math.pow(x, i);
			}
			System.out.printf("%.5f", s);
	}

}
