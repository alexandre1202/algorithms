package br.com.aab.algorithms.hackerrank.jobsity;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Deque;
import java.util.List;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

public class DiskSpaceAnalysis {

    public static int segment(int x, List<Integer> space) {
        int[] result;
//        if (x == 1) {
//            result = convertListToArray(space);
//        } else {
//            int count = 0;
//            Deque<Integer> stack = new ArrayDeque<>(space);
//            List<Integer> segments = new ArrayList<>();
//            while (! stack.isEmpty() ) {  //TODO: não usar o count
////                int[] ints = stack.stream().mapToInt(s -> s.intValue()).limit(x).sorted().toArray();
//                if (v2 > v1) {
//
//                }
//                segments.add(ints[0]);
//                stack.remove();
//            }
//            result = convertListToArray(segments);
//        }

        // 2, 5, 4, 6, 8  - > 3
        //[2,5,4], [5,4,6], [4,6,8]
        //[2][4][4]



 //       return result[result.length - 1];
        return 0;
    }

// Draft version!!!
//    public static int segment(int x, List<Integer> space) {
//        int[] result;
//        if (x == 1) {
//            result = convertListToArray(space);
//        } else {
//            List<Integer> segments = new ArrayList<>();
//            for (int i = 0; i < space.size()-x; i++) {
//                int[] ints = new int[x];
//                for (int j = 0; j < x; j++) {
//                    ints[j] = space.get(j+i);
//                }
//                Arrays.sort(ints);
//                segments.add(ints[0]);
//            }
//            result = convertListToArray(segments);
//        }
//
//        return result[result.length - 1];
//    }

    private static int[] convertListToArray(List<Integer> space) {
        return space.stream().distinct().sorted()
                .collect(Collectors.toList()).stream().mapToInt(n -> n).toArray();
    }

    public static void main(String[] args) {
        List<Integer> space = Arrays.asList(2, 5, 4, 6, 8);
        int x = 3;
//        List<Integer> space = Arrays.asList(5, 1, 2, 3, 1, 2);
//        int x = 1;
        System.out.println("segment(x [" + x + "], space " + space +") = " + segment(x, space));
    }

//    public static void main(String[] args) {
//        //System.out.println(getMax(new int[]{8,2,1,1}, 2));
//        System.out.println(getMax(new int[]{2,5,4,6,8}, 3));
//    }

    //@BrunoTaboada version 1
//    private static Integer getMax(int[] input, int window){
//        int c = 0;
//        int p = 1;
//        int p1 = Integer.MAX_VALUE;
//
//        PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());
//        while (c < input.length) {
//            int val = input[c++];
//            if(val < p1){
//                p1 = val;
//            }
//            if(p == window){
//                queue.add(p1);
//                p=1;
//                p1=Integer.MAX_VALUE;
//                c--;
//                continue;
//            }
//            p++;
//        }
//
//        return queue.poll();
//    }
}
