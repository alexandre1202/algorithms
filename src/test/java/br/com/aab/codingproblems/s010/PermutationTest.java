package br.com.aab.codingproblems.s010;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static java.util.Arrays.asList;

public class PermutationTest {

    private Permutation permutation;

    @Before
    public void setUp() throws Exception {
        permutation = new Permutation();
    }

    @Test
    public void testPermute() {
        String wordToBePermuted = "GABY";
        Set<String> expected = new HashSet<>(asList("GAYB", "GBYA", "BYAG", "BGAY", "AYBG", "AGBY", "YGBA",
                "YABG", "YGAB", "YBAG", "YAGB", "YBGA", "ABGY", "AYGB", "BYGA", "BAGY", "GABY", "GYBA", "ABYG",
                "AGYB", "GBAY", "GYAB", "BGYA", "BAYG"));
        Set<String> result = permutation.permute(wordToBePermuted);
        Assertions.assertThat(result).isEqualTo(expected);
    }

    @Test
    public void testPermuteAndPrint() {
        String wordToBePermuted = "ALE";
        permutation.permuteAndPrint(wordToBePermuted);
    }
}