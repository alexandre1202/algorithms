package br.com.aab.codingproblems.s010;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

import static java.util.Arrays.asList;

public class PermutationTest {

    private Permutation permutation;
    private Long begin = 0L;

    @Before
    public void setUp() throws Exception {
        permutation = new Permutation();
    }

    @Test
    public void testPermuteALE() {
        String wordToBePermuted = "ALE";
        Set<String> expected = new HashSet<>(asList("ALE", "AEL", "LAE", "LEA", "EAL", "ELA"));
        begin = System.currentTimeMillis();
        Set<String> result = permutation.permute(wordToBePermuted);
        System.out.println("\nElapse Time Foreach ALE [" + (System.currentTimeMillis() - begin + "]"));
        Assertions.assertThat(result).extracting(String::toString).containsAnyElementsOf(expected);
    }

    @Test
    public void testPermuteWithStreamALE() {
        String wordToBePermuted = "ALE";
        Set<String> expected = new HashSet<>(asList("ALE", "AEL", "LAE", "LEA", "EAL", "ELA"));
        begin = System.currentTimeMillis();
        Stream<String> result = permutation.permuteAndReturnStream(wordToBePermuted);
        System.out.println("\nElapse Time Stream ALE [" + (System.currentTimeMillis() - begin + "]"));
        Assertions.assertThat(result).extracting(String::toString).containsAnyElementsOf(expected);
    }

    @Test
    public void testPermuteGABY() {
        String wordToBePermuted = "GABY";
        Set<String> expected = new HashSet<>(asList("GAYB", "GBYA", "BYAG", "BGAY", "AYBG", "AGBY", "YGBA",
                "YABG", "YGAB", "YBAG", "YAGB", "YBGA", "ABGY", "AYGB", "BYGA", "BAGY", "GABY", "GYBA", "ABYG",
                "AGYB", "GBAY", "GYAB", "BGYA", "BAYG"));
        begin = System.currentTimeMillis();
        Set<String> result = permutation.permute(wordToBePermuted);
        System.out.println("\nElapse Time Foreach GABY [" + (System.currentTimeMillis() - begin + "]"));
        Assertions.assertThat(result).isEqualTo(expected);
    }

    @Test
    public void testPermuteWithStreamGABY() {
        String wordToBePermuted = "GABY";
        Set<String> expected = new HashSet<>(asList("GAYB", "GBYA", "BYAG", "BGAY", "AYBG", "AGBY", "YGBA",
                "YABG", "YGAB", "YBAG", "YAGB", "YBGA", "ABGY", "AYGB", "BYGA", "BAGY", "GABY", "GYBA", "ABYG",
                "AGYB", "GBAY", "GYAB", "BGYA", "BAYG"));
        begin = System.currentTimeMillis();
        Stream<String> result = permutation.permuteAndReturnStream(wordToBePermuted);
        System.out.println("\nElapse Time Stream GABY [" + (System.currentTimeMillis() - begin + "]"));
        Assertions.assertThat(result).extracting(String::toString).containsAnyElementsOf(expected);
    }

    @Test
    public void testPermuteALEXANDRE() {
        String wordToBePermuted = "ALEXANDRE";
        begin = System.currentTimeMillis();
        Set<String> result = permutation.permute(wordToBePermuted);
        System.out.println("\nElapse Time Foreach ALEXANDRE [" + (System.currentTimeMillis() - begin + "]"));
    }

    @Test
    public void testPermuteWithStreamALEXANDRE() {
        String wordToBePermuted = "ALEXANDRE";
        begin = System.currentTimeMillis();
        permutation.permuteAndReturnStream(wordToBePermuted);
        System.out.println("\nElapse Time Stream ALEXANDRE [" + (System.currentTimeMillis() - begin + "]"));
    }
//    @Test
//    public void testPermuteAndPrint() {
//        String wordToBePermuted = "ALE";
//        permutation.permuteAndPrint(wordToBePermuted);
//    }
}