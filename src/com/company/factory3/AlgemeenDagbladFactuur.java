package com.company.factory3;

public class AlgemeenDagbladFactuur implements Factuur {
    @Override
    public double getJaarPrijs() {
        return 250;
    }

    @Override
    public double getMaandPrijs() {
        return 25;
    }
}
