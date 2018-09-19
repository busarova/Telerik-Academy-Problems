package loops;

import java.util.Scanner;

public class GoodNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String ab = sc.nextLine();
		String[] abArr = ab.split(" "); 
		int a = Integer.parseInt(abArr[0]);
		int b = Integer.parseInt(abArr[1]);
		int counter = 0;

		for (int i = a; i <= b; i++) {

			int digit = 0;
			int currentNum = i;
			boolean isGoodNum = true;

			while (currentNum > 0) {

				digit = currentNum % 10;
				currentNum /= 10;

				if (digit == 0) {
					continue;

				} else if (i % digit != 0) {
					isGoodNum = false;
				}
			}
			if (isGoodNum) {
				counter++;
			}
		}

		System.out.println(counter);
	}

}
