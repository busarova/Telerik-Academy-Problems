package arrays;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		String[] input = sc.nextLine().split(" ");
		String[] reverse = new String[input.length];
		
		int revIndex = 0;
		
		for (int i = reverse.length - 1; i > 0 ; i--) {
			
			reverse[revIndex] = input[i] + ", ";
			revIndex++;
		}
		reverse[revIndex] = input[0];
		
		for (int i = 0; i < reverse.length; i++) {
			System.out.print(reverse[i]);
		}
	}

}
