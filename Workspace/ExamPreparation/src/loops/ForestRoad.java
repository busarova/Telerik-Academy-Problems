package loops;

import java.util.Scanner;

public class ForestRoad {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = (2 * n) - 1;

        for (int i = 0; i < m; i++) {

            int left = i;
            int right = (m - 1) - i;

            for (int j = 0; j < n; j++) {

                if (j == left && i < n) {
                    System.out.print("*");
                    continue;
                }
                if (j == right && i >= n){
                    System.out.print("*");
                    continue;
                }
                System.out.print(".");
            }
            System.out.println();
        }
    }
}
