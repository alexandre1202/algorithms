package br.com.aab.algorithms;

import org.junit.Test;

public class MergeSortTest {

    private MergeSort mergeSort = new MergeSort();

    @Test
    public void testSortExec() {
        int[] array = {20, 35, -15, 7, 55, 1, -22};
        mergeSort.sortExec(array);
    }
}