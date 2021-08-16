package br.com.aab.challenge;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class SplitTextTest {

    private SplitText fixture = new SplitText();

    @Test
    public void testSplitText15AndSplit2() {
        List<String> result = fixture.getSplitText("abcdefghijklmno", 2);
        List<String> expected = Arrays.asList("abcdefgh","ijklmno");
        assertThat(result).extracting(String::toString).containsAnyElementsOf(expected);
    }

    @Test
    public void testSplitText15AndSplit3() {
        List<String> result = fixture.getSplitText("abcdefghijklmno", 3);
        List<String> expected = Arrays.asList("abcde","fghij", "klmno");
        assertThat(result).extracting(String::toString).containsAnyElementsOf(expected);
    }

    @Test
    public void testSplitText15AndSplit4() {
        List<String> result = fixture.getSplitText("abcdefghijklmno", 4);
        List<String> expected = Arrays.asList("abcd","efgh", "ijkl", "mno");
        assertThat(result).extracting(String::toString).containsAnyElementsOf(expected);
    }

    @Test
    public void testSplitText15AndSplit5() {
        List<String> result = fixture.getSplitText("abcdefghijklmno", 5);
        List<String> expected = Arrays.asList("abc","def", "ghi", "jkl", "mno");
        assertThat(result).extracting(String::toString).containsAnyElementsOf(expected);
    }

    @Test
    public void testSplitText15AndSplit6() {
        List<String> result = fixture.getSplitText("abcdefghijklmno", 6);
        List<String> expected = Arrays.asList("abc","def", "ghi", "jk", "lm", "no");
        assertThat(result).extracting(String::toString).containsAnyElementsOf(expected);
    }

    @Test
    public void testSplitText15AndSplit7() {
        List<String> result = fixture.getSplitText("abcdefghijklmno", 7);
        List<String> expected = Arrays.asList("abc","de", "fg", "hi", "jk", "lm", "no");
        assertThat(result).extracting(String::toString).containsAnyElementsOf(expected);
    }

    @Test
    public void testSplitText15AndSplit8() {
        List<String> result = fixture.getSplitText("abcdefghijklmno", 8);
        List<String> expected = Arrays.asList("ab","cd", "ef", "gh", "ij", "kl", "mn", "o");
        assertThat(result).extracting(String::toString).containsAnyElementsOf(expected);
    }

    @Test
    public void testSplitText15AndSplit9() {
        List<String> result = fixture.getSplitText("abcdefghijklmno", 9);
        List<String> expected = Arrays.asList("ab","cd", "ef", "gh", "ij", "kl", "m", "n", "o");
        assertThat(result).extracting(String::toString).containsAnyElementsOf(expected);
    }

}