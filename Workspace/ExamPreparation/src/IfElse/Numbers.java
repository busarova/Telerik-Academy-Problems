package IfElse;

import java.util.ArrayList;
import java.util.Scanner;

public class Numbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ArrayList<String> operations = new ArrayList<String>();

		while (true) {

			String input = sc.nextLine();
			if (input.equals("end")) {
				break;
			}
			operations.add(input);

		}

		for (String cell : operations) {

			String operation = cell.replaceAll(" \\d", "");
			String operand = cell.replaceAll("\\D", "");
			String number = "";
			System.out.println(operation);
			
		}

	}

}
// set NUMBER 1
// Sets the current value to number
// front-add DIGIT 2
// Adds the digit DIGIT to the front (at the leftmost)
// front-remove 3
// Removes the first (the leftmost) digit
// does nothing if there are no digits
// back-add DIGIT 4
// Adds the digit DIGIT to the back (at the rightmost)
// back-remove 5
// Removes the last (the rightmost) digit
// does nothing if there are no digits
// reverse 6
// Reverses the digits of the current number
// print 7
// Prints the current number
// prints an empty line if there are no digits
// end
// Stops the program
