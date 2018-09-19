package IfElse;

import java.util.Scanner;

public class LeastMajorityMultiple {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		int lmm = 1;

		while (true) {
			int counter = 0;
		
			if (lmm % a == 0) {
				counter++;
			}
			if (lmm % b == 0) {
				counter++;
			}
			if (lmm % c == 0) {
				counter++;
			}
			if (lmm % d == 0) {
				counter++;
			}
			if (lmm % e == 0) {
				counter++;
			}
			if (counter >= 3) {
				System.out.println(lmm);
				break;
			}
			lmm++;
		}

	}

}
