package com.company.observer;

public class TemperatureMain {
    public static void main(String[] args) {
        TemperatuurStation temperatuurStation = new TemperatuurStation();
        temperatuurStation.insert(new CelsiusListener());
        temperatuurStation.insert(new FahrenheidListener());

        temperatuurStation.change(293);
        temperatuurStation.change(312);
    }
}
