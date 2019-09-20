package com.company;

import javax.swing.*;

public class SwingAutoInvoer implements AutoInvoer {
    private String eigenaar;

    @Override
    public void leesEigenaar() {
        eigenaar = JOptionPane.showInputDialog(null, "Geef naam eigenaar");
    }

    @Override
    public String toonEigenaar() {
        return eigenaar;
    }
}
