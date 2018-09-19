package IfElse;

import java.util.Scanner;

public class IntDoubleString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String input = sc.nextLine();

		switch (input) {

		case "integer":
			int integer = sc.nextInt();
			if (integer < -1000 || integer > 1000) {
				System.out.println("invalid input");
			} else {
				System.out.println(integer + 1);
			}
			break;
		case "real":
			double real = sc.nextDouble();
			if (real < -1000 || real > 1000) {
				System.out.println("invalid input");
			} else {
				System.out.printf("%.2f", real + 1);
			}
			break;
		case "text":
			String text = sc.nextLine();
			System.out.println(text + "*");
			break;
		default:
			System.out.println("invalid input");
		}

	}

}
