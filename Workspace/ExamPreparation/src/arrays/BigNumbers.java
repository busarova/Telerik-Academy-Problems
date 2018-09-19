package arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class BigNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String sizes = sc.nextLine().trim();

		String[] len = sizes.split(" ");
	
		int lenL = Math.max(Integer.parseInt(len[0]), Integer.parseInt(len[1]));
		int lenS = Math.min(Integer.parseInt(len[0]), Integer.parseInt(len[1]));
		

		String in1 = sc.nextLine().trim();
		String in2 = sc.nextLine().trim();

		StringBuilder zeros = new StringBuilder();

		while (lenS < lenL) {

			zeros.append(" 0");
			lenS++;
		}

		if (in1.length() < in2.length()) {
			in1 += zeros;

		} else {
			in2 += zeros;
		}

		String[] input1 = in1.split(" ");
		String[] input2 = in2.split(" ");

		ArrayList<Integer> num1 = new ArrayList<>();
		ArrayList<Integer> num2 = new ArrayList<>();

		for (int i = 0; i < lenL; i++) {

			num1.add(Integer.parseInt(input1[i]));
			num2.add(Integer.parseInt(input2[i]));

		}

		ArrayList<String> result = new ArrayList<>();
		int ednoNaUm = 0;
		int digitToAdd = 0;

		for (int i = 0; i < num1.size(); i++) {

			digitToAdd = num1.get(i) + num2.get(i) + ednoNaUm;
			
			if (digitToAdd > 9) {
				
				ednoNaUm = 1;
				digitToAdd %= 10;
				
			} else {
				
				ednoNaUm = 0;
			}
					
			result.add(digitToAdd + " ");

			if (i == num1.size() - 1 && ednoNaUm == 1) {
				
				result.add("1");

			}
		}

		for (String index : result) {

			System.out.print(index);

		}
		
	}

}
