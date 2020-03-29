package br.com.aab.challenge;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class TheListIntegerTest {

    private TheListInteger theListInteger = new TheListInteger();

    @Test
    public void testSumNumbers() {
        int[] numbers = {235, 947, 32, 19, 120};
        int expected = theListInteger.sumNumbers(numbers);
        //Another way to sum numbers is as following:
//        int result = (int) Arrays.stream(numbers).boxed()
//                .collect(Collectors.toList())
//                .stream()
//                .mapToInt(Integer::intValue)
//                .summaryStatistics().getSum();
        int result = 1353;
        assertThat(expected).isEqualTo(result);
    }

    @Test
    public void testGetSmallestMissingNumber() {
        int[] numbers = {2, 4, 5, 6, 7, 8, 10};
        int result = theListInteger.getSmallestMissingNumber(numbers);
        int expected = 3;
        assertThat(expected).isEqualTo(result);
    }

    @Test
    public void testMaxNumberInArray() {
        int[] numbers = {235, 947, 32, 19, 120};
        int expected = theListInteger.maxNumberInArray(numbers);
        int result = 947;
        assertThat(expected).isEqualTo(result);
    }

    @Test
    public void testMinNumberInArray() {
        int[] numbers = {235, 947, 32, 19, 120};
        int expected = theListInteger.minNumberInArray(numbers);
        int result = 19;
        assertThat(expected).isEqualTo(result);
    }
}