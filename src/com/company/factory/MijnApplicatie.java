package com.company.factory;

public class MijnApplicatie extends Applicatie {
    @Override
    public Document makeDocument() {
        return new MijnDocument();
    }

    public void doeIets() {
        if (doc() == null) {
            newDocument();
        }
        if (doc() != null) {
            doc().edit();
            doc().save();
            doc().close();
        }
    }
}
