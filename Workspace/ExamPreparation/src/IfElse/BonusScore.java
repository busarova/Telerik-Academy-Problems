package IfElse;

import java.util.Scanner;

public class BonusScore {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int score = sc.nextInt();

		if (score < 1 || score > 9) {
			System.out.println("invalid score");
		}

		if (score >= 1 && score <= 3) {
			System.out.println(score * 10);
		}
		if (score >= 4 && score <= 6) {
			System.out.println(score * 100);
		}
		if (score >= 7 && score <= 9) {
			System.out.println(score * 1000);
		}
	}

}
/*
If the score is between 1 and 3, the program multiplies it by 10.
If the score is between 4 and 6, the program multiplies it by 100.
If the score is between 7 and 9, the program multiplies it by 1000.
If the score is less than 0 or more than 9, the rogram prints "invalid score".
*/

