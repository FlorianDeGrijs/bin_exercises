package com.company.singleton;

public class Singleton {
    private static Singleton singleton;

    protected Singleton() {
    }

    public static Singleton connect() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }

    public void doSomething() {
        System.out.printf("%.0f\n", Math.random() * 100);
    }
}
