package DataStructures.LinearDS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;

public class PathToOne {

    public static void main(String[] args) throws IOException {

        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(sc.readLine());
        Queue<Integer> q = new ArrayDeque<>();
        q.add(n);
        q.add(0);

        while (!q.isEmpty()){

            int num = q.remove();
            int count = q.remove();

            if (num <= 1){
                System.out.println(count);
                break;

            }
            if (num % 2 == 0){

                q.add(num / 2);
                q.add(count + 1);

            }else {

                q.add(num + 1);
                q.add(count + 1);
                q.add(num - 1);
                q.add(count + 1);
            }

        }

    }

}
