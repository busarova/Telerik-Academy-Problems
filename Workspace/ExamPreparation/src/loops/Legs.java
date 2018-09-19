package loops;

import java.util.Scanner;

public class Legs {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int counter = 0;

		for (int i = 0; i <= n; i += 7) {
			for (int j = i; j <= n; j += 5) {
				
				if ((n - j) % 2 == 0) {
					counter++;
				}
			}
		}
		System.out.println(counter);
	}

}
