package br.com.aab.codility;

import br.com.aab.codility.arrays.CyclicRotation;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.assertj.core.api.Assertions.*;

@RunWith(MockitoJUnitRunner.class)
public class CyclicRotationTest {

    CyclicRotation cyclicRotation = new CyclicRotation();

    @Test
    public void testSolutions() {
        int[] result1 = cyclicRotation.solutions(new int[] {3, 8, 9, 7, 6}, 3);
        int[] result2 = cyclicRotation.solutions(new int[] {1, 2, 3, 4, 5, 6}, 2);
        int[] result3 = cyclicRotation.solutions(new int[] {0, 0, 0}, 1);
        int[] result4 = cyclicRotation.solutions(new int[] {3, 4, 1, 2}, 2);

        int[] expected1 = new int[] {9, 7, 6, 3, 8};
        int[] expected2 = new int[] {5, 6, 1, 2, 3, 4};
        int[] expected3 = new int[] {0, 0, 0};
        int[] expected4 = new int[] {1, 2, 3, 4};

        assertThat(result1).isEqualTo(expected1);
        assertThat(result2).isEqualTo(expected2);
        assertThat(result3).isEqualTo(expected3);
        assertThat(result4).isEqualTo(expected4);
    }
}