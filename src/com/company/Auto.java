package com.company;

public class Auto {

    private AutoInvoer autoInvoer;

    public Auto(AutoInvoer autoInvoer) {
        this.autoInvoer = autoInvoer;
    }

    public String eigenaar() {
        return autoInvoer.toonEigenaar();
    }

    public void reserveer() {
        autoInvoer.leesEigenaar();
    }
}
