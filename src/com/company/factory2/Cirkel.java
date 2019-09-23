package com.company.factory2;

public class Cirkel implements Figuur {
    private int x;
    private int y;
    private int straal;

    public Cirkel(int x, int y, int straal) {
        this.x = x;
        this.y = y;
        this.straal = straal;
    }

    @Override
    public int opp() {
        return x*y*straal;
    }
}
