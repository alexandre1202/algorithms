package br.com.aab.tallerinterview.mariano;

import java.util.Arrays;

class MyNumber {
    Integer myNumber;
}
public class PrivimiveByValueExample {
    public static void main(String[] privitiveByValue) {
        int homerAge = 10;
        changeHomerAge(homerAge);
        System.out.println("homerAge = " + homerAge);

        Integer homer2Age = new Integer(20);
        changeHomerAge(homer2Age);
        System.out.println("homer2Age = " + homer2Age);

        MyNumber myNumber = new MyNumber();
        myNumber.myNumber = 50;
        changeHomerAge(myNumber);
        System.out.println("myNumber.myNumber = " + myNumber.myNumber);

        String myName = "Alex";
        changeMyName(myName);
        System.out.println("myName = " + myName);

        String name1 = "Alexandre";
        String name2 = "Alexandre";
        String name3 = name1;
        String name4 = new String("Alexandre");

        System.out.println("(name1 == name2) = " + (name1 == name2));
        System.out.println("(name1 == name3) = " + (name1 == name3));
        System.out.println("(name1 == name4) = " + (name1 == name4));
        System.out.println("(name1.equals(name4)) = " + (name1.equals(name4)));

        System.out.println("name1.hashCode() = " + name1.hashCode());
        System.out.println("name2.hashCode() = " + name2.hashCode());
        System.out.println("name3.hashCode() = " + name3.hashCode());
        System.out.println("name4.hashCode() = " + name4.hashCode());
    }

    private static void changeMyName(String myName) {
        myName = myName.concat("andre");
    }

    private static void changeHomerAge(MyNumber myNumber) {
        myNumber.myNumber = 999;
    }

    private static void changeHomerAge(int homerAge) {
        System.out.println("int");
        homerAge = 999;
    }

    private static void changeHomerAge(Integer homer2Age) {
        System.out.println("Integer");
        homer2Age = 999;
    }

}
