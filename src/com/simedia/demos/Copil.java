package com.simedia.demos;

public class Copil {

    String name = "Georgica";
    byte age = 7;
    int nrJucarii = 15;

    void bunaZiua() {
        System.out.println("Buna ziua!");
    }

    void salut(String nume) {
        System.out.println("Salut, " + nume + "!");
    }

    void adaugaOJucarie() {
        nrJucarii++;
    }

}
