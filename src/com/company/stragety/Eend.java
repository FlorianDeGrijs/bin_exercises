package com.company.stragety;

public class Eend {
    private VliegGedrag vg;
    private KwaakGedrag kg;

    public Eend(VliegGedrag vg, KwaakGedrag kg) {
        this.vg = vg;
        this.kg = kg;
    }

    public void vliegen() {
        vg.vliegen();
    }

    public void kwaken() {
        kg.kwaken();
    }
}
