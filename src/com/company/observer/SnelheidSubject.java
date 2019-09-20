package com.company.observer;

import java.util.ArrayList;
import java.util.List;

public class SnelheidSubject {
    private int snelheid;
    private List<SnelheidListener> listeners;

    public SnelheidSubject() {
        listeners = new ArrayList<>();
    }

    public void insert(SnelheidListener snelheidListener) {
        listeners.add(snelheidListener);
    }

    public void remove(SnelheidListener snelheidListener) {
        listeners.remove(snelheidListener);
    }

    public void veranderSnelheid(int snelheid) {
        this.snelheid = snelheid;
        for (SnelheidListener listener : listeners) {
            listener.change(snelheid);
        }
    }
}
