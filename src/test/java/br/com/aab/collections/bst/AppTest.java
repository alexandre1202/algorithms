package br.com.aab.collections.bst;

import org.assertj.core.api.Assertions;

import java.util.Arrays;

public class AppTest {
    public static void main(String[] args) {
        Tree<Integer> binarySearchTree = new BinarySearchTree<>();

        binarySearchTree.insert(10);
        binarySearchTree.insert(-1);
        binarySearchTree.insert(1);
        binarySearchTree.insert(0);
        binarySearchTree.insert(1000);
        binarySearchTree.insert(-22);

        System.out.println("binarySearchTree.getMaxValue() = " + binarySearchTree.getMaxValue());
    }
}
