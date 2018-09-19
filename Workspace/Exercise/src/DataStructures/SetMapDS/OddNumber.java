package DataStructures.SetMapDS;

import java.util.HashMap;
import java.util.Scanner;

public class OddNumber {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        HashMap<Long, Integer> nums = new HashMap<>();


        for (int i = 0; i < N; i++) {

            Long key = sc.nextLong();

            if (!nums.containsKey(key)) {
                nums.put(key, 1);
            } else {

                int counter = nums.get(key);
                counter++;
                nums.put(key, counter);
            }
        }

        for (Long key : nums.keySet()) {

            int val = nums.get(key);
            if (val % 2 != 0) {

                System.out.println();
                System.out.println(key);
            }
        }
    }
}
