package br.com.aab.codingproblems.s004;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class SearchingForDigitsTest {

    private SearchingForDigits searchingForDigits;
    private String params = "dsflkhasflkjh149782314987131342987asdifhsalkjfh1239y";

    @Before
    public void init() {
        searchingForDigits = new SearchingForDigits(params);
    }

    @Test
    public void testHasDigitV1() {
        Assertions.assertThat(searchingForDigits.hasDigitV1()).isEqualTo(Boolean.TRUE);
    }
}