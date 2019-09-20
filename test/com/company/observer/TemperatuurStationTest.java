package com.company.observer;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TemperatuurStationTest {

    private TemperatuurStation temperatuurStation;

    @Before
    public void setup() {
        temperatuurStation = new TemperatuurStation();
    }

    @Test
    public void change() {
        FahrenheidListener listener1 = new FahrenheidListener();
        CelsiusListener listener2 = new CelsiusListener();
        temperatuurStation.insert(listener1);
        temperatuurStation.insert(listener2);
        temperatuurStation.change(5);
        System.out.println(listener1.getFahrenheit());
        System.out.println(listener2.getCelsius());
        assertFalse(listener1.getFahrenheit() == listener2.getCelsius());
    }

    @Test
    public void insertsAllObservers() {
        TemperatuurListener f1 = new FahrenheidListener();
        TemperatuurListener c2 = new CelsiusListener();
        temperatuurStation.insert(f1);
        temperatuurStation.insert(c2);
        assertEquals(2, temperatuurStation.getObserverSize());
    }
}