package IfElse;

import java.util.Scanner;

public class Game {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int max = 0;

		if (n < 100 || n > 999) {
			System.out.println("invalid number");

		} else {

			int num1 = n / 100;
			int num2 = (n % 100) / 10;
			int num3 = n % 10;

			int current = num1 * num2 * num3;
			if (max < current) {
				max = current;
			}
			current = num1 * num2 + num3;
			if (max < current) {
				max = current;
			}
			current = num1 + num2 * num3;
			if (max < current) {
				max = current;
			}
			current = num1 + num2 + num3;
			if (max < current) {
				max = current;
			}
		}
		System.out.println(max);

	}
}
