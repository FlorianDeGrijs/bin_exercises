package com.company.template;

abstract class Krant {

    private boolean isKlant;

    public void voegToe(String str) {
        isKlant = this.isKlant();
        System.out.println("Is een klant: " + isKlant);
        double price = this.berekenPrijs(str);
        System.out.println("Uw prijs is: " + price);
        if (this instanceof BNDeStem) {
            System.out.println("Advertentie nummer: " + BNDeStem.showAdvertentienummer());
        }
    }

    protected abstract boolean isKlant();

    protected abstract double berekenPrijs(String str);

}
