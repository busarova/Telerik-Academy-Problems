package loops;

import java.util.Scanner;

public class PrintDeck {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String card = sc.nextLine();

		String[] cards = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A" };
		
		for (int i = 0; i < cards.length; i++) {
			System.out.printf("%1$s of spades, %1$s of clubs, %1$s of hearts, %1$s of diamonds%n", cards[i]);
			if (cards[i].equals(card)) {
				break;
			}
		}
	}

}
