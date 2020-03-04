package br.com.aab.algorithms;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.verify;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class BubbleSortTest {

    private int[] numbers = {20, 35, -15, 7, 55, 1, -22};

    @Spy
    BubbleSort bubbleSort;

    @Test
    public void sortExec_Success() {
        int[] expected = {-22, -15, 1, 7, 20, 35, 55};
        int[] actual = bubbleSort.sortExec(numbers);

        //HAMCREST
//        assertThat(actual, is(expected));
        //Junit 5
//        Assertions.assertEquals(expected, actual);

        //AssertJ
        assertThat(expected).isEqualTo(actual);
        verify(bubbleSort).sortExec(numbers);
    }

    @Test
    public void sortExec_whenArrayIsNull() {
        int[] actual = bubbleSort.sortExec(null);

        assertThat(actual).isNull();
    }

    @Test
    public void sortExec_OnlyOneElement() {

        int[] expected = {1};
        int[] actual = bubbleSort.sortExec(new int[] {1});

        assertThat(expected).isEqualTo(actual);
    }

    @Test
    public void sortExec_ArrayAlreadySorted() {

        int[] expected = {-22, -15, 1, 7, 20, 35, 55};
        int[] actual = bubbleSort.sortExec(expected);

        assertThat(expected).isEqualTo(actual);
    }

}