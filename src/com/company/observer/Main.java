package com.company.observer;

public class Main {
    public static void main(String[] args) {
        SnelheidSubject snelheidSubject = new SnelheidSubject();
        snelheidSubject.insert(snelheid -> {
            System.out.printf("snelheid = %d%n", snelheid);
        });
        /*
        snelheidSubject.insert(new SnelheidListener() {
            @Override
            public void change(int snelheid) {
                System.out.printf("snelheid = %d%n", snelheid);
            }
        });
        */
        snelheidSubject.veranderSnelheid(10);
        snelheidSubject.veranderSnelheid(20);
        snelheidSubject.veranderSnelheid(30);
    }
}
