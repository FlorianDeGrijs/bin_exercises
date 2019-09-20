package com.company.observer;

import java.util.ArrayList;
import java.util.List;

public class TemperatuurStation {
    private double temperatuur;
    private List<TemperatuurListener> listeners;

    public TemperatuurStation() {
        listeners = new ArrayList<>();
    }

    public void insert(TemperatuurListener temperatuurListener) {
        listeners.add(temperatuurListener);
    }

    public void remove(TemperatuurListener temperatuurListener) {
        listeners.remove(temperatuurListener);
    }

    public void change(double temperatuur) {
        this.temperatuur = temperatuur;
        for (TemperatuurListener listener : listeners) {
            listener.change(temperatuur);
        }
    }

    public double getTemperature() {
        return temperatuur;
    }

    public int getObserverSize() {
        return listeners.size();
    }
}
