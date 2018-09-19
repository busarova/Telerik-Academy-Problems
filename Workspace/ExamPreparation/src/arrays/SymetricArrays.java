package arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class SymetricArrays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int arrays = sc.nextInt();
		sc.nextLine();
		ArrayList<String[]> al = new ArrayList<>();

		for (int i = 0; i < arrays; i++) {

			String[] input = sc.nextLine().split(" ");
			al.add(input);
		}
		for (String[] str : al) {

			if (isSimmetric(str)) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
		}

	}

	static boolean isSimmetric(String[] arr) {

		for (int i = 0, j = arr.length - 1; i <= arr.length / 2 || j >= arr.length / 2; i++, j--) {

			if (!arr[i].equals(arr[j])) {

				return false;
			}
		}
		return true;

	}

}
