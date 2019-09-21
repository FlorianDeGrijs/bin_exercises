package com.company.adapter;

public class Adaptee {

    public void specificSpeedRequest(double km) {
        double mph = km/1.609;
        System.out.printf("Driving: %.4f\n", mph);
    }

}
