package DataStructures.TreeDS;

public class DFSBinaryTree {


    public void inOrder(TNode root) {

        if (root != null) {

            inOrder(root.leftChild);
            System.out.println(root.val);
            inOrder(root.rightChild);
        }
    }

    public void preOrder(TNode root) {

        if (root != null) {

            preOrder(root.leftChild);
            preOrder(root.rightChild);
            System.out.println(root.val);

        }
    }
    public void postOrder(TNode root) {

        if (root != null) {

            System.out.println(root.val);
            postOrder(root.leftChild);
            postOrder(root.rightChild);
        }
    }
}
