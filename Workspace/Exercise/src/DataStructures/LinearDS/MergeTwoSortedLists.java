package DataStructures.LinearDS;

public class MergeTwoSortedLists {

    public static Node solution(Node l1, Node l2) {

        Node result = new Node(-1);
        Node node = result;

        while (l1.next != null && l2 != null) {
            if (l1.value < l2.value) {
                node.next = new Node(l1.value);
                l1 = l1.next;
            } else {
                node.next = new Node(l2.value);
                l2 = l2.next;
            }
            node = node.next;
        }

        while (l2 != null) {
            node.next = new Node(l2.value);
            l2 = l2.next;
            node = node.next;
        }
        while (l1 != null) {
            node.next = new Node(l1.value);
            l1 = l1.next;
            node = node.next;
        }

        return result.next;
    }

    public static void print(Node x) {
        while (x != null) {
            System.out.println(x.value);
            x = x.next;
        }
    }


    public static void main(String[] args) {

        Node list1 = new Node(1);
        list1.next = new Node(1);
        list1.next.next = new Node(2);
        list1.next.next.next = new Node(3);
        list1.next.next.next.next = new Node(3);
        list1.next.next.next.next.next = new Node(3);

        Node list2 = new Node(1);
        list2.next = new Node(1);
        list2.next.next = new Node(2);
        list2.next.next.next = new Node(3);
        list2.next.next.next.next = new Node(3);
        list2.next.next.next.next.next = new Node(3);

        Node result = solution(list1, list2);
        print(result);


    }
}
