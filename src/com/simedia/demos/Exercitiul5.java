package com.simedia.demos;

public class Exercitiul5 {

    public static void main(String[] args) {

        int numar = 323069;
        int ultimaCifra = numar%10;
        while (numar%10 % 3 ==0 && numar > 0) {
            System.out.print(ultimaCifra);
            numar /= 10;
        }
    }

}
