package IfElse;

import java.util.Scanner;

public class BiggestOfThree {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double x = sc.nextDouble();
		double y = sc.nextDouble();
		double z = sc.nextDouble();
		double biggest = x;

		if (x < -200 || x > 200 || y < -200 || y > 200 || z < -200 || z > 200) {

			System.out.println("invalid number");

		} else {

			if (y > x && y > z) {

				biggest = y;
			}
			if (z > x && z > y) {

				biggest = z;
			}

			if (biggest % 1 != 0) {

				System.out.println(biggest);

			} else {

				System.out.println((int) biggest);
			}
		}
	}
}
