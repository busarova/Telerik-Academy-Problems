package IfElse;

import java.util.Scanner;

public class BiggestOfFive {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double num1 = sc.nextDouble();
		double num2 = sc.nextDouble();
		double num3 = sc.nextDouble();
		double num4 = sc.nextDouble();
		double num5 = sc.nextDouble();
		double biggest = num1;

		if (num1 < -200 || num1 > 200 || num2 < -200 || num2 > 200
				|| num3 < -200 || num3 > 200 || num4 < -200
				|| num4 > 200 || num5 < -200 || num5 > 200) {

			System.out.println("invalid number");

		} else {

			if (num2 > num1 && num2 > num3 && num2 > num4 && num2 > num5) {

				biggest = num2;
			}
			if (num3 > num1 && num3 > num2 && num3 > num4 && num3 > num5) {

				biggest = num3;
			}
			if (num4 > num1 && num4 > num2 && num4 > num3 && num4 > num5) {

				biggest = num4;
			}
			if (num5 > num1 && num5 > num2 && num5 > num3 && num5 > num4) {

				biggest = num5;
			}
			if (biggest % 1 != 0) {

				System.out.println(biggest);

			} else {

				System.out.println((int) biggest);
			}
		}

	}

}
