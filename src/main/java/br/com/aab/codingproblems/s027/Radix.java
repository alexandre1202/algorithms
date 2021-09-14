package br.com.aab.codingproblems.s027;

import static java.lang.Integer.parseUnsignedInt;

public class Radix {

    public static void main(String[] args) {
        String nri = "255500";

        System.out.println("parseUnsignedInt(nri) = " + parseUnsignedInt(nri));
        System.out.println("parseUnsignedInt(nri, 11) = " + parseUnsignedInt(nri, 11));
        System.out.println("parseUnsignedInt(nri, 12) = " + parseUnsignedInt(nri, 12));
        System.out.println("parseUnsignedInt(nri, 13) = " + parseUnsignedInt(nri, 13));
        System.out.println("parseUnsignedInt(nri, 14) = " + parseUnsignedInt(nri, 14));
        System.out.println("parseUnsignedInt(nri, 15) = " + parseUnsignedInt(nri, 15));
    }
}
