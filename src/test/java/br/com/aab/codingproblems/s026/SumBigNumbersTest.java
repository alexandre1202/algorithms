package br.com.aab.codingproblems.s026;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

public class SumBigNumbersTest {

    private SumBigNumbers sumBigNumbers;

    @Test
    public void testSumIntegers() {
        sumBigNumbers = new SumBigNumbers(Integer.MAX_VALUE - 1, 1);
        int result = sumBigNumbers.getSumIntegers();
        assertThat(result).isEqualTo(Integer.MAX_VALUE);
    }

    @Test
    public void testSumIntegersWithOverflow() {
        sumBigNumbers = new SumBigNumbers(Integer.MAX_VALUE - 1, 2);
        assertThatThrownBy(() -> sumBigNumbers.getSumIntegers())
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("integer overflow");
    }

    @Test
    public void testSumLongs() {
        sumBigNumbers = new SumBigNumbers(Long.MAX_VALUE - 1, 1);
        long result = sumBigNumbers.getSumLongs();
        assertThat(result).isEqualTo(Long.MAX_VALUE);
    }

    @Test
    public void testSumLongsWithOverflow() {
        sumBigNumbers = new SumBigNumbers(Long.MAX_VALUE - 1, 2);
        assertThatThrownBy(() -> sumBigNumbers.getSumLongs())
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("long overflow");
    }

}