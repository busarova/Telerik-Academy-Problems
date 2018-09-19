package DataStructures.LinearDS;

public class DinamicQueue {

    private Node head;
    private Node tale;

    public DinamicQueue() {

        head = null;
        tale = null;
    }

    public boolean isEmpty() {

        return head == null;
    }

    public void enqueue(int x) {

        Node newElement = new Node(x);

        if (isEmpty()) {

            tale = newElement;
            head = newElement;

        } else {

            tale.next = newElement;
            tale = newElement;
        }
    }

    public int dequeue()throws EmptyQueueException{

        if (isEmpty()) {

            throw new EmptyQueueException("Queue is empty!");
        }

        int result = head.value;
        head = head.next;

        if (head == null){
            tale = null;
        }

        return result;
    }
}
