package br.com.aab.datastructures.bstreview2;

public class BSTUnitTest {
    public static void main(String[] args) {
        BST<Integer> bstInteger = new BSTImpl<>();
        bstInteger.insert(10);
        bstInteger.insert(5);
        bstInteger.insert(15);
        bstInteger.insert(14);
        bstInteger.insert(16);
        bstInteger.insert(-1);

        bstInteger.traversal();
    }
}
