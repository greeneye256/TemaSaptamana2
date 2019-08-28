package com.simedia.demos;

public class Exercitiul1CuSwitch {

    public static void main(String[] args) {
        int numarulUnu = 15;
        int numarulDoi = 12;
        char operator = '|';
        switch (operator){
            case '+':
                System.out.println("Suma celor doua numere este " + (numarulUnu + numarulDoi) + ".");
                break;
            case '-':
                System.out.println("Diferenta dintre primul numar si cel de-al doilea este " + (numarulUnu - numarulDoi) + ".");
                break;
            case '*':
                System.out.println("Produsul celor doua numere este " + (numarulUnu * numarulDoi) + ".");
                break;
            case '/':
                if (numarulDoi != 0) {
                    System.out.println("Rezultatul impartirii primului numar la cel de-al doilea este " + (numarulUnu / numarulDoi) + ".");
                } else {
                    System.out.println("Nu este posibila impartirea la 0. Va rugam modificati cel de-al doilea numar sau operatorul.");
                }
                break;
            case '%':
                if (numarulDoi != 0){
                    System.out.println("Restul impartirii primului numar la cel de-al doilea este " + (numarulUnu % numarulDoi) + ".");}
                else {
                    System.out.println("Nu este posibila impartirea la 0. Va rugam modificati cel de-al doilea numar sau operatorul.");
                }
                break;
            case '&':
                System.out.println("Rezultatul compararii bitilor, care formeaza cele doua numere, cu operatorul \"&\" (bitwise operator) este " + (numarulUnu & numarulDoi) + ".");
                break;
            case '|':
                System.out.println("Rezultatul compararii bitilor, care formeaza cele doua numere, cu operatorul \"|\" (bitwise operator) este " + (numarulUnu | numarulDoi) + ".");
                break;
            default:
                System.out.println("Operatorul introdus este ori gresit ori nu acopera operatiile din acest program. Va rugam modificati operatorul in consecinta.");
                break;
        }
    }
}