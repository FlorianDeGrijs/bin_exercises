package com.company.template;

public class Trouw extends Krant{
    @Override
    protected boolean isKlant() {
        return false;
    }

    @Override
    protected double berekenPrijs(String str) {
        double prijs;
        String[] words = str.split(" ");
        int wordsUsed = words.length;
        if (isKlant()) {
            prijs = (wordsUsed * 0.25) * 0.6;
        } else {
            prijs = wordsUsed * 0.25;
        }
        return prijs;
    }
}
