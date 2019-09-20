package com.company.observer;

public class CelsiusListener implements TemperatuurListener {
    private double celsius;

    @Override
    public void change(double temperature) {
        celsius = temperature - 273;
        System.out.println("Temperatuur = " +
                (temperature - 273) +
                " Graden Celsius");
    }

    public double getCelsius() {
        return celsius;
    }
}
