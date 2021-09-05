package br.com.aab.interviewquestions;

public class NumberInverter {
   public static int numberInverter(final int param) {
      int input = param < 0 ? param * -1 : param;
      int modValue, result = 0;

      do {
         modValue = input % 10;
         result = result * 10 + modValue;
         input /= 10;
      } while (input > 0);
      return param < 0 ? result * -1 : result;
   }
}
