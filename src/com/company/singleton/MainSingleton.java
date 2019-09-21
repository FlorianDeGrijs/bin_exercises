package com.company.singleton;

public class MainSingleton {
    public static void main(String[] args) {
        Singleton s1 = Singleton.connect();
        System.out.println(s1.toString());
        s1.doSomething();

        Singleton s2 = Singleton.connect();
        System.out.println(s2.toString());
        s2.doSomething();

        System.out.println(s1 == s2);
    }
}
