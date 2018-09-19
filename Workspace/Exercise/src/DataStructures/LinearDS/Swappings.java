package DataStructures.LinearDS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

//class Node {
//
//    public Node next;
//    public Node previous;
//    public int value;
//
//    public Node(int x) {
//
//        value = x;
//        next = null;
//        previous = null;
//    }
//
//    public void linkNode(Node x) {
//
//        this.next = x;
//        x.previous = this;
//    }
//
//    public void splitNode() {
//
//        if (this.previous != null) {
//            this.previous.next = null;
//            this.previous = null;
//
//        }
//        if (this.next != null) {
//            this.next.previous = null;
//            this.next = null;
//        }
//    }
//}

public class Swappings {

    public static void print(Node x) {

        StringBuilder result = new StringBuilder();
        while (x != null) {
            result.append(x.value).append(" ");
            x = x.next;
        }
        System.out.println(result);

    }

    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(sc.readLine());
        String[] numbers = sc.readLine().split(" ");
        List<Node> list = new ArrayList<>();
        Node tail = new Node(0);
        list.add(tail);

        for (int i = 1; i <= n; i++) {

            Node next = new Node(i);
            tail.linkNode(next);
            list.add(next);
            tail = tail.next;

        }
        Node head = list.get(1);

        for (String number : numbers) {

            int num = Integer.parseInt(number);

            Node mid = list.get(num);
            Node start = mid.next;
            Node end = mid.previous;
            mid.splitNode();

            if (mid == tail) {
                start = mid;
            } else
                tail.linkNode(mid);

            if (mid == head) {
                end = mid;
            } else
                mid.linkNode(head);

            head = start;
            tail = end;

        }
        print(head);
    }
}
