package com.company.observer;

public class CelsiusListener2 extends AbstractTemperatureListener {

    public CelsiusListener2(TemperatuurStation temperatuurStation) {
        super(temperatuurStation);
    }

    @Override
    protected String displayTemperature() {
        return String.format(("Temperatuur = "+
                (getTemperatuurStation().getTemperature() - 273) +
                " Graden Celsius"));

    }
}
