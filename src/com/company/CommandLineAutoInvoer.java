package com.company;

import java.util.Scanner;

public class CommandLineAutoInvoer implements AutoInvoer {
    private String eigenaar;

    @Override
    public void leesEigenaar() {
        System.out.print("Voer naam in: ");
        Scanner input = new Scanner(System.in);
        eigenaar = input.nextLine();
    }

    @Override
    public String toonEigenaar() {
        return eigenaar;
    }
}
