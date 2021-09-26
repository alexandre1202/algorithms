package br.com.aab.hackerrankprepkit.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class SimpleTextEditorBTaboada {
   public static void main(String[] args) throws IOException {
      BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
      int t = Integer.parseInt(bufferedReader.readLine().trim());

      List<String> operations = new ArrayList<>();

      for (int i = 0; i < t; i++) {
         operations.add(bufferedReader.readLine());
      }

      Deque<String> results = new LinkedList<>();

      for (String op : operations) {
         String[] ops = op.split(" ");
         String s = "";
         int pos = 0;
         int end = 0;
         switch (ops[0]) {
            case "1":
               if (results.size() > 0)
                  s = results.peek();
               s = s + ops[1];
               results.push(s);
               break;
            case "2":
               s = results.peek();
               pos = Integer.parseInt(ops[1]);
               end = s.length();
               s = s.substring(0, end - pos);
               results.push(s);
               break;
            case "3":
               s = results.peek();
               pos = Integer.parseInt(ops[1]);
               System.out.println(s.charAt(pos - 1));
               break;
            case "4":
               results.pop();
               break;
            default:
               break;
         }
      }
   }
}
