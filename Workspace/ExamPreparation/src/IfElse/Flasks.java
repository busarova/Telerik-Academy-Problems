package IfElse;

import java.util.Scanner;

public class Flasks {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int nFlask = sc.nextInt();
		double liters = sc.nextDouble();
		double flaskCap = 0;

		for (int flaskNum = 1; flaskNum <= nFlask; flaskNum++) {

			if (flaskCap >= liters) {
				if (flaskNum % 2 != 0) {
					System.out.println(flaskNum);
					break;
				} else {
					System.out.println(flaskNum + 1);
					break;
				}
			}
			flaskCap = flaskCap + flaskNum;
			
			if (flaskNum == nFlask) {
				System.out.println(1);
			}
		}

	}

}
