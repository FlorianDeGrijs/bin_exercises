package com.company.factory2;

public class CirkelSpel extends Spel {

    @Override
    public Figuur maakFiguur(int a, int b, int c) {
        return new Cirkel(a,b,c);
    }
}
