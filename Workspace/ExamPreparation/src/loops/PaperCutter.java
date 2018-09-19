package loops;

import java.util.Scanner;

public class PaperCutter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int sheets = 1024;

		for (int i = 0; i <= 10; i++) {

			if (n - sheets >= 0) {
				n -= sheets;

			} else {
				
				System.out.println("A" + i);
			}
			sheets /= 2;
		}
	}

}
