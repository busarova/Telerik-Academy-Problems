package IfElse;

import java.util.Scanner;

public class CartesianCoordinates {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double x = sc.nextDouble();
		double y = sc.nextDouble();

		if ((x * y) == 0) {
			if (x == 0 && y == 0) {
				System.out.println(0);
			} else if (x == 0) {
				System.out.println(5);
			} else
				System.out.println(6);

		} else if ((x * y) < 0) {
			if (x < 0) {
				System.out.println(2);
			} else
				System.out.println(4);

		} else if ((x * y) > 0) {
			if (x > 0) {
				System.out.println(1);
			} else
				System.out.println(3);
		}

	}

}
