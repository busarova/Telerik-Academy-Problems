package loops;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if (b > a) {
			int c = b;
			b = a;
			a = c;
		}
		System.out.println(GCD(a, b));
	}

	public static int GCD (int a, int b) {
		if (b == 0) {
			return a;
		}else {
			return GCD(b, a % b);
		}
	}
	
	
}
