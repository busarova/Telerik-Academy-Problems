package IfElse;

import java.util.Scanner;

public class SayHello {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();

        sayHello(name);

    }

    static void sayHello(String name){

        System.out.println("Hello, " + name + "!");
    }
}
