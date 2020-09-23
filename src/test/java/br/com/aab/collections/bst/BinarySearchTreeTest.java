package br.com.aab.collections.bst;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class BinarySearchTreeTest {

    Tree<Integer> binarySearchTree;

    @Before
    public void setBinarySearchTree() {
        binarySearchTree = new BinarySearchTree<>();
        for (int i : new int[]{10, -1, 1, 0, 1000, -22}) {
            binarySearchTree.insert(i);
        }
    }

    @Test
    public void testInsert() {
        assertThat(binarySearchTree).isNotNull();
    }

    @Test
    public void testGetMaxValue() {
        assertThat(binarySearchTree.getMaxValue()).isEqualTo(1000);
    }

    @Test
    public void testGetMinValue() {
        assertThat(binarySearchTree.getMinValue()).isEqualTo(-22);
    }

//    @Test
//    void traversal() {
//    }
}