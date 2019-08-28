package com.simedia.demos;

public class Exercitiul2 {

    public static void main(String[] args) {
        String string1 = "AAB";
        String string2 = "AAB";
        Utils metoda = new Utils();
        int valoareString1 = metoda.sumOfCharsInString(string1);
        int valoareString2 = metoda.sumOfCharsInString(string2);
        if (valoareString1 == valoareString2) {
            System.out.println(string1 + " are suma valorilor caracterelor in codul ASCII egala cu suma valorilor caracterelor in codul ASCII a " + string2 + ".");
        } else if (valoareString1 > valoareString2) {
            System.out.println(string1 + " are suma valorilor caracterelor in codul ASCII mai mare decat " + string2 + ".");
        } else {
            System.out.println(string2 + " are suma valorilor caracterelor in codul ASCII mai mare decat " + string1 + ".");
        }

    }
}

