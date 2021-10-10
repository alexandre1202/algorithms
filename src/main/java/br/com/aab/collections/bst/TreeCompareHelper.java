package br.com.aab.collections.bst;

import java.util.Objects;

import static java.util.Objects.isNull;
import static java.util.Objects.nonNull;

public class TreeCompareHelper<T extends Comparable<T>> {
    public static void main(String[] args) {
        Tree<Integer> bst1 = new BinarySearchTree<Integer>() {{
            insert(2);
            insert(55);
            insert(67);
            insert(12);
            insert(11);
        }};

        Tree<Integer> bst2 = new BinarySearchTree<Integer>() {{
            insert(2);
            insert(55);
            insert(67);
            insert(12);
            insert(11);
        }};

        TreeCompareHelper<Integer> treeCompareHelper = new TreeCompareHelper<>();
        System.out.println("Is the Tree equals => " + treeCompareHelper.compareTrees(bst1.getRoot(), bst2.getRoot()));
    }

    public boolean compareTrees(Node<T> node1, Node<T> node2) {

        if((isNull(node1) && isNull(node2)) || (isNull(node1) && nonNull(node2)) || (nonNull(node1) && isNull(node2)))
            return node1==node2;
        //if the values within the nodes are not the same we return false (trees are not the same)
        if(node1.getData().compareTo(node2.getData())!=0) return false;

        //the left subtree values AND the right subtree values must match as well !!!
        return compareTrees(node1.getLeftChild(), node2.getLeftChild())&&compareTrees(node1.getRightChild(), node2.getRightChild());
    }

}