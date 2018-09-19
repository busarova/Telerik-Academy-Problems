package arrays;

import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Permutations {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<Integer> perm = Stream.generate(() -> 0)
                .limit(n)
                .collect(Collectors.toList());

        getPerms(0, n, new HashSet<>(), perm);
    }

    static void getPerms(int index, int n, HashSet<Integer> used, List<Integer> perm) {

        if (index == n){

            for (int num: perm) {
                System.out.print(num + " ");

            }
            System.out.println();
            return;
        }

        for (int i = 1; i <= n; i++){
            if (used.contains(i)){
                continue;
            }
            used.add(i);
            perm.set(index, i);
            getPerms(index + 1, n, used, perm);
            used.remove(i);
        }

    }
}
