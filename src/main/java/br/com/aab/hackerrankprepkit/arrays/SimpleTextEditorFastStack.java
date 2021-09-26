package br.com.aab.hackerrankprepkit.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class SimpleTextEditorFastStack {
   public static void main(String[] args) throws IOException {
      BufferedReader inputStream = new BufferedReader(new InputStreamReader(System.in));
      int totalOperations = Integer.parseInt(inputStream.readLine().trim());
      final List<String> operations = new ArrayList<>();
      for (int countLine = 0; countLine < totalOperations; countLine++) {
         operations.add(inputStream.readLine());
      }

      final Deque<String> editor = new LinkedList<>();
      for (String operation : operations) {
         String[] splittedOperation = operation.split(" ");
         String data = "";
         int typeOper = Integer.parseInt(splittedOperation[0]);
         if (typeOper < 4) data = splittedOperation[1];

         switch (typeOper) {
            case 1:
               editor.push(editor.size() == 0 ? data : editor.peek() + data);
               break;
            case 2:
               int positionToDelete = editor.peek().length() - Integer.valueOf(data).intValue();
               editor.push(editor.peek().substring(0, positionToDelete));
               break;
            case 3:
               int positionToPrint = Integer.valueOf(data).intValue() - 1;
               System.out.println(editor.peek().toCharArray()[positionToPrint]);
               break;
            case 4:
               editor.pop();
               break;
         }
      }
   }
}
