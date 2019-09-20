package com.company.observer;

public interface TemperatuurListener {
    default void change(double temperature){

    }

    default void change(){

    }
}
