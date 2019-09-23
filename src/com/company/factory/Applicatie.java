package com.company.factory;

import java.util.ArrayList;
import java.util.List;

abstract class Applicatie {
    private Document d;
    private List<Document> documenten = new ArrayList<>();

    protected Document doc() {
        return d;
    }

    public abstract Document makeDocument();

    public void newDocument() {
        d = makeDocument();
        documenten.add(d);
        d.open();
    }
}
