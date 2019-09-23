package com.company.factory3;

public class Trouw implements Factuur {

    public Trouw(int i, int j, String str) {
    }

    public Trouw() {
    }

    @Override
    public double getJaarPrijs() {
        return 500;
    }

    @Override
    public double getMaandPrijs() {
        return 50;
    }
}
