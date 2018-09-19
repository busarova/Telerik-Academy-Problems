package arrays;

import java.util.Scanner;

public class Kitty {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] path = sc.nextLine().split("");
        String[] moves = ("0 " + sc.nextLine()).split(" ");

        int foodCount = 0;
        int soulCount = 0;
        int deadlockCount = 0;
        int position = 0;

        for (int i = 0; i < moves.length; i++) {

            int move = Integer.parseInt(moves[i]);
            position = (position + move) % path.length;

            if (position < 0) {

                position += path.length;
            }

            switch (path[position]) {

                case "*":
                    foodCount++;
                    path[position] = " ";
                    break;

                case "@":
                    soulCount++;
                    path[position] = " ";
                    break;

                case "x":
                    deadlockCount++;
                    if (position % 2 == 0) {
                        if (soulCount <= 0) {
                            System.out.println("You are deadlocked, you greedy kitty!\n" +
                                    "Jumps before deadlock: " + i);
                            return;
                        } else {
                            path[position] = "@";
                            soulCount--;
                        }
                    }
                    if (position % 2 != 0) {
                        if (foodCount <= 0) {
                            System.out.println("You are deadlocked, you greedy kitty!\n" +
                                    "Jumps before deadlock: " + i);
                            return;
                        } else {
                            path[position] = "*";
                            foodCount--;
                        }
                    }
                    break;
            }

        }

        System.out.printf("Coder souls collected: %d\nFood collected: %d\nDeadlocks: %d",
                soulCount, foodCount, deadlockCount);

    }

}
