package br.com.aab.algorithms;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.stream.Collectors;

public class LRU {
    public List<Integer> getCachedValues(int[] pages, int capacity) {
        final Queue<Integer> cache = new LinkedList<>();
        for (int i = 0; i < pages.length; i++) {
            final int entry = pages[i];
            if (cache.size() < capacity) {
                cache.add(entry);
            } else {
                if (cache.contains(entry)) {
                    cache.remove(entry);
                } else {
                    cache.poll();
                }
                cache.add(entry);
            }
        }
        return cache.stream().collect(Collectors.toList());
    }
}
