package br.com.aab.datastructures.bst;

import static java.util.Objects.isNull;
import static java.util.Objects.nonNull;

public class CompareTrees<T extends Comparable<T>> {
    public boolean compare(final Node<T> node1, final Node<T> node2) {
        if ((isNull(node1) && isNull(node2)) || (isNull(node1) && nonNull(node2)) || (nonNull(node1) && isNull(node1)))
                return node1 == node2;

        if (node1.getData().compareTo(node2.getData()) != 0) return false;

        return compare(node1.getLeftChild(), node2.getLeftChild())
                && compare(node1.getRightChild(), node2.getRightChild());
    }

    public static void main(String[] args) {
        BST<Integer> tree1 = new BSTImpl<>();
        tree1.insert(10);
        tree1.insert(5);
        tree1.insert(9);
        tree1.insert(15);
        tree1.insert(7);
        tree1.insert(25);
        tree1.insert(14);
        tree1.insert(16);
        tree1.insert(1);

        BST<Integer> tree2 = new BSTImpl<>();
        tree2.insert(10);
        tree2.insert(5);
        tree2.insert(9);
        tree2.insert(15);
        tree2.insert(7);
        tree2.insert(25);
        tree2.insert(14);
        tree2.insert(16);
        tree2.insert(1);

        CompareTrees<Integer> compareTrees = new CompareTrees<>();
        System.out.println("Trees are igual [" + compareTrees.compare(tree1.getRoot(), tree2.getRoot()) + "]");
    }
}
