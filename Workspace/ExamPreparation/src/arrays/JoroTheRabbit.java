package arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class JoroTheRabbit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        String[] in = input.split(", ");
        ArrayList<Integer> terrain = new ArrayList<Integer>();

        for (String s : in) {
            terrain.add(Integer.parseInt(s));
        }

        int longestPath = 1;

        for (int i = 0; i < terrain.size(); i++) {
            for (int jump = 1; jump <= terrain.size(); jump++) {

                int position = i;
                int nextPosition = (position + jump) % terrain.size();
                int currentPath = 1;

                while (terrain.get(nextPosition) > terrain.get(position)) {

                    position = nextPosition;
                    nextPosition = (position + jump) % terrain.size();
                    currentPath++;

                }
                if (currentPath > longestPath) {
                    longestPath = currentPath;
                }
            }
        }

        System.out.println(longestPath);

    }

}
// Joro can enter the terrain from every position,
// jump only on numbers larger than the one he is on,
// only in direction left-to-right and with the same step.
// Joro?s jumping steps range from 1 to the size of the terrain.
// Joro cannot jump on position that he already visited.

