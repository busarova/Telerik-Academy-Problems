package DataStructures.TreeDS;

import java.util.ArrayList;
import java.util.Scanner;

class TNode {

    int val;
    TNode leftChild, rightChild;

    TNode(int x) {
        val = x;
        leftChild = rightChild = null;
    }
}

class BST {

    public TNode root;

    public BST() {
        root = null;
    }

    void insert(int value) {

        root = insertChild(root, value);
    }

    private TNode insertChild(TNode currentNode, int value) {

        if (currentNode == null) {
            return new TNode(value);
        }
        if (currentNode.val >= value) {
            currentNode.leftChild = insertChild(currentNode.leftChild, value);
        } else {
            currentNode.rightChild = insertChild(currentNode.rightChild, value);
        }

        return currentNode;
    }
}

public class Medians {

    static StringBuilder output = new StringBuilder();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = "";
        BST tree = new BST();

        while (!input.startsWith("EXIT")) {

            input = sc.nextLine().trim();

            if (input.startsWith("ADD")) {
                int num = input.charAt(input.length() - 1) - '0';
                tree.insert(num);
            } else if (input.startsWith("FIND")) {
                find(tree.root);
            } else
                break;
        }
        System.out.println(output);

    }

    static void find(TNode root) {

        ArrayList<Integer> treeValues = new ArrayList<>();
        inOrder(root, treeValues);
        int size = treeValues.size();
        double median = 0;

        if (size % 2 == 0) {

            int mid1 = (size - 1) / 2;
            int mid2 = size / 2;
            median = (((double) treeValues.get(mid1) + (double) treeValues.get(mid2)) / 2);

        } else {

            int mid = size / 2;
            median = treeValues.get(mid);
        }

        if (median % 1.0 != 0)
            output.append(String.format("%s\n", median));
        else
            output.append(String.format("%.0f\n", median));
    }

    static void inOrder(TNode currentNode, ArrayList<Integer> treeInOrder) {

        if (currentNode != null) {

            inOrder(currentNode.leftChild, treeInOrder);
            treeInOrder.add(currentNode.val);
            inOrder(currentNode.rightChild, treeInOrder);
        }

    }


}
