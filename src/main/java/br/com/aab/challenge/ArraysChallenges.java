package br.com.aab.challenge;

import java.util.Objects;

public class ArraysChallenges {

    public int[] incNumberToArray(int[] array, int numberTodAdd) {
        if (Objects.isNull(array)) return null;

        if (array.length == 1) return array;

        int arrayInNumber = 0;
        int multiplierForNumber = (int) Math.pow(10, array.length -1);
        int multiplierForNumberInitial = multiplierForNumber;
        int arrayLength = array.length;

        for (int i = 0; i < arrayLength; i++) {
            arrayInNumber += array[i] * multiplierForNumber;
            multiplierForNumber /= 10;
        }

        arrayInNumber += numberTodAdd;
        int multiplierForArray = ((int) (Math.log10(arrayInNumber) + 1));

        multiplierForArray = (int) Math.pow(10, multiplierForArray-1);
        if (multiplierForArray > multiplierForNumberInitial) {
            arrayLength++;
        }

        array = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            if (multiplierForArray == 0) break;
            array[i] = arrayInNumber / multiplierForArray;
            arrayInNumber -= (array[i] * multiplierForArray);
            multiplierForArray /= 10;
        }
        return array;
    }
}
