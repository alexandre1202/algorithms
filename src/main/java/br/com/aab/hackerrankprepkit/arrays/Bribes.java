package br.com.aab.hackerrankprepkit.arrays;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Bribes {

  public static void main(String[] args) {
    //int[] q = {2, 5, 1, 3, 4};
    //int[] q = {2, 1, 5, 3, 4};
    int[] q = {1, 2, 5, 3, 7, 8, 6, 4};
    System.out.print("minimumBribes() => " + Arrays.toString(q) + " is ");
    minimumBribes(q);
  }

  static void minimumBribes(int[] q) {
      int nBribes = 0;
      int[] queue = IntStream.range(1, q.length + 1).toArray();
      for (int i = 0; i < q.length; i++) {
          if (queue[i] != q[i]) {
              if (q[i] == queue[i + 1]) {
                  nBribes++;
                  swapPositions(queue, i, i + 1);
              } else if (q[i] == queue[i + 2]) {
                  nBribes += 2;
                  swapPositions(queue, i+ 1, i + 2);
                  swapPositions(queue, i, i + 1);
              } else {
                  System.out.println("Too chaotic");
                  return;
              }
          }
      }
      System.out.println(nBribes);
  }

  static int[] swapPositions(int[] q, int front, int back) {
      int aux = 0;
      aux = q[back];
      q[back] = q[front];
      q[front] = aux;
      return q;
  }

    static void minimumBribes2(int[] q) {
    int bribesCount = 0;
    for (int i = q.length-1; i >= 0; i--) {
      if (i + 1 != q[i]) {
        if (i + 1 == q[i-1]) {
          bribesCount++;
          swapPositions(q, i, i-1);
        } else if (i + 1 == q[i-2]) {
          bribesCount++;
          swapPositions(q, i, i-2);
        } else {
          System.out.println("Too chaotic");
          return;
        }
      }
    }
    System.out.println(bribesCount);
  }
}
