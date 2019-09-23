package com.company.factory;

public class MijnDocument implements Document {
    @Override
    public void open() {
        System.out.println("OPEN");
    }

    @Override
    public void close() {
        System.out.println("CLOSE");
    }

    @Override
    public void save() {
        System.out.println("SAVE");
    }

    @Override
    public void edit() {
        System.out.println("EDIT");
    }
}
