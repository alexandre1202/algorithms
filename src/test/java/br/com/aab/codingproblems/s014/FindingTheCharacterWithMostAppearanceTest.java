package br.com.aab.codingproblems.s014;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindingTheCharacterWithMostAppearanceTest {

    private FindingTheCharacterWithMostAppearance mostAppearance;

    @Before
    public void setUp() throws Exception {
        mostAppearance = new FindingTheCharacterWithMostAppearance();
    }

    @Test
    public void maxOccurenceCharacterV1() {
        Pair<Character, Integer> maxOccurenceCharacterV1 = mostAppearance
                                                                   .maxOccurenceCharacterV1("ALEXANDRE ANTONIO " +
                                                                                                    "BARBOSA");
        Assertions.assertThat(maxOccurenceCharacterV1.character).isEqualTo('A');
        Assertions.assertThat(maxOccurenceCharacterV1.occurrences).isEqualTo(5);
    }
}