package com.company.factory2;

public class MainFactory2 {
    public static void main(String[] args) {
        Spel s1 = new CirkelSpel();
        Spel s2 = new RechthoekSpel();
        s1.speel();
        System.out.println("********");
        s2.speel();
    }
}
