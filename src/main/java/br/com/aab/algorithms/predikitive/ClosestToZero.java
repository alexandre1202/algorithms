package br.com.aab.algorithms.predikitive;

public class ClosestToZero {
    public static int computeClosestToZero(int[] ts) {

        return 0;


//        int closestIndex = 0;
//        int delta = Integer.MAX_VALUE;
//        if (ts.length == 0) return 0;
//        for (int i = 0; i < ts.length; ++i) {
//            int elementAbsolut = Math.abs(ts[i]);
//            if (elementAbsolut < delta) {
//                delta = elementAbsolut;
//                closestIndex = i;
//            } else if (elementAbsolut == delta && ts[i] > 0 && ts[closestIndex] < 0) {
//                closestIndex = i;
//            }
//        }
//        return ts[closestIndex];
    }

    public static void main(String[] args) {
        int[] input = {2, 4, 1, 5, 6, 7, -1 };
        System.out.println("result = 1 => " + computeClosestToZero(input));;
        input = new int[]{4,5,6,7,};
        System.out.println("result = 4 => " + computeClosestToZero(input));;
        input = new int[]{1};
        System.out.println("result = 1 => " + computeClosestToZero(input));;
        input = new int[]{22};
        System.out.println("result = 22 => " + computeClosestToZero(input));;
        input = new int[0];
        System.out.println("result = 0 => " + computeClosestToZero(input));;
        input = new int[] {-3, -5, 20, 5};
        System.out.println("result = -3 => " + computeClosestToZero(input));;

    }
}
