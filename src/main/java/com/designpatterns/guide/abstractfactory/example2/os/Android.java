package com.designpatterns.guide.abstractfactory.example2.os;

public class Android implements Os {

    @Override
    public String getName() {
        return "Oreo";
    }

    @Override
    public int getVersion() {
        return 8;
    }
}
