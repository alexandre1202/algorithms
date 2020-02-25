package br.com.aab.algorithms;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class SelectionSortTest {

    private int[] numbers = {20, 35, -15, 7, 55, 1, -22};

    @Spy
    SelectionSort selectionSort;

    @Test
    public void sortSelectionSort_Success() {
        int[] expected = {-22, -15, 1, 7, 20, 35, 55};

        int[] actual = selectionSort.sortSelectionSort(numbers);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void sortSelectionSort_whenArrayIsNull() {
        int[] expected = null;

        int[] actual = selectionSort.sortSelectionSort(null);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void sortSelectionSort_onlyOneElement() {
        int[] expected = {1};

        int[] actual = selectionSort.sortSelectionSort(new int[] {1});

        assertThat(actual).isEqualTo(expected);
    }
}