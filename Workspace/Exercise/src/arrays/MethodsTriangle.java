package arrays;

public class MethodsTriangle {

	public static void main(String[] args) {

		printTriangle(3);

	}

	static void printTriangle(int num) {

		for (int i = 1; i <= num; i++) {
			
			printLn(i);
		}
		for (int i = num - 1; i >= 1; i--) {

			printLn(i);
		}

	}

	static void printLn(int x) {

		for (int j = 1; j <= x; j++) {

			System.out.print(j + " ");
		}
		System.out.println();

	}
}
