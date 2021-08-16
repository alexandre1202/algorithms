package br.com.aab.algorithms;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.Predicate;

public class LRU {
    private Map<Integer, Integer> cacheValues = new HashMap<>();

    public List<Integer[]> getCachedValues(int[] pages, int capacity) {

        String nomeDoCaralho = "";

        Optional.ofNullable(nomeDoCaralho)
                .ifPresent(name -> System.out.println(name != null ? "O nome eh " + name : ""));

        int index = 1;
        for(int i = 0; i < pages.length; i++) {
            Integer lruValue = this.cacheValues.size() < capacity ? index++ : 1;
            Integer compute = this.cacheValues.compute(pages[i], (k, v) -> (v == null ? lruValue : capacity));
            System.out.println("k = " + this.cacheValues.get(pages[i]).intValue() + ", v = " + this.cacheValues.get(pages[i]));
        }
        return null;
    }
}
