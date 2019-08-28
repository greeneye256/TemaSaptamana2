package com.simedia.demos;

public class Exercitiul7 {

    public static void main(String[] args) {
        Copil geo = new Copil();
        geo.bunaZiua();
        geo.salut("Geo");
        System.out.println(geo.age);
        System.out.println(geo.nrJucarii);
        geo.adaugaOJucarie();
        System.out.println(geo.nrJucarii);
        geo.adaugaOJucarie();
        System.out.println(geo.nrJucarii);
    }

}
