package br.com.aab.collections.bst;

public class BinarySearchTreeTest {
    public static void main(String[] args) {
        BinarySearchTree<Integer> bstInteger = new BinarySearchTree<>();
        bstInteger.insert(12);
        bstInteger.insert(4);
        bstInteger.insert(20);
        bstInteger.insert(1);
        bstInteger.insert(8);
        bstInteger.insert(16);
        bstInteger.insert(27);

        System.out.println("bstInteger.getMin() = " + bstInteger.getMinValue());
        System.out.println("bstInteger.getMax() = " + bstInteger.getMaxValue());

        bstInteger.traversal();
        bstInteger.remove(16);
        bstInteger.remove(20);
        bstInteger.remove(12);
        System.out.println("\n");
        bstInteger.traversal();
    }
}
