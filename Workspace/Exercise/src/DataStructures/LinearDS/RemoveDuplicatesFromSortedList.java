package DataStructures.LinearDS;

public class RemoveDuplicatesFromSortedList {

    public static class Solution {
        public static ListNode deleteDuplicates(ListNode head) {

            ListNode result = new ListNode(-1);
            ListNode node = result;

            while (head != null && head.next != null) {

                if (head.val == node.val) {

                    head = head.next;

                } else {
                    node.next = new ListNode(head.val);
                    node = node.next;
                    head = head.next;
                }

            }
            return result.next;
        }
    }

    public static void print(ListNode x) {
        while (x != null) {
            System.out.println(x.val);
            x = x.next;
        }
    }

    public static void main(String[] args) {

        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(1);
        list1.next.next = new ListNode(2);
        list1.next.next.next = new ListNode(3);
        list1.next.next.next.next = new ListNode(3);
        list1.next.next.next.next.next = new ListNode(3);

        ListNode result = Solution.deleteDuplicates(list1);
        print(result);

    }
}