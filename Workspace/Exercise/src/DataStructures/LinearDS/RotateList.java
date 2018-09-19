package DataStructures.LinearDS;

public class RotateList {

    public static ListNode rotateRight(ListNode head, int k) {

        if (k == 0){
            return head;
        }

        int len = 1;
        ListNode tale = head;

        while (tale.next != null) {

            len++;
            tale = tale.next;
        }

        tale.next = head;

        for (int step = 0; step < len - (k % len); step++) {

            tale = tale.next;

        }
        head = tale.next;
        tale.next = null;

        return head;
    }

    public static void print(ListNode x) {
        while (x != null) {
            System.out.println(x.val);
            x = x.next;
        }

    }

    public static void main(String[] args) {

        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(3);
        list1.next.next.next = new ListNode(4);
        list1.next.next.next.next = new ListNode(5);
        list1.next.next.next.next.next = new ListNode(6);

        print(rotateRight(list1, 2));
    }
}
