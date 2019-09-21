package com.company.adapter;

public class Adapter implements Target {

    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void speed(double km) {
        adaptee.specificSpeedRequest(km);
    }
}
