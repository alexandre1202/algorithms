package br.com.aab.codingproblems.s002;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class FindingFirstNonRepeatedCharTest {

    private FindingFirstNonRepeatedChar findingFirstNonRepeatedChar;

    @Test
    public void testFindLetterC() {
        String param = "AABBCDDEEFF";
        findingFirstNonRepeatedChar = new FindingFirstNonRepeatedChar(param);
        String foundChar = findingFirstNonRepeatedChar.findV1();
        Assertions.assertThat(foundChar).isEqualTo("C");
    }

    @Test
    public void testFindNumberSeven() {
        String param = "11223344556678899";
        findingFirstNonRepeatedChar = new FindingFirstNonRepeatedChar(param);
        String foundChar = findingFirstNonRepeatedChar.findV1();
        Assertions.assertThat(foundChar).isEqualTo("7");
    }

    @Test
    public void testFindLetterXUsingV2() {
        String param = "AABBCCDDEEFFXZZ";
        findingFirstNonRepeatedChar = new FindingFirstNonRepeatedChar(param);
        String foundChar = findingFirstNonRepeatedChar.findV2();
        Assertions.assertThat(foundChar).isEqualTo("X");
    }

}