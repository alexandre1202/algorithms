package br.com.aab.codility.timecomplexity;

public class PermMissingElem {
  private int solution(int[] A) {
    int n = A.length;
    if (n++ == 0) return 1;
    int pa = n * (n + 1) / 2;
    int sumArray = 0;
    for (int i = 0; i < A.length; i++) {
      sumArray += A[i];
    }
    if (pa == sumArray) return n;
    return pa - sumArray;
  }
  public static void main(String[] args) {
//    int[] A = {1, 2, 3, 4, 6, 7, 8, 9, 10};
    int[] A = {2, 3, 1, 5};
    System.out.println(new PermMissingElem().solution(A));
  }

}
