package br.com.aab.algorithms;

public class BubbleSort {
    public int[] sortExec(int[] num) {
        if (num == null) return null;

        if ( num.length < 2 ) return num;

        for (int lastUnsortedIndex = num.length-1;
             lastUnsortedIndex > 0; lastUnsortedIndex--) {
            for (int j = 0; j < lastUnsortedIndex; j++) {
                if (num[j] > num[j+1]) {
                    swapNumbers(num, j, j+1);
                }
            }
        }
        return num;
    }

    private void swapNumbers(int[] array, Integer x, Integer y) {
        Integer temp = array[x];
        array[x] = array[y];
        array[y] = temp;
    }
}
