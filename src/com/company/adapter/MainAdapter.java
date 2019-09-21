package com.company.adapter;

public class MainAdapter {
    public static void main(String[] args) {
        Target target = new Adapter(new Adaptee());
        target.speed(25);
        Target target1 = new Kilomiter();
        target1.speed(25);
    }
}
