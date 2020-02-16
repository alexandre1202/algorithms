package br.com.aab.algorithms;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class BubbleSortTest {

    private int[] numbers = { 20, 35, -15, 7, 55, 1, -22 };

    @Mock
    BubbleSort bubbleSort;

    @Test
    public void sortExec_Success() {

        int[] expected = {-22, -15, 1, 7, 20, 35, 55};

        when(bubbleSort.sortExec(numbers)).thenReturn(expected);

        int[] actual = bubbleSort.sortExec(numbers);

        assertEquals(expected, actual);

        verify(bubbleSort).sortExec(numbers);

    }
}