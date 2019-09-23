package com.company.factory2;

public class RechthoekSpel extends Spel {

    @Override
    public Figuur maakFiguur(int a, int b, int c) {
        return new Rechthoek(a,b+c);
    }
}
