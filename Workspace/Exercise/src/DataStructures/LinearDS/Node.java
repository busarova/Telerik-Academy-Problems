package DataStructures.LinearDS;

public class Node {

    public Node next;
    public Node previous;
    public int value;

    public Node (int x){

        value = x;
        next = null;
        previous = null;
    }

    public void linkNode(Node x) {

        this.next = x;
        x.previous = this;
    }

    public void splitNode() {

        if (this.previous != null) {
            this.previous.next = null;
            this.previous = null;

        }
        if (this.next != null) {
            this.next.previous = null;
            this.next = null;
        }
    }

}
