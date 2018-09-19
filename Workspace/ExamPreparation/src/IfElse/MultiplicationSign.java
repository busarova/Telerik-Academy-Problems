package IfElse;

import java.util.Scanner;

public class MultiplicationSign {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double x = sc.nextDouble();
		double y = sc.nextDouble();
		double z = sc.nextDouble();

		if (x == 0 || y == 0 || z == 0) {
			System.out.println(0);

		} else if (x < 0 && y < 0 && z < 0) {
			System.out.println("-");

		} else if (x > 0 && y > 0 && z > 0) {
			System.out.println("+");

		} else if ((x > 0 && y > 0 && z < 0) || (x > 0 && z > 0 && y < 0) || (y > 0 && z > 0 && x < 0)) {
			System.out.println("-");

		} else {
			System.out.println("+");
		}

	}

}