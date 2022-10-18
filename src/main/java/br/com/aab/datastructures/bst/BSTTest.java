package br.com.aab.datastructures.bst;

public class BSTTest {
    public static void main(String[] args) {
        BST<Integer> bstInteger = new BSTImpl<>();
        bstInteger.insert(10);
        bstInteger.insert(5);
        bstInteger.insert(9);
        bstInteger.insert(15);
        bstInteger.insert(7);
        bstInteger.insert(25);
        bstInteger.insert(14);
        bstInteger.insert(16);
        bstInteger.insert(1);

        bstInteger.traversal();
        System.out.println("\nSmaller value: " + bstInteger.getMin());
        System.out.println("Maximum value: " + bstInteger.getMax());

        System.out.println("Removing leaf node { 7 }");
        bstInteger.remove(7);
        bstInteger.traversal();

        System.out.println("\nRemoving the Node with single child { 25 }");
        bstInteger.remove(25);
        bstInteger.traversal();

        System.out.println("\nRemoving the root node { 10 }");
        bstInteger.remove(10);
        bstInteger.traversal();
    }
}
