package com.simedia.demos;

public class Exercitiul4 {

    public static void main(String[] args) {
        int numar = 14;
        int adaos = 53;
        int count = 0;
        while (numar % 13 != 0) {
            numar += adaos;
            count++;
        }
        System.out.println("Adaosul(" + adaos + ") a trebuit adaugat de " + count + " ori, pentru a se ajunge la numarul " + numar + ", care este divizibil cu 13.");
    }

}
