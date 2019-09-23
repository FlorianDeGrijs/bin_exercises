package com.company.factory;

public class MainFactory {
    public static void main(String[] args) {
        MijnApplicatie a = new MijnApplicatie();
        Document m = a.makeDocument();

    }
}
