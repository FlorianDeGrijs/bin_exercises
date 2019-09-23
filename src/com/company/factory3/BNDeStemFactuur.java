package com.company.factory3;

public class BNDeStemFactuur implements Factuur {
    @Override
    public double getJaarPrijs() {
        return 300;
    }

    @Override
    public double getMaandPrijs() {
        return 30;
    }
}
