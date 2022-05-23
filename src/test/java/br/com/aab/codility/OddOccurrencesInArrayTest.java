package br.com.aab.codility;

import br.com.aab.codility.arrays.OddOccurrencesInArray;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class OddOccurrencesInArrayTest {

    OddOccurrencesInArray oddOccurrencesInArray = new OddOccurrencesInArray();

    @Test
    public void solutions() {
        int result = oddOccurrencesInArray.solutions(new int[] {9, 3, 9, 3, 9, 7, 9});
        int expected = 7;
        assertThat(result).isEqualTo(expected);
    }
}