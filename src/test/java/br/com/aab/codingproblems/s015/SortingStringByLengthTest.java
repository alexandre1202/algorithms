package br.com.aab.codingproblems.s015;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SortingStringByLengthTest {

    private SortingStringByLength sortingStringByLength;

    @Before
    public void setUp() throws Exception {
        sortingStringByLength = new SortingStringByLength();
    }

    @Test
    public void arrayStringSortedByLengthUsingAscendingOrder() {
        String[] words = {"antonio", "biden", "alexandre", "gabriela", "barbosa", "joe"};
        String[] expected = {"joe", "biden", "antonio", "barbosa", "gabriela", "alexandre"};
        String[] actual = sortingStringByLength.arrayStringSortedByLength(words, SortingStringByLength.Sort.ASC);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void arrayStringSortedByLengthUsingDescendingOrder() {
        String[] words = {"antonio", "biden", "alexandre", "gabriela", "barbosa", "joe"};
        String[] expected = {"alexandre", "gabriela", "antonio", "barbosa", "biden", "joe"};
        String[] actual = sortingStringByLength.arrayStringSortedByLength(words, SortingStringByLength.Sort.DESC);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void arrayStringSortedByLengthUsingComparatorAscendingOrder() {
        String[] words = {"antonio", "biden", "alexandre", "gabriela", "barbosa", "joe"};
        String[] expected = {"joe", "biden", "antonio", "barbosa", "gabriela", "alexandre"};
        String[] actual = sortingStringByLength.arrayStringSortedByLengthUsingComparator(words, SortingStringByLength.Sort.ASC);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void arrayStringSortedByLengthUsingComparatorDescendingOrder() {
        String[] words = {"antonio", "biden", "alexandre", "gabriela", "barbosa", "joe"};
        String[] expected = {"alexandre", "gabriela", "antonio", "barbosa", "biden", "joe"};
        String[] actual = sortingStringByLength.arrayStringSortedByLengthUsingComparator(words, SortingStringByLength.Sort.DESC);
        assertThat(actual).isEqualTo(expected);
    }

}