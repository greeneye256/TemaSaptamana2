package com.simedia.demos;

public class Exercitiul1 {

    public static void main(String[] args) {

        // Se creeaza variabilele si se initializeaza

        int numarulUnu = 15;
        int numarulDoi = 1;
        char operator = '%';

        // Se verifica care este operatorul cu care se va face calculul

        if (operator == '+') {
            System.out.println("Suma celor doua numere este " + (numarulUnu + numarulDoi) + ".");
        }
        if (operator == '-') {
            System.out.println("Diferenta dintre primul numar si cel de-al doilea este " + (numarulUnu - numarulDoi) + ".");
        }
        if (operator == '*') {
            System.out.println("Produsul celor doua numere este " + (numarulUnu * numarulDoi) + ".");
        }
        if (operator == '/') {
            if (numarulDoi != 0) {
                System.out.println("Rezultatul impartirii primului numar la cel de-al doilea este " + (numarulUnu / numarulDoi) + ".");
            } else {
                System.out.println("Nu este posibila impartirea la 0. Va rugam modificati cel de-al doilea numar sau operatorul.");
            }

        }
        if (operator == '%') {
            if (numarulDoi != 0) {
                System.out.println("Restul impartirii primului numar la cel de-al doilea este " + (numarulUnu % numarulDoi) + ".");
            } else {
                System.out.println("Nu este posibila impartirea la 0. Va rugam modificati cel de-al doilea numar sau operatorul.");
            }
        }
        if (operator == '&') {
            System.out.println("Rezultatul compararii bitilor, care formeaza cele doua numere, cu operatorul \"&\" (bitwise operator) este " + (numarulUnu & numarulDoi) + ".");
        }
        if (operator == '|') {
            System.out.println("Rezultatul compararii bitilor, care formeaza cele doua numere, cu operatorul \"|\" (bitwise operator) este " + (numarulUnu | numarulDoi) + ".");
        }

        // Se acopera cazul in care operatorul este introdus gresit

        if (operator != '+' && operator != '-' && operator != '*' && operator != '/' && operator != '%' && operator != '&' && operator != '|') {
            System.out.println("Operatorul introdus este ori gresit ori nu acopera operatiile din acest program. Va rugam modificati operatorul in consecinta.");
        }
    }
}