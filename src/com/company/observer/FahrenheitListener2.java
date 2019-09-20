package com.company.observer;

public class FahrenheitListener2 extends AbstractTemperatureListener {

    public FahrenheitListener2(TemperatuurStation temperatuurStation) {
        super(temperatuurStation);
    }

    @Override
    protected String displayTemperature() {
        return String.format(("Temperatuur = "+
                (getTemperatuurStation().getTemperature() * 9.0/5-460) +
                " Fahrenheit"));
    }
}
