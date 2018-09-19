package loops;

import java.util.Scanner;

public class AppearanceCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.nextLine();
		String nums = sc.nextLine();
		int x = sc.nextInt();
		String[] numsArr = new String[n];
		numsArr = nums.split(" ");
		int counter = 0;
		
		for (int i = 0; i < numsArr.length; i++) {
			if (numsArr[i].equals(String.valueOf(x))) {
				counter++;
			}
		}
		System.out.println(counter);
	}

}
