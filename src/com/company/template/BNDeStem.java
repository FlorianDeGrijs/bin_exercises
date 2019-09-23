package com.company.template;

public class BNDeStem extends Krant{
    private int advertentienummer;

    @Override
    protected boolean isKlant() {
        return true;
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

    public static int showAdvertentienummer() {
        return 15;
    }
}
