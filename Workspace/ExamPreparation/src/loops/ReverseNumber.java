package loops;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String num = sc.nextLine();
		
		System.out.println(reverse(num.trim()));

	}
	public static String reverse (String arr) {
		
		String rev = "";
		
		for (int i = arr.length() - 1; i >= 0; i--) {
			rev += arr.charAt(i);
		}
		return rev;
	}

}
