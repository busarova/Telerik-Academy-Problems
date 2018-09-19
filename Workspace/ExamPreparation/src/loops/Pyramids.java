package loops;

import java.util.Scanner;

public class Pyramids {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		long n = sc.nextLong();
		long col = 1;
		
		while (n > 0) {
			
			n-= col;
			
			if (n <= col) {
				break;
			}
			col++;
		}
		System.out.println(col);
	}

}
