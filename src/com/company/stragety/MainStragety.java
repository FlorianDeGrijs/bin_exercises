package com.company.stragety;

public class MainStragety {
    public static void main(String[] args) {
        VliegGedrag vg = new VleugelsVliegen();
        KwaakGedrag kg = new Fluiten();
        Eend eend = new Eend(vg, kg);
        eend.kwaken();
    }
}
