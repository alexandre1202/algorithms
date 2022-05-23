package br.com.aab.codingproblems.s002;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class FindingFirstNonRepeatedCharTest {

    private FindingFirstNonRepeatedChar findingFirstNonRepeatedChar;

    @Test
    public void testFindLetterC() {
        String param = "AABBCDDEEFF";
        findingFirstNonRepeatedChar = new FindingFirstNonRepeatedChar(param);
        String foundChar = findingFirstNonRepeatedChar.find();
        Assertions.assertThat(foundChar).isEqualTo("C");
    }

    @Test
    public void testFindNumberSeven() {
        String param = "11223344556678899";
        findingFirstNonRepeatedChar = new FindingFirstNonRepeatedChar(param);
        String foundChar = findingFirstNonRepeatedChar.find();
        Assertions.assertThat(foundChar).isEqualTo("7");
    }

    @Test
    public void testFindLetterXUsingV1() {
        String param = "AABBCCDDEEFFXZZ";
        findingFirstNonRepeatedChar = new FindingFirstNonRepeatedChar(param);
        String foundChar = findingFirstNonRepeatedChar.find();
        Assertions.assertThat(foundChar).isEqualTo("X");
    }

    @Test
    public void testFindingTheCharX() {
        String param = "AABBCCDDEEFFXZZ";
        findingFirstNonRepeatedChar = new FindingFirstNonRepeatedChar(param);
        String foundChar = findingFirstNonRepeatedChar.findNonRepeatedChar(param);
        Assertions.assertThat(foundChar).isEqualTo("X");
    }

    @Test
    public void testFindTheCharX() {
        String param = "AABBCCDDEEFFXZZ";
        findingFirstNonRepeatedChar = new FindingFirstNonRepeatedChar(param);
        String foundChar = findingFirstNonRepeatedChar.findTheChar(param);
        Assertions.assertThat(foundChar).isEqualTo("X");
    }
}