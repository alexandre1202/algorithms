package br.com.aab.codingproblems.s014;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class FindingTheCharacterWithMostAppearance {

    //TODO : trocar o Pair<Character, Integer> por Map.Entry<Character, Integer>
    public Pair<Character, Integer> maxOccurenceCharacterV1(String words) {
        char[] charArray = words.toCharArray();
        Map<Character, Integer> mapCharOccurence = new HashMap<>();

        for (int i = 0; i < charArray.length; i++) {
            char currentChar = charArray[i];
            if (! Character.isWhitespace(currentChar)) {
                Integer charValueOcurrence = mapCharOccurence.get(currentChar);
                if (charValueOcurrence == null) {
                    mapCharOccurence.put(currentChar, 1);
                } else {
                    mapCharOccurence.put(currentChar, ++charValueOcurrence);
                }
            }
        }

        int maxCharOcurrenceValue = Collections.max(mapCharOccurence.values());
        char maxCharOccurenceKey = Character.MIN_VALUE;

        for (Map.Entry<Character, Integer> mapOcurrence : mapCharOccurence.entrySet()) {
            if (mapOcurrence.getValue() == maxCharOcurrenceValue) {
                maxCharOccurenceKey = mapOcurrence.getKey();
                break;
            }
        }

        return Pair.of(maxCharOccurenceKey, maxCharOcurrenceValue);
    }
}
