package br.com.aab.datastructures.bst;

public class BSTTest {
    public static void main(String[] args) {
        BinarySearchTree<Integer> bstInteger = new BinarySearchTree<>();

        bstInteger.insert(10);
        bstInteger.insert(5);
        bstInteger.insert(15);
        bstInteger.insert(14);
        bstInteger.insert(16);
        bstInteger.insert(-1);

        bstInteger.traversal();
    }
}
