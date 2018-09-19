package arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Indices {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		sc.nextLine();
		String[] numbersStr = sc.nextLine().split(" ");
		ArrayList<Integer> nums = new ArrayList<>();

		for (String s : numbersStr) {
			int num = Integer.parseInt(s);
			nums.add(num);
		}

		StringBuilder result = new StringBuilder();
		int index = 0;
		boolean[] visited = new boolean[n];
		int loopIndex = -1;
		boolean hasLoop = false;

		while (0 <= index && index < nums.size()) {

			if (visited[index]) {

				hasLoop = true;
				loopIndex = index;
				result.append(")");
				break;
			}

			result.append(" " + index);
			visited[index] = true;
			index = nums.get(index);

		}

		if (hasLoop) {
			
			String loop = "";
			int bracketIndex = result.indexOf(" " + loopIndex + " ");
			
			if (bracketIndex < 0) {
				
				loop = result.substring(result.indexOf(" " + loopIndex)).trim();
				
			} else {
				
				loop = result.substring(result.indexOf(" " + loopIndex + " ")).trim();
			}
			
			int bracket = result.indexOf(loop); 
			
			if (bracket == 0) {

				result.insert(0, "(");

			} else {

				result.replace(bracket - 1, bracket, "(");
			}
		}
		System.out.println(result.toString().trim());
	}

}

