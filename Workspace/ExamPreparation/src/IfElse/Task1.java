package IfElse;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double A = sc.nextDouble();
		double B = sc.nextDouble();

		if (A < -100 || A > 100 || B < -100 || B > 100) {
			
			System.out.println("invalid number");
			
		} else if (A > B) {
			
			double C = A;
			A = B;
			B = C;
		}
		if (A % 1 != 0) {
			System.out.print(A + " ");
		}else {
			System.out.print((int)A + " ");
		}
		if (B % 1 != 0) {
			System.out.print(B);
		}else {
			System.out.print((int)B);
		}	
	}

}
