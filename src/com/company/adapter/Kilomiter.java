package com.company.adapter;

public class Kilomiter implements Target {
    @Override
    public void speed(double km) {
        System.out.printf("Driving: %.4f KM ", km);
    }
}
