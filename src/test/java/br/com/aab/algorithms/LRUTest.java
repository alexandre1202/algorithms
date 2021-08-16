package br.com.aab.algorithms;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.List;

public class LRUTest {

    private LRU lru = new LRU();

    @Test
    public void testThirteenNumbersWithCapacityFour() {
        final int[] pages = new int[] {7,0,1,2,0,3,0,4,2,3,0,3,2};
        final int capacity = 4;
        List<Integer[]> cachedValues = lru.getCachedValues(pages, capacity);
        Assertions.assertThat(cachedValues.get(0)).contains(new Integer[] {7,0,1,2});
        Assertions.assertThat(cachedValues.get(1)).contains(new Integer[] {3,0,1,2});
        Assertions.assertThat(cachedValues.get(2)).contains(new Integer[] {3,0,1,2});
        Assertions.assertThat(cachedValues.get(3)).contains(new Integer[] {3,0,4,2});
        Assertions.assertThat(cachedValues.get(4)).contains(new Integer[] {3,0,4,2});
    }
}