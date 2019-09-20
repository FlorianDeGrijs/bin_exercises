package com.company.observer;

public abstract class AbstractTemperatureListener implements TemperatuurListener {

    private TemperatuurStation temperatuurStation;

    public AbstractTemperatureListener(TemperatuurStation temperatuurStation) {
        this.temperatuurStation = temperatuurStation;
    }

    public void change() {
        System.out.printf("Temperature = %s%n", displayTemperature());
    }

    protected abstract String displayTemperature();

    public TemperatuurStation getTemperatuurStation() {
        return temperatuurStation;
    }
}
