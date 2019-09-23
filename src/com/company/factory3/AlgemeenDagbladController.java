package com.company.factory3;

public class AlgemeenDagbladController extends FactuurController {
    @Override
    public Factuur maakFactuur() {
        return new AlgemeenDagbladFactuur();
    }
}
