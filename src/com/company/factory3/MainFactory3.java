package com.company.factory3;

public class MainFactory3 {
    public static void main(String[] args) {
        FactuurController a = new AlgemeenDagbladController();
        a.printFactuur(Periodiciteit.MAAND);
        System.out.println("*************");
        Factuur.printFactuur(AlgemeenDagbladFactuur.class, Periodiciteit.MAAND);
        System.out.println("*************");
        Factuur.printFactuur(Trouw.class, Periodiciteit.JAAR);

        Factuur trouw = Factuur.createFactuur(Trouw.class, 1, 2, "hoi");

    }
}
