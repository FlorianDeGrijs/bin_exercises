package com.company.observer;

public class FahrenheidListener implements TemperatuurListener {

    private double fahrenheit;

    @Override
    public void change(double temperature) {
        fahrenheit = temperature * 9.0/5-460;
        System.out.println("Temperatuur = "+
                (temperature * 9.0/5-460) +
                " Graden Fahrenheit");

    }

    public double getFahrenheit() {
        return fahrenheit;
    }
}
