package br.com.aab.codingproblems.s023;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class IdentingWordsTest {

    private IdentingWords identingWords;

    @Test
    public void testIdentingWeekdays() {
        final List<String> weekdayNames = Arrays.asList(
                "Sunday", "Monday", "Tuesday", "Wednesday",
                "Thursday", "Friday", "Saturday");

        final List<String> expected = Arrays.asList(
                "      Sunday", "      Monday", "       Tuesday", "         Wednesday",
                "        Thursday", "      Friday", "        Saturday");

        identingWords = new IdentingWords(weekdayNames);
        List<String> result = identingWords.getIdentedWordsBySize();
        Assertions.assertThat(result)
                .extracting(String::toString)
                .containsAnyElementsOf(expected)
        ;
    }
}