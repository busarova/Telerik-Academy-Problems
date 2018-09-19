package DataStructures.LinearDS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JediMeditation {

    public static void main(String[] args) throws IOException {

        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(sc.readLine());
        String[] jedi = sc.readLine().split(" ");

        StringBuilder M = new StringBuilder();
        StringBuilder K = new StringBuilder();
        StringBuilder P = new StringBuilder();

        for (String s : jedi) {

            if (s.contains("M")) {
                M.append(s).append(" ");
            } else if (s.contains("K")) {
                K.append(s).append(" ");
            }else
                P.append(s).append(" ");
        }
        System.out.println(M.append(K).append(P));
    }
}
