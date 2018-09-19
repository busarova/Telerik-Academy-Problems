package DataStructures.LinearDS;

public class ReverseLinkedList {

    public static ListNode reverseList(ListNode head) {

        ListNode prev = null;

        while (head != null) {

            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;

    }

    public static void print(ListNode x) {
        while (x != null) {
            System.out.print(x.val + " ");
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

        ListNode result = reverseList(list1);
        print(result);
    }
}
