package br.com.aab.challenge;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class ArraysChallengesTest {

    ArraysChallenges arraysChallenges;

    @Test
    public void incNumberToArray_whenSuccessAddingOne() {
        int[] intArray = {1, 2, 3, 4};
        int[] expected = {1, 2, 3, 5};
        int[] actual = arraysChallenges.incNumberToArray(intArray, 1);
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void incNumberToArray_whenSuccessAddingFive() {
        int[] intArray = {1, 2, 3, 4};
        int[] expected = {1, 2, 3, 9};
        int[] actual = arraysChallenges.incNumberToArray(intArray, 5);
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void incNumberToArrayWithZeros_whenSuccessAddingOne() {
        int[] intArray = {1, 0, 0, 4};
        int[] expected = {1, 0, 0, 5};
        int[] actual = arraysChallenges.incNumberToArray(intArray, 1);
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void incNumberToArrayWithNine_whenSuccessAddingOne() {
        int[] intArray = {9, 9, 9, 9};
        int[] expected = {1, 0, 0, 0, 0};
        int[] actual = arraysChallenges.incNumberToArray(intArray, 1);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}