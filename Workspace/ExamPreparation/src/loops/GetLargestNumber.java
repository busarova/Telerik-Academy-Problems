package loops;

import java.util.Scanner;

public class GetLargestNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String nums = sc.nextLine();
		String []numStr = nums.split(" ");
		int a = Integer.parseInt(numStr[0]);
		int b = Integer.parseInt(numStr[1]);
		int c = Integer.parseInt(numStr[2]);

		System.out.println(GetMax(a, (GetMax(b, c))));

	}
	public static int GetMax (int x, int y) {
		
		if (x > y) {
			return x;
		}else {
			return y;
		}
	}

}
