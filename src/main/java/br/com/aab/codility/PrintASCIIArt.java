package br.com.aab.codility;

public class PrintASCIIArt {
    public static void main(String[] args) {
        new PrintASCIIArt().solution(4);
    }

    public void solution(int N) {
        String upperCaseChar = "L";

        for (int i = 1; i <= N; i++) {
            if (i != N) {
                System.out.println(upperCaseChar);
            } else {
                System.out.print(upperCaseChar);
            }
        }

        for (int i = 2; i <= N; i++) {
            System.out.print(upperCaseChar);
        }
    }
}
