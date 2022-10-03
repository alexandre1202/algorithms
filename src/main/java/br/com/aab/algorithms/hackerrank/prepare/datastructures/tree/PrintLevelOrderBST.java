package br.com.aab.algorithms.hackerrank.prepare.datastructures.tree;

import java.util.Objects;

public class PrintLevelOrderBST {
    public static void levelOrder(Node root) {
        if (root == null || (root.left == null && root.right == null)) return;
        int height = height(root) +1;
        for (int level = 1; level <= height; level++)
            printNodeData(root, level);
    }

    public static void printNodeData(Node node, int level) {
        if (level == 1) {
            System.out.print(node.data + " ");
        } else {
            if (Objects.nonNull(node.left)) printNodeData(node.left, level - 1);
            if (Objects.nonNull(node.right)) printNodeData(node.right, level - 1);
        }
    }

    public static int height(Node root) {
        if (root == null || (root.left == null && root.right == null)) return 0;

        return Math.max(height(root.left), height(root.right)) +1;
    }

    public static Node insert(Node root, int data) {
        if(root == null) {
            return new Node(data);
        } else {
            Node cur;
            if(data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String[] args) {
        int[] input = {1, 2, 5, 3, 6, 4};
        Node root = null;
        for (int i = 0; i < input.length; i++) {
            root = insert(root, input[i]);
        }

        printNodeData(root, 1);
    }
}

class Node {
    Node left;
    Node right;
    int data;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

