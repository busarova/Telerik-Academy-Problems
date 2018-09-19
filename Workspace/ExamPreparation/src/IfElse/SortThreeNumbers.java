package IfElse;

import java.util.Scanner;

public class SortThreeNumbers {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();

		if (num1 < -1000 || num1 > 1000 || num2 < -1000 || num2 > 1000 || num3 < -1000 || num3 > 1000) {

			System.out.println("invalid number");

		} else if (num1 > num2 && num1 > num3) {
			if (num2 > num3) {
				System.out.print(num1 + " " + num2 + " " + num3);
			} else {
				System.out.print(num1 + " " + num3 + " " + num2);
			}

		} else if (num2 > num1 && num2 > num3) {
			if (num1 > num3) {
				System.out.print(num2 + " " + num1 + " " + num3);
			} else {
				System.out.print(num2 + " " + num3 + " " + num1);
			}

		} else if (num3 > num1 && num3 > num2) {
			if (num1 > num2) {
				System.out.print(num3 + " " + num1 + " " + num2);
			} else {
				System.out.print(num3 + " " + num2 + " " + num1);
			}
		} else {
			System.out.println(num1 + " " + num2 + " " + num3);
		}
	}
}
