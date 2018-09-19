package loops;

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String bin = sc.nextLine();
		String revBin = "";
		long dec = 0;

		for (int i = bin.length() - 1; i >= 0; i--) {
			revBin += bin.charAt(i);
		}
		
		for (int j = 0; j < revBin.length(); j++) {

			int nums = Integer.parseInt(String.valueOf(revBin.charAt(j)));

			dec += nums * Math.pow(2, j);

		}
		System.out.println(dec);
	}

}
