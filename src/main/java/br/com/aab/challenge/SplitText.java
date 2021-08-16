package br.com.aab.challenge;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

import static java.util.Arrays.stream;
import static java.util.stream.Collectors.toList;

public class SplitText {
    public List<String> getSplitText(String text, int split) {
        int[] lineSizeCounter = new int[split];
        int lenText = text.length();
        int count = 0;
        while (count < lenText) {
            for (int arrayIndex = 0; arrayIndex < split; arrayIndex++) {
                lineSizeCounter[arrayIndex] += 1;
                if (++count == lenText) {
                    break;
                }
            }
        }
//        AtomicInteger arrayIndex = new AtomicInteger(0);
//        text.chars().forEach(c -> {
//            lineSizeCounter[arrayIndex.intValue()] += 1;
//
//        });

        AtomicInteger initialPos = new AtomicInteger(0);
        return stream(lineSizeCounter)
                   .mapToObj(l -> text.substring(initialPos.intValue(), l + initialPos.getAndAdd(l)))
                   .collect(toList());
    }


    public static void main(String[] args) {
        String word = "abcdefghijklmno";
        StringBuilder[] result = parts(word, 6);

        int bucketIndex = 0;
        int [] counters = new int[result.length];
        int idx = 0;
        int lineControl = 0;
        int lineSize = result[idx].length();
        for (int i = 0; i < word.length(); i++) {
            if (lineControl == lineSize) {
                System.out.println();
                lineSize = result[++idx].length();
                lineControl = 0;
            }
            if(bucketIndex == result.length){
                bucketIndex = 0;
            }
            System.out.print(result[bucketIndex].charAt(counters[bucketIndex]++));
            bucketIndex++;
            lineControl++;
        }
        System.out.println();
    }

    private static StringBuilder[] parts(String word, int split) {
        int bucketIndex = 0;
        StringBuilder[] bucket = new StringBuilder[split];
        for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);
            if(bucketIndex == bucket.length){
                bucketIndex = 0;
            }
            if(bucket[bucketIndex] == null){
                bucket[bucketIndex] = new StringBuilder();
            }
            bucket[bucketIndex].append(letter);
            bucketIndex++;
        }

        return bucket;
    }
}
