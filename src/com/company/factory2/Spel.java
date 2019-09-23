package com.company.factory2;

abstract class Spel {

    public abstract Figuur maakFiguur(int a, int b, int c);

    public void speel() {
            Figuur f = maakFiguur((int)(Math.random()*10+1), (int)(Math.random()*10+1), (int)(Math.random()*10+1));
            System.out.println(f.opp());
    }
}
