package com.company.factory3;

public class BNDeStemController extends FactuurController {
    @Override
    public Factuur maakFactuur() {
        return new BNDeStemFactuur();
    }
}
