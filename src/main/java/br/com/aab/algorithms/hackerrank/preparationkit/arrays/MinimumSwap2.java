package br.com.aab.algorithms.hackerrank.preparationkit.arrays;

import java.util.Arrays;
import java.util.Hashtable;

public class MinimumSwap2 {

    public static void main(String[] args) {
        //int[] arr = {1, 3, 5, 2, 4, 6, 7};
        int[] arr = {7, 1, 3, 2, 4, 5, 6}; //R: 5
        //int[] arr = {4, 3, 1, 2};          //R: 3
        //int[] arr = {2, 3, 4, 1, 5};         //R: 3
        System.out.println("arr[] = " + Arrays.toString(arr) + " - #swaps = " + minimumSwaps(arr));
    }

    static int minimumSwaps(int[] arr) {
        int nextIndex = 0;
        int aux = 0;
        int nSwaps = 0;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] != i + 1) {
                for(int j = i + 1; j < arr.length; j++) {
                    if(arr[j] == i + 1) {
                        nextIndex = j;
                        break;
                    }
                }
                aux = arr[i];
                arr[i] = arr[nextIndex];
                arr[nextIndex] = aux;
                nSwaps++;
            }
        }
        return nSwaps;
    }

    static int BOSTAminimumSwaps(int[] arr) {
        int[] arrBF = new int[arr.length];
        int[] arrFB = new int[arr.length];
        System.arraycopy(arr, 0, arrBF, 0, arr.length);
        System.arraycopy(arr, 0, arrFB, 0, arr.length);
        int minimumSwapsFrontToBack = minimumSwapsFrontToBack(arrFB);
        int minimumSwapsBackToFront = minimumSwapsBackToFront(arrBF);
        return minimumSwapsFrontToBack < minimumSwapsBackToFront ? minimumSwapsFrontToBack : minimumSwapsBackToFront;
    }

    private static int minimumSwapsFrontToBack(int[] arrFB) {
        int nSwaps = 0;
        for (int i = 0; i < arrFB.length; i++) {
            if (arrFB[i] != i+1) {
                if ((i+2) >= arrFB.length) {
                    nSwaps++;
                    swap(arrFB, i, i+1);
                } else {
                    if (arrFB[i] > arrFB[i+1] && arrFB[i] < arrFB[i+2]) {
                        nSwaps++;
                        swap(arrFB, i, i+1);
                    } else if (arrFB[i] > arrFB[i+1] && arrFB[i] > arrFB[i+2]) {
                        int nextDec = nextDec(arrFB, i+1);
                        nSwaps++;
                        if (nextDec > 0) {
                            swap(arrFB, i, nextDec);
                        } else {
                            swap(arrFB, i, i+1);
                        }
                    } else {
                        int nextDec = nextDec(arrFB, i);
                        nSwaps++;
                        if (nextDec == 0) {
                            swap(arrFB, 0, i);
                        } else if ((nextDec + 1) == arrFB.length) {
                            swap(arrFB, i, nextDec);
                        } else {
                            swap(arrFB, nextDec-1, nextDec);
                        }
                    }
                }
                i--;
            }
        }
        return nSwaps;
    }

    private static int nextDec(int[] arr, int i) {
        while (i++ < arr.length-1) {
            if (arr[i-1] > arr[i]) return i;
        }
        return 0;
    }

    private static int minimumSwapsBackToFront(int[] arrBF) {
        int nSwaps = 0;
        Hashtable<Integer, Integer> hashMapArr = getHashMap(arrBF);
        for (int count = arrBF.length; count > 0; count--) {
            if (arrBF[count-1] != count) {
                int nextPos = hashMapArr.get(count);
                swap(arrBF, count-1, nextPos);
                nSwaps++;
            }
        }
        return nSwaps;
    }

    static int[] swap(int[] arr, int front, int back) {
        int aux = arr[front];
        arr[front] = arr[back];
        arr[back] = aux;
        return arr;
    }

    private static Hashtable<Integer, Integer> getHashMap(int[] arr) {
        int size = arr.length;
        Hashtable<Integer, Integer> hashTableFromArr = new Hashtable<Integer, Integer>();
        for(int i = 0; i < size; i++) {
            hashTableFromArr.put(arr[i], i);
        }
        return hashTableFromArr;
    }
}

