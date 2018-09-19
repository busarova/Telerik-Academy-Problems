package DataStructures.TreeDS;

import sun.reflect.generics.tree.Tree;

public class BinarySearchTree {

    public TreeNode root;

    public BinarySearchTree() {
        root = null;
    }

    public TreeNode search(int value) {

        return searchChild(root, value);
    }

    private TreeNode searchChild(TreeNode currentNode, int value) {

        if (currentNode.val == value) {
            return currentNode;
        }

        if (value < currentNode.val) {
            return searchChild(currentNode.leftChild, value);
        } else
            return searchChild(currentNode.rightChild, value);

    }

    void insert(int value) {

        root = insertChild(root, value);

    }

    private TreeNode insertChild(TreeNode currentNode, int value) {

        if (currentNode == null) {
            return new TreeNode(value);
        }

        if (currentNode.val >= value) {
            currentNode.leftChild = insertChild(currentNode.leftChild, value);

        } else {
            currentNode.rightChild = insertChild(currentNode.rightChild, value);
        }


        return currentNode;
    }

    void delete(int value) {

        root = deleteChild(root, value);
    }

    private TreeNode deleteChild(TreeNode currentNode, int value) {

        if (currentNode == null) {
            return currentNode;
        }

        if (currentNode.val > value) {
            currentNode.leftChild = deleteChild(currentNode.leftChild, value);
        } else if (currentNode.val < value) {
            currentNode.rightChild = deleteChild(currentNode.rightChild, value);

        } else {

            if (currentNode.rightChild == null) {
                currentNode = currentNode.leftChild;
            } else if (currentNode.leftChild == null) {
                currentNode = currentNode.rightChild;

            } else {
                currentNode.val = findReplacement(currentNode.rightChild).val;
                currentNode.rightChild = deleteChild(currentNode.rightChild, currentNode.val);
            }
        }
        return currentNode;
    }

    private TreeNode findReplacement(TreeNode currentNode) {

        while (currentNode.leftChild != null) {
            currentNode = currentNode.leftChild;
        }

        return currentNode;
    }

    void traverse() {

        inOrder(root);
    }

    void inOrder(TreeNode currentNode) {

        if (currentNode != null) {

            inOrder(currentNode.leftChild);
            System.out.println(currentNode.val);
            inOrder(currentNode.rightChild);
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

        tree.traverse();
        System.out.println("--------");
        System.out.println(tree.search(2).val);
        System.out.println("--------");
        tree.delete(4);
        tree.traverse();
    }
}
