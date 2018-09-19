package DataStructures.TreeDS;

import java.util.LinkedList;
import java.util.Queue;

public class BFSBinaryTree {

    public static void printLevel(TreeNode root) {

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {

            TreeNode tempNode = queue.poll();
            System.out.print(tempNode.val + " ");

            if (tempNode.leftChild != null) {
                queue.add(tempNode.leftChild);
            }

            if (tempNode.rightChild != null) {
                queue.add(tempNode.rightChild);
            }
        }
    }

    public static void main(String[] args) {

        BinarySearchTree tree = new BinarySearchTree();

        tree.insert(5);
        tree.insert(3);
        tree.insert(2);
        tree.insert(4);
        tree.insert(7);
        tree.insert(6);
        tree.insert(8);

        printLevel(tree.root);
    }
}
