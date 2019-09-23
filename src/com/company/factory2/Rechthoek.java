package com.company.factory2;

public class Rechthoek implements Figuur {
    private int breedte;
    private int hoogte;

    public Rechthoek(int breedte, int hoogte) {
        this.breedte = breedte;
        this.hoogte = hoogte;
    }

    @Override
    public int opp() {
        return breedte+hoogte;
    }
}
