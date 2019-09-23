package com.company.factory3;

import java.lang.reflect.Constructor;

public interface Factuur {

    double getJaarPrijs();
    double getMaandPrijs();


    static Factuur createFactuur(Class<? extends Factuur> cls, int i, int j, String str) {
        Factuur factuur = null;
        try {
            Constructor<? extends Factuur> factuurConstructor = cls.getDeclaredConstructor(int.class, int.class, String.class);
            factuur = factuurConstructor.newInstance(i, j, str);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return factuur;
    }

    static Factuur createFactuur(Class<? extends Factuur> cls) {
        Factuur factuur = null;
        try {
            factuur = cls.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return factuur;
    }

    static Factuur printFactuur(Class<? extends Factuur> cls, Periodiciteit periodiciteit){
        Factuur factuur = null;
        try {
            factuur = cls.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        switch (periodiciteit) {
            case JAAR:
                System.out.println("Jaarabonnement prijs: " + factuur.getJaarPrijs());
                break;
            case MAAND:
                System.out.println("Maandabonnement prijs: " + factuur.getMaandPrijs());
                break;
        }
        return factuur;
    }


}
