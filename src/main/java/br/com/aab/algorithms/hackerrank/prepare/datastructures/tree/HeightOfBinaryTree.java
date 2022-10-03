package br.com.aab.algorithms.hackerrank.prepare.datastructures.tree;

public class HeightOfBinaryTree {
    public static int height(Node root) {
        if (root == null || (root.left == null && root.right == null)) return 0;

        return Math.max(height(root.left), height(root.right));
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
}
