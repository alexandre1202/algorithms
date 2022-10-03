package br.com.aab.algorithms;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.stream.Collectors;

public class LeastRecentUsedCache {

    public List<Integer> searchAndCache(int[] numbers, final int CAPACITY) {
        final Queue<Integer> cache = new LinkedList<>();
        for (int i = 0; i < numbers.length; i++) {
            final int entry = numbers[i];
            if (cache.size() < CAPACITY) {
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

    public static void main(String[] args) {
        final int[] pages = new int[] {7,0,1,2,0,3,0,4,2,3,0,3,2};
        final int capacity = 4;
        LeastRecentUsedCache lru = new LeastRecentUsedCache();
        List<Integer> cachedValues = lru.searchAndCache(pages, capacity);
        System.out.println("cachedValues should be 4,0,3,2 = " + cachedValues);
        //List<Integer> expected = Arrays.asList(4,0,3,2);

    }
}
