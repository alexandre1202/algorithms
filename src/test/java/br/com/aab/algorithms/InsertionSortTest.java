package br.com.aab.algorithms;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class InsertionSortTest {

    private int[] numbers = {20, 35, -15, 7, 55, 1, -22};

    @Spy
    InsertionSort insertionSort;

    @Test
    public void sortExec_Success() {
        int[] expected = {-22, -15, 1, 7, 20, 35, 55};
        int[] actual = insertionSort.sortExec(numbers);
        assertThat(expected).isEqualTo(actual);
    }
}