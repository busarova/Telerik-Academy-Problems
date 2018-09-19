package IfElse;

import java.util.Scanner;

public class SecretMessage {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StringBuilder code = new StringBuilder(sc.nextLine());

        System.out.println(code.reverse().toString().replaceAll("\\d", ""));
    }
}
