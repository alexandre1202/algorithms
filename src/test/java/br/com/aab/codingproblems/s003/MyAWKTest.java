package br.com.aab.codingproblems.s003;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class MyAWKTest {

    private MyAWK myAWK;
    private String pattern;
    private String toSearch;

    @Before
    public void init() {
        myAWK = new MyAWK(this.pattern, this.toSearch);
    }

    @Test
    public void testFindPattern() {
        myAWK.findPattern();
    }
}