package com.company.factory3;

abstract class FactuurController {

    public abstract Factuur maakFactuur();

    public void printFactuur(Periodiciteit periodiciteit) {
        Factuur factuur = maakFactuur();
        switch (periodiciteit) {
            case JAAR:
                System.out.println("Jaarabonnement prijs: " + factuur.getJaarPrijs());
                break;
            case MAAND:
                System.out.println("Maandabonnement prijs: " + factuur.getMaandPrijs());
                break;
        }
    }

}
