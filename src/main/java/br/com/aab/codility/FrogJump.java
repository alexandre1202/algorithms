package br.com.aab.codility;

public class FrogJump {

  public static void main (String... args) {
    System.out.println("10, 85, 30 = " + new FrogJump().solution(10, 85, 30));
    System.out.println("10, 1000000000, 30 = " + new FrogJump().solution(10, 85, 30));
  }

  public int solution(int X, int Y, int D) {
    int result = (Y - X) / D;
    return ((Y - X) % D)  == 0 ? result : result + 1;
  }
}
