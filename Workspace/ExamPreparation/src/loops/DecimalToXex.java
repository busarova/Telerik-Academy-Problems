package loops;

import java.util.Scanner;

public class DecimalToXex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long decNum = sc.nextLong();
		char[] hexChars = { 'F', 'E', 'D', 'C', 'B', 'A' };
		String hexNum = "";

		if (decNum == 0) {
			System.out.println(0);

		} else {
			while (decNum > 0) {

				long digit = decNum % 16;

				if (digit > 9) {
					hexNum = hexChars[(int) (15 - digit)] + hexNum;

				} else {
					hexNum = digit + hexNum;
				}
				decNum /= 16;
			}
			System.out.println(hexNum);
		}
	}

}
