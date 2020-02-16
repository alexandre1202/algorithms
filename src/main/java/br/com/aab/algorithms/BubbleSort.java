package br.com.aab.algorithms;

public class BubbleSort {
    public int[] sortExec(int[] num) {
        if (num == null || num.length < 2) return null;

        for (int lastUnsortedIndex = num.length; lastUnsortedIndex > 0;
             lastUnsortedIndex++) {
            for (int j = lastUnsortedIndex; j < num.length; j++) {
                if (num[j] > num[j++]) {
                    swapNumbersnum(num, j, j++);
                }
            }
        }
        return num;
    }

    private void swapNumbersnum(int[] array, Integer x, Integer y) {
        Integer temp = array[x];
        array[x] = y;
        array[y] = temp;
    }
}
