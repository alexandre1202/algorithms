package br.com.aab.codility;

import br.com.aab.codility.iterations.BinaryGap;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class BinaryGapTest {

    BinaryGap binaryGap = new BinaryGap();

    @Test
    public void testSolutions() {
        int binaryGap1 = binaryGap.solutions(9);   //1001
        int binaryGap2 = binaryGap.solutions(529); //1000010001
        int binaryGap3 = binaryGap.solutions(20);  //10100
        int binaryGap4 = binaryGap.solutions(Integer.MAX_VALUE); //1111111111111111111111111111111
        int binaryGap5 = binaryGap.solutions(2147483647);  //0
        int binaryGap6 = binaryGap.solutions(5);  //0

        assertThat(binaryGap1).isEqualTo(2);
        assertThat(binaryGap2).isEqualTo(4);
        assertThat(binaryGap3).isEqualTo(1);
        assertThat(binaryGap4).isEqualTo(0);
        assertThat(binaryGap5).isEqualTo(0);
        assertThat(binaryGap6).isEqualTo(0);
    }
}