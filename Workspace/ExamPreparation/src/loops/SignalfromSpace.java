package loops;

import java.util.Scanner;

public class SignalfromSpace {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String message = sc.nextLine();
		String rightMessage = "" + message.charAt(0);

		for (int i = 1; i < message.length(); i++) {

			if (message.charAt(i) != message.charAt(i - 1)) {

				rightMessage += message.charAt(i);
			}
		}

		System.out.println(rightMessage);
	}

}
