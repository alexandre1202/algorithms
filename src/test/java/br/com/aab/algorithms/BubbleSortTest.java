package br.com.aab.algorithms;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.verify;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

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
        assertThat(actual, is(expected));
        
        //Junit 5
        Assertions.assertEquals(expected, actual);
        
        //Junit 4
        Assert.assertEquals(expected, actual);
        
        verify(bubbleSort).sortExec(numbers);
    }
}