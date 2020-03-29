package br.com.aab.challenge;

public class Asterisks {

    public static void main(String... args) {
        new Asterisks().execute(10);
    }

    private static void execute(int number) {
        if (number < 3) return;

        String traco = "\n" + new String(new char[number]).replace("\0", "==") + "\n";

        pontaCabeca(number);System.out.println(traco);
        trianguloRetangulo(number);System.out.println(traco);
        pontaCabecaRetanguloDireito(number);System.out.println(traco);
        pontaCabecaRetanguloEsquerdo(number);System.out.println(traco);
    }

    private static void pontaCabecaRetanguloEsquerdo(int number) {


    }

    private static void pontaCabecaRetanguloDireito(int number) {
        int x = 0;
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                if (x <= j) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            x++;
            System.out.println(" ");
        }
    }

    private static void pontaCabeca(int number) {
        int left = 0;
        for (int i = 0; i < number; i++) {
            for (int j = i; j <= number; j++) {
                if ( left <= j ) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("  ");
            left += 2;
        }
    }

    private static void trianguloRetangulo(int number) {
        for (int i = 0; i < number; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}
