package br.com.aab.random;

import java.util.Arrays;
import java.util.Random;

public class MyRandomNumbers {
  public static void main(String[] args) {

    int limit = 15;
    // System.out.println(syncronizedRandomNumber(limit));
    System.out.println("getRandomNumber " + getRandomNumber());
  }

  static int syncronizedRandomNumber(int limit) {
    return limit > 0 ? (int) (Math.random() * limit) : 0;
  }

  static int getRandomNumber() {
    Random random = new Random();
    return random.ints(1, Integer.MAX_VALUE).findFirst().getAsInt();
  }
}
