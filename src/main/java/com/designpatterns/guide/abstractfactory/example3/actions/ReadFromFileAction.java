package com.designpatterns.guide.abstractfactory.example3.actions;

public class ReadFromFileAction implements ReadAction {

    @Override
    public String read(String searchQuery) {
        return "Data read from file completed";
    }
}
