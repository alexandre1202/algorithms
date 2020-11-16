package br.com.aab.codingproblems.s018;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AnagramsTest {

    private Anagrams anagrams;

    @Before
    public void setUp() throws Exception {
        anagrams = new Anagrams();
    }

    @Test
    public void isAnagram() {
        String word1 = "Madam";
        String word2 = "madam";

        boolean result = anagrams.isAnagram(word1, word2);
        assertThat(result).isEqualTo(Boolean.TRUE);
    }

    @Test
    public void isAnagramWithBlank() {
        String word1 = "";
        String word2 = "";

        boolean result = anagrams.isAnagram(word1, word2);
        assertThat(result).isEqualTo(Boolean.TRUE);
    }

    @Test
    public void isAnagramWithRoma() {
        String word1 = "roma";
        String word2 = "amor";

        boolean result = anagrams.isAnagram(word1, word2);
        assertThat(result).isEqualTo(Boolean.TRUE);
    }

}