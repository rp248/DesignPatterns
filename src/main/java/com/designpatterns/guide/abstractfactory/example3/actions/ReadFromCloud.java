package com.designpatterns.guide.abstractfactory.example3.actions;

public class ReadFromCloud implements ReadAction {

    @Override
    public String read(String searchQuery) {
        return "Data read from cloud completed";
    }
}
