package arrays;

import java.util.Scanner;

public class MissCat {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] ranks = new int[11];

        for (int i = 0; i < n; i++) {

            int catNum = sc.nextInt();
            ranks[catNum]++;

        }

        int maxVotes = 0;
        int winnerNumber = 0;

        for (int i = 0; i < ranks.length; i++) {

            if (maxVotes < ranks[i]){
                maxVotes = ranks[i];
                winnerNumber = i;
            }
        }

        System.out.println(winnerNumber);
    }
}
